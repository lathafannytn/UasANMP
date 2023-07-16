package com.example.uasanmp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @ColumnInfo(name = "username")
    var username:String,
    @ColumnInfo(name = "password")
    var password:String,
    @ColumnInfo(name = "fullname")
    var fullname:String,
    @ColumnInfo(name = "phonenumber")
    var phonenumber:String,
    @ColumnInfo(name = "saldo", defaultValue = "1000000")
    var saldo:Int
){
    @PrimaryKey(autoGenerate = true)
    var iduser:Int = 0
}
@Entity
data class Food(
    @ColumnInfo(name = "nama")
    var nama:String,
    @ColumnInfo(name = "harga")
    var harga:Int,
    @ColumnInfo(name = "deskripsi")
    var deskripsi:String,
    @ColumnInfo(name = "kategori")
    var kategori:String,
    @ColumnInfo(name = "photourl")
    var photourl:String,
){
    @PrimaryKey(autoGenerate = true)
    var idfood:Int = 0
}

@Entity
data class Order(
    @ColumnInfo(name = "iduser")
    var iduser:Int,
    @ColumnInfo(name = "idfood")
    var idfood:Int,
    @ColumnInfo(name = "jumlah")
    var jumlah:Int,
    @ColumnInfo(name = "harga")
    var harga:Int,
    @ColumnInfo(name = "totalharga")
    var totalharga:Int,
    @ColumnInfo(name = "namapembeli")
    var namapembeli:String,
    @ColumnInfo(name = "alamatkirim")
    var alamatkirim:String,
    @ColumnInfo(name = "tanggal")
    var tanggal:Int,
    @ColumnInfo(name = "nama")
    var nama:String,
    @ColumnInfo(name = "photourl")
    var photourl:String,
){
    @PrimaryKey(autoGenerate = true)
    var idorder:Int = 0
}