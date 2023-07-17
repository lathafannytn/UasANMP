package com.example.uasanmp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.uasanmp.model.Order
import com.example.uasanmp.util.buildDB
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class OrderViewModel(application:Application):AndroidViewModel(application), CoroutineScope {
    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.IO

    val ordersLD = MutableLiveData<List<Order>>()
    val orderLD = MutableLiveData<Order>()

    fun addOrder(list:List<Order>){
        launch{
            val db = buildDB(getApplication())
            db.orderDao().insertAll(*list.toTypedArray())
        }
    }

    fun fetch(idorder:Int){
        launch {
            val db = buildDB(getApplication())
            orderLD.postValue(db.orderDao().selectOrder(idorder))
        }
    }
    fun refresh(iduser:Int){
        launch {
            val db = buildDB(getApplication())
            ordersLD.postValue(db.orderDao().selectUserOrder(iduser))
        }
    }
}