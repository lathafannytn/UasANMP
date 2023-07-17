package com.example.uasanmp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.uasanmp.model.Food
import com.example.uasanmp.util.buildDB
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class FoodViewModel(application: Application): AndroidViewModel(application), CoroutineScope {
    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.IO

    val foodsLD = MutableLiveData<List<Food>>()
    val foodLD = MutableLiveData<Food>()

    fun addFood(list:List<Food>){
        launch {
            val db = buildDB(getApplication())
            db.foodDao().insertAll(*list.toTypedArray())
        }
    }

    fun refresh(){
        launch {
            val db = buildDB(getApplication())
            foodsLD.postValue(db.foodDao().selectAllFood())
        }
    }

    fun fetch(idfood:Int){
        launch {
            val db = buildDB(getApplication())
            foodLD.postValue(db.foodDao().selectFood(idfood))
        }
    }
}