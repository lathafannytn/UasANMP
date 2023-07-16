package com.example.uasanmp.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uasanmp.R
import com.example.uasanmp.databinding.FragmentSignInBinding
import com.example.uasanmp.model.User
import com.example.uasanmp.viewmodel.UserViewModel

class SignInFragment : Fragment(), ButtonSignInListener, TextSignUpListener {
    companion object{
        val EXTRA_USERNAME = "USERNAME"
    }
    private lateinit var viewModel:UserViewModel
    private lateinit var dataBinding:FragmentSignInBinding
    lateinit var shared: SharedPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_in,container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var sharedFile = requireActivity().packageName
        shared = requireActivity().getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
//        //retrive saved username
//
        var savedUsername = shared.getString(SignInFragment.EXTRA_USERNAME, "")
        savedUsername?.let {
            if (it.isNotEmpty()){
                val action = SignInFragmentDirections.actionListFoodFragment()
                Navigation.findNavController(view).navigate(action)
            }
        }


        dataBinding.user = User("","","","",1000000)
        dataBinding.signinlistener = this
        dataBinding.signuplistener = this

        //save username
//        var editor: SharedPreferences.Editor = shared.edit()
//        editor.putString(EXTRA_USERNAME,username)
//        editor.apply()
    }

    override fun onButtonSignIn(v: View) {
        var objUser:User = dataBinding.user!!
        viewModel.signIn(objUser.username, objUser.password)

        viewModel.userLD.observe(viewLifecycleOwner, Observer {
            if (it == null){
                val alert = AlertDialog.Builder(v.context)
                alert.setTitle("ALERT!")
                alert.setMessage("Username or password does not match out database")
                alert.setPositiveButton("OK") { _,_ ->}
                alert.show()
            }else{
                dataBinding.user = it
                Toast.makeText(v.context, "Sign In Succeed", Toast.LENGTH_SHORT).show()
                var editor: SharedPreferences.Editor = shared.edit()
                editor.putString(EXTRA_USERNAME,it.username)
                editor.apply()
                val action = SignInFragmentDirections.actionListFoodFragment()
                Navigation.findNavController(v).navigate(action)
            }
        })

    }

    override fun onTextSignUp(v: View) {
        val action = SignInFragmentDirections.actionSignUpFragment()
        Navigation.findNavController(v).navigate(action)
    }
}