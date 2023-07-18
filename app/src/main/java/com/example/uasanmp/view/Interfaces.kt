package com.example.uasanmp.view

import android.view.View
import com.example.uasanmp.model.Food
import com.example.uasanmp.model.User

interface ButtonSignUpListener{
    fun onButtonSignUp(v: View)
}

interface TextSignInListener{
    fun onTextSignIn(v:View)
}

interface ButtonSignInListener{
    fun onButtonSignIn(v:View)
}

interface TextSignUpListener{
    fun onTextSignUp(v:View)
}


interface FoodCardListener{
    fun onFoodCard(v:View)
}

interface BuyButtonListener{
    fun onBuyButton(v:View, obj:Food, jumlah:Int,namapembeli:String,alamatkirim:String)
}

interface AddQtyListener{
    fun onAddQty(v:View)
}

interface MinQtyListener{
    fun onMinQty(v:View)
}

interface ButtonEditProfileListener{
    fun onButtonEditProfile(v:View)
}

interface ButtonSaveChangeEditProfileListener{
    fun onButtonSaveChangeEditProfile(v:View, obj:User)
}

interface ButtonLogoutListener {
    fun onButtonLogout(v:View)
}

