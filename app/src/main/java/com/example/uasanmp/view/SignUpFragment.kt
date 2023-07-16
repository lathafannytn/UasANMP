package com.example.uasanmp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uasanmp.R
import com.example.uasanmp.databinding.FragmentSignUpBinding
import com.example.uasanmp.model.User
import com.example.uasanmp.viewmodel.UserViewModel


class SignUpFragment : Fragment(), ButtonSignUpListener, TextSignInListener {
    private lateinit var viewModel:UserViewModel
    private lateinit var dataBinding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        dataBinding.user = User("","","","",1000000)
        dataBinding.signuplistener = this
        dataBinding.signinlistener = this
    }

    override fun onButtonSignUp(v: View) {
        val list = listOf(dataBinding.user!!)
        viewModel.signUp(list)

        Toast.makeText(v.context, "Sign Up succeed", Toast.LENGTH_SHORT).show()
        val action = SignUpFragmentDirections.actionSignInFragment()
        Navigation.findNavController(v).navigate(action)
    }

    override fun onTextSignIn(v: View) {
        val action = SignUpFragmentDirections.actionSignInFragment()
        Navigation.findNavController(v).navigate(action)
    }
}