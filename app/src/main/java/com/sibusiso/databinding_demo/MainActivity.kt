package com.sibusiso.databinding_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sibusiso.databinding_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener{
            greetingMessage()
        }
    }

    private fun greetingMessage() {
        //binding.textView.text = binding.editTextPersonName.text
        binding.user.name = binding.editTextPersonName.text.toString()
    }
}