package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val args = PasswordFragmentArgs.fromBundle(requireArguments())
        binding.continueButton.setOnClickListener {
            //val password = binding.password.text.toString()
           // val repeatPassword = binding.repeatPassword.text.toString()
            //val action = PasswordFragmentDirections.actionThirdFragmentToFourthFragment(
                //args.email, args.verificationCode, password, repeatPassword)
            findNavController().navigate(R.id.action_passwordFragment_to_infoFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
