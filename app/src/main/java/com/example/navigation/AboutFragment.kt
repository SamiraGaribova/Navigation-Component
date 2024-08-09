package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigation.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val args = AboutFragmentArgs.fromBundle(requireArguments())
//        binding.textViewName.text = "Name: ${args.name}"
//        binding.textViewSurname.text = "Surname: ${args.surname}"
//        binding.textViewEmail.text = "Email: ${args.email}"
//        binding.textViewPassword.text = "Password: ${args.password}"
//        binding.textViewGender.text = "Gender: ${args.gender}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
