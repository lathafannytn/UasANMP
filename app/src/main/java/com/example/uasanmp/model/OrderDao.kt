package com.example.uasanmp.model

import androidx.room.*

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg order: Order)

    @Query("SELECT * FROM `order`")
    fun selectAllOrder(): List<Order>

    @Query("SELECT * FROM `order` where idorder =:id")
    fun selectOrder(id:Int): Order

    @Query("SELECT * FROM `order` where iduser =:iduser")
    fun selectUserOrder(iduser:Int): List<Order>

    @Query("UPDATE `order` SET iduser=:iduser,idfood=:idfood,namapembeli=:namapembeli,alamatkirim=:alamatkirim,tanggal=:tanggal,harga=:harga,jumlah=:jumlah,totalharga=:totalHarga WHERE idorder=:id")
    fun updateOrder(iduser:Int,idfood:Int,namapembeli:String,alamatkirim:String,tanggal:Int,jumlah:Int,harga:Int,totalHarga:Int,id:Int)

    @Delete
    fun deleteOrder(order: Order)
}