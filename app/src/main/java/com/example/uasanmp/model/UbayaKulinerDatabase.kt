package com.example.uasanmp.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class, Food::class, Order::class), version = 1)
abstract class UbayaKulinerDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
    abstract fun foodDao():FoodDao
    abstract fun orderDao():OrderDao

    companion object{
        @Volatile private var instance: UbayaKulinerDatabase ?= null
        private val LOCK = Any()

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                UbayaKulinerDatabase::class.java,
                "ubayakuliner"
            ).build()

        operator fun invoke(context: Context){
            if (instance==null){
                synchronized(LOCK){
                    instance ?: buildDatabase(context).also {
                        instance = it
                    }
                }
            }
        }
    }
}