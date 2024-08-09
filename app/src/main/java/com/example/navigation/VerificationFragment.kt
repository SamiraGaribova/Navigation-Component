package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentVerificationBinding

class VerificationFragment : Fragment() {

    private var _binding: FragmentVerificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVerificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val args = VerificationFragmentArgs.fromBundle(requireArguments())
        binding.continueButton1.setOnClickListener {
           //val verificationCode = binding.code.text.toString()
            //val action = VerificationFragmentDirections.actionSecondFragmentToThirdFragment(args.email, verificationCode)
            findNavController().navigate(R.id.action_verificationFragment_to_passwordFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
