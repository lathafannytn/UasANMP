package com.example.uasanmp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.uasanmp.R
import com.example.uasanmp.model.Order
import com.example.uasanmp.viewmodel.OrderViewModel
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter


class DetailHistoryFragment : Fragment() {
    private lateinit var viewModel: OrderViewModel
    private lateinit var dataBinding:FragmentDetailHistoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_detail_history,container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(OrderViewModel::class.java)
        dataBinding.order= Order(0,0,0,0,0,"","",0,"","https://foursquare.com/img/categories/food/default_256.png")
        val orderId = DetailHistoryFragmentArgs.fromBundle(requireArguments()).orderid

        viewModel.fetch(orderId)

        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.orderLD.observe(viewLifecycleOwner, Observer {
            dataBinding.order = it
            val timestamp: Long = it.tanggal.toLong() * 1000
            val instant = Instant.ofEpochMilli(timestamp)
            val zoneId = ZoneId.of("Asia/Jakarta")

            val dateTime = LocalDateTime.ofInstant(instant, zoneId)

            val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a")
            val formattedDate = dateTime.format(formatter)
            dataBinding.tanggal = formattedDate
        })
    }
}