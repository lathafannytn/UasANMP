package com.example.uasanmp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.uasanmp.model.User
import com.example.uasanmp.util.buildDB
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class UserViewModel(application: Application): AndroidViewModel(application), CoroutineScope {
    var userLD = MutableLiveData<User>()

    fun signUp(list: List<User>){
        launch {
            val db = buildDB(getApplication())
            db.userDao().insertAll(*list.toTypedArray())
        }
    }

    fun signIn(username:String, password:String){
        launch {
            val db = buildDB(getApplication())
            userLD.postValue(db.userDao().selectUser(username,password))
        }

    }


    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.IO
}