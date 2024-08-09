package com.example.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    private var gender: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val args = InfoFragmentArgs.fromBundle(requireArguments())

        binding.save.setOnClickListener {
            val name = binding.name.text.toString()
            val surname = binding.surname.text.toString()
            //val action = InfoFragmentDirections.actionFourthFragmentToDisplayFragment(
                //name, surname, args.email, args.password, gender ?: "Not Selected")
            findNavController().navigate(R.id.action_infoFragment_to_aboutFragment)
        }

        binding.gender.setOnClickListener {
            // Show dialog to select gender
            showGenderDialog()
        }
    }

    private fun showGenderDialog() {
        val genderOptions = arrayOf("Male", "Female")
        AlertDialog.Builder(requireContext())
            .setTitle("Please select gender")
            .setItems(genderOptions) { _, which ->
                gender = genderOptions[which]
                binding.gender.setText(gender)
            }
            .create()
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
