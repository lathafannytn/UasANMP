package com.example.uasanmp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.uasanmp.R
import com.example.uasanmp.databinding.HistoryItemLayoutBinding
import com.example.uasanmp.model.Food
import com.example.uasanmp.model.Order
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class HistoryListAdapter(val historyList: ArrayList<Order>):RecyclerView.Adapter<HistoryListAdapter.HistoryViewHolder>(),
    HistoryCardListener {
    class HistoryViewHolder(var view:HistoryItemLayoutBinding): RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<HistoryItemLayoutBinding>(inflater, R.layout.history_item_layout,parent,false)
        return HistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.view.order = historyList[position]
        val timestamp: Long = historyList[position].tanggal.toLong() * 1000
        val instant = Instant.ofEpochMilli(timestamp)
        val zoneId = ZoneId.of("Asia/Jakarta")

        val dateTime = LocalDateTime.ofInstant(instant, zoneId)

        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a")
        val formattedDate = dateTime.format(formatter)
        holder.view.tanggal = formattedDate
        holder.view.cardlistener = this
    }

    override fun getItemCount(): Int = historyList.size

    fun updateHistoryList(newHistoryList: List<Order>){
        historyList.clear()
        historyList.addAll(newHistoryList)
        notifyDataSetChanged()
    }

    override fun onHistoryCard(v: View) {
        val idorder = v.tag.toString().toInt()
        val action = HistoryFragmentDirections.actionDetailHistory(idorder)
        Navigation.findNavController(v).navigate(action)
    }
}