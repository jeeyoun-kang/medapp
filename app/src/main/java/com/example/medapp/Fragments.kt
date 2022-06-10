package com.example.myapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.medapp.Page1Activity
import com.example.medapp.R
import com.example.medapp.SecondActivity
import com.example.medapp.databinding.*
import java.util.ArrayList


//class MyDialogFragment : DialogFragment() {
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return AlertDialog.Builder(requireContext()).apply{
 //           setTitle("Dialog Title")
 //           setPositiveButton("Ok"){ dialog, id->println("Ok")}
//        }.create()
//    }
//}
class HomeFragment : Fragment(R.layout.fragment_one){


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentOneBinding.bind(view)
        binding.textView2.text = "HomeFragment"
        binding.button1.setOnClickListener() {
            val intent = Intent(getActivity(), SecondActivity::class.java)
            startActivity(intent)
        }

    }
}

class Page1Fragment : Fragment(R.layout.fragment_two){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentTwoBinding.bind(view)
        binding.button.setOnClickListener() {
            val intent = Intent(getActivity(), Page1Activity::class.java)
            startActivity(intent)

        }
    }

}

class Page2Fragment : Fragment(R.layout.fragment_three){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentThreeBinding.bind(view)
        binding.textView4.text = "Page2Fragment"
    }
}

class EndFragment : Fragment(R.layout.fragment_four){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentFourBinding.bind(view)

    }
}





