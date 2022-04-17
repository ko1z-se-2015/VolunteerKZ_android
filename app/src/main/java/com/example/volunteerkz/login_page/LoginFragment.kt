package com.example.volunteerkz.login_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.volunteerkz.R
import com.example.volunteerkz.databinding.LoginFragmentBinding


class LoginFragment : Fragment() {

    lateinit var binding: LoginFragmentBinding

    private lateinit var fragmentViewModel: LoginFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvCreate.setOnClickListener {
           view.findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
    }

}