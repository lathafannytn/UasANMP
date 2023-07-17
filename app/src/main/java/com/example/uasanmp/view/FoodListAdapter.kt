package com.example.uasanmp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.uasanmp.R
import com.example.uasanmp.databinding.FoodItemLayoutBinding
import com.example.uasanmp.model.Food


class FoodListAdapter(val foodList:ArrayList<Food>): RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>(),
    FoodCardListener {
    class FoodViewHolder(var view: FoodItemLayoutBinding):RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<FoodItemLayoutBinding>(inflater, R.layout.food_item_layout,parent,false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.view.food = foodList[position]
        holder.view.foodcardlistener = this
    }

    override fun getItemCount(): Int = foodList.size

    fun updateTodoList(newFoodList: List<Food>){
        foodList.clear()
        foodList.addAll(newFoodList)
        notifyDataSetChanged()
    }

    override fun onFoodCard(v: View) {
        val action = ListFoodFragmentDirections.actionDetailFood(v.tag.toString().toInt())
        Navigation.findNavController(v).navigate(action)
    }
}