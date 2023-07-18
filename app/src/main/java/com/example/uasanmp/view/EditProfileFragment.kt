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
import com.example.uasanmp.model.User
import com.example.uasanmp.viewmodel.UserViewModel


class EditProfileFragment : Fragment() {
    private lateinit var viewModel: UserViewModel
    private lateinit var dataBinding:FragmentEditProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_edit_profile, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        dataBinding.savelistener = this

        val username = EditProfileFragmentArgs.fromBundle(requireArguments()).username
        viewModel.fetch(username)

        observeViewModel()
    }

    fun observeViewModel() {
        viewModel.userLD.observe(viewLifecycleOwner, Observer {
            dataBinding.user = it
        })
    }

    override fun onButtonSaveChangeEditProfile(v: View, obj: User) {
        viewModel.update(obj.fullname,obj.phonenumber,obj.password, obj.iduser)
        Toast.makeText(v.context, "Profile updated", Toast.LENGTH_SHORT).show()
        Navigation.findNavController(v).popBackStack()
    }
}