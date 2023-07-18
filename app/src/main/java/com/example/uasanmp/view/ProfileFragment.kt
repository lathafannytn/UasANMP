package com.example.uasanmp.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uasanmp.R
import com.example.uasanmp.viewmodel.UserViewModel


class ProfileFragment : Fragment() {
    private lateinit var viewModel: UserViewModel
    private lateinit var dataBinding: FragmentProfileBinding
    var savedUsername:String?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate<FragmentProfileBinding>(inflater, R.layout.fragment_profile,container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        dataBinding.editbuttonlistener = this
        dataBinding.logoutlistener = this
        var sharedFile = requireActivity().packageName
        var shared: SharedPreferences = requireActivity().getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        savedUsername = shared.getString(SignInFragment.EXTRA_USERNAME, "")
        savedUsername?.let {
            if (savedUsername!!.isNotEmpty()){
                viewModel.fetch(savedUsername!!)
                observeViewModel()
            }else{
                Navigation.findNavController(view).navigate(ProfileFragmentDirections.actionLogout())
            }
        }
    }

    fun observeViewModel() {
        viewModel.userLD.observe(viewLifecycleOwner, Observer {
            dataBinding.user = it
            Log.d("User", it.toString())
        })
    }

    override fun onButtonEditProfile(v: View) {
        val action = ProfileFragmentDirections.actionEditProfile(savedUsername!!)
        Navigation.findNavController(v).navigate(action)
    }

    override fun onButtonLogout(v: View) {
        val username = ""
        var sharedFile = activity?.packageName
        var shared: SharedPreferences? = activity?.getSharedPreferences(sharedFile, Context.MODE_PRIVATE)
        var editor: SharedPreferences.Editor? = shared?.edit()
        editor?.putString(SignInFragment.EXTRA_USERNAME,username)
        editor?.apply()
        val action = ProfileFragmentDirections.actionLogout()
        Navigation.findNavController(v).navigate(action)
    }
}