package com.example.uasanmp.model

import androidx.room.*

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg food: Food)

    @Query("SELECT * FROM food")
    fun selectAllFood(): List<Food>

    @Query("SELECT * FROM food WHERE idfood= :id")
    fun selectFood(id:Int):Food

    @Query("UPDATE food SET nama =:nama, deskripsi =:deskripsi, harga =:harga, kategori = :kategori WHERE idfood=:id")
    fun foodUpdate(nama:String,deskripsi:String,harga:Int,kategori:String,id:Int)

    @Delete
    fun deleteFood(food: Food)
}