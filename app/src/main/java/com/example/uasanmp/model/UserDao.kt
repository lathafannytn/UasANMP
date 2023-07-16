package com.example.uasanmp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg user: User)

    @Query("SELECT * FROM user")
    fun selectAllUser(): List<User>

    @Query("SELECT * FROM user WHERE username= :username AND password=:password")
    fun selectUser(username:String,password:String):User

    @Query("SELECT * FROM user WHERE username= :username")
    fun selectProfile(username:String):User

    @Query("UPDATE user SET fullname =:fullname, phonenumber =:phonenumber, password =:password WHERE iduser=:id")
    fun userUpdate(fullname:String,phonenumber:String,password:String,id:Int)

    @Query("UPDATE user SET saldo =:saldo WHERE iduser=:id")
    fun updateSaldo(saldo:Int,id:Int)

    @Delete
    fun deleteUser(user: User)
}