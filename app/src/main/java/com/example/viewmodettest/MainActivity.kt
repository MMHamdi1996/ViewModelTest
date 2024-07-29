package com.example.viewmodettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var number = 0
        binding.addButton.setOnClickListener {
            number++
            binding.numberTextView.text = number.toString()
        }
    }
}