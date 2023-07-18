package com.example.uasanmp.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uasanmp.R
import com.example.uasanmp.viewmodel.FoodViewModel
import com.example.uasanmp.viewmodel.OrderViewModel
import com.example.uasanmp.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.fragment_history.*

class HistoryFragment : Fragment() {
    private lateinit var viewModel: OrderViewModel
    private lateinit var userViewModel: UserViewModel
    private lateinit var foodViewModel: FoodViewModel
    private val historyListAdapter = HistoryListAdapter(arrayListOf())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        userViewModel= ViewModelProvider(this).get(UserViewModel::class.java)
        foodViewModel = ViewModelProvider(this).get(FoodViewModel::class.java)

        var sharedFile = requireActivity().packageName
        var shared: SharedPreferences = requireActivity().getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        var savedUsername = shared.getString(SignInFragment.EXTRA_USERNAME, "")
        if (savedUsername!!.isNotEmpty()){
            userViewModel.fetch(savedUsername!!)
            recyclerViewHistory.layoutManager = LinearLayoutManager(context)
            recyclerViewHistory.adapter = historyListAdapter

            observeViewModel()
        }else{
            Navigation.findNavController(view).navigate(HistoryFragmentDirections.actionHistoryToSignIn())
        }
    }

    fun observeViewModel(){
        userViewModel.userLD.observe(viewLifecycleOwner, Observer { it ->
            viewModel.refresh(it.iduser)
            viewModel.ordersLD.observe(viewLifecycleOwner, Observer { itOrder ->
                historyListAdapter.updateHistoryList(itOrder)
            })
        })
    }
}