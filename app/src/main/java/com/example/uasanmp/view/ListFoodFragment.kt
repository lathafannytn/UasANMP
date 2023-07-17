package com.example.uasanmp.view

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uasanmp.R
import com.example.uasanmp.util.foodArray
import com.example.uasanmp.viewmodel.FoodViewModel
import kotlinx.android.synthetic.main.fragment_list_food.*


class ListFoodFragment : Fragment() {
    companion object{
        val EXTRA_FOOD = "FOOD"
    }
    private lateinit var viewModel: FoodViewModel
    private val foodListAdapter = FoodListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(FoodViewModel::class.java)


        var sharedFile = requireActivity().packageName
        var shared: SharedPreferences = requireActivity().getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        var isFoodStored = shared.getString(EXTRA_FOOD, "")
        isFoodStored?.let {
            if (it.isEmpty()){
                val list= foodArray
                viewModel.addFood(list.toList())
                var editor: SharedPreferences.Editor = shared.edit()
                editor.putString(EXTRA_FOOD,"yes")
                editor.apply()
            }
        }
        var savedUsername = shared.getString(SignInFragment.EXTRA_USERNAME, "")
        savedUsername?.let {
            if (savedUsername!!.isNotEmpty()){
                viewModel.refresh()

                recyclerViewListFood.layoutManager = LinearLayoutManager(context)
                recyclerViewListFood.adapter = foodListAdapter
                observeViewModel()
            }else{
                val action =ListFoodFragmentDirections.actionFoodToSignInFragment()
                val navController = Navigation.findNavController(view)

                navController.navigate(action)
            }
        }
    }

    fun observeViewModel(){
        viewModel.foodsLD.observe(viewLifecycleOwner, Observer {
            foodListAdapter.updateTodoList(it)
        })
    }
}