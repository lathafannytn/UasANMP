package com.example.uasanmp.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uasanmp.R
import com.example.uasanmp.databinding.FragmentDetailFoodBinding
import com.example.uasanmp.model.Food
import com.example.uasanmp.model.Order
import com.example.uasanmp.model.User
import com.example.uasanmp.util.NotificationHelper
import com.example.uasanmp.viewmodel.FoodViewModel
import com.example.uasanmp.viewmodel.OrderViewModel
import com.example.uasanmp.viewmodel.UserViewModel
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class DetailFoodFragment : Fragment(), BuyButtonListener, AddQtyListener, MinQtyListener {
    private lateinit var viewModel:FoodViewModel
    private lateinit var userViewModel:UserViewModel
    private lateinit var orderViewModel:OrderViewModel
    private lateinit var dataBinding:FragmentDetailFoodBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail_food,container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(FoodViewModel::class.java)
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        orderViewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        dataBinding.food= Food("",0,"","","https://foursquare.com/img/categories/food/default_256.png")
        dataBinding.jumlah = 1
        dataBinding.namapembeli = ""
        dataBinding.alamatkirim = ""
        dataBinding.buylistener = this
        dataBinding.addlistener = this
        dataBinding.minlistener = this
        val idfood = DetailFoodFragmentArgs.fromBundle(requireArguments()).idfood
        viewModel.fetch(idfood)
        observeViewModel()
    }

    fun observeViewModel(){
        viewModel.foodLD.observe(viewLifecycleOwner, Observer {
            dataBinding.food = it
        })
    }

    override fun onBuyButton(v: View,obj:Food,jumlah:Int,namapembeli:String,alamatkirim:String) {
        var sharedFile = requireActivity().packageName
        var shared: SharedPreferences = requireActivity().getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        var savedUsername = shared.getString(SignInFragment.EXTRA_USERNAME, "")

        userViewModel.fetch(savedUsername!!)
        var iduser = 0
        var user: User? = null
        userViewModel.userLD.observe(viewLifecycleOwner, Observer {
            iduser = it.iduser
            user = it
        })


        val totalHarga = obj.harga * jumlah

        user?.let {
            if (it.saldo > totalHarga){
                val saldobaru = it.saldo - totalHarga
                userViewModel.updateSaldo(saldobaru,iduser)
                val zoneId = ZoneId.of("Asia/Jakarta")
                val zonedDateTime = ZonedDateTime.now(zoneId)
                val timestampInt = zonedDateTime.toEpochSecond().toInt()

                val list = listOf(Order(iduser,obj.idfood,jumlah,obj.harga,totalHarga,namapembeli,alamatkirim,timestampInt,obj.nama,obj.photourl))
                orderViewModel.addOrder(list)
                NotificationHelper(v.context)
                .createNotification("Berhasil", "Makanan sudah dipesan! Silahkan menunggu")
                Navigation.findNavController(v).popBackStack()
            }else{
                val alert = AlertDialog.Builder(v.context)
                alert.setTitle("ALERT!")
                alert.setMessage("Saldo tidak cukup!")
                alert.setPositiveButton("OK") { _,_ ->}
                alert.show()
            }
        }



    }

    override fun onAddQty(v: View) {
        var jumlah = dataBinding.jumlah!!
        jumlah += 1
        dataBinding.jumlah = jumlah
    }

    override fun onMinQty(v: View) {
        var jumlah = dataBinding.jumlah!!
        if (jumlah > 1){
            jumlah -= 1
            dataBinding.jumlah = jumlah
        }
    }
}