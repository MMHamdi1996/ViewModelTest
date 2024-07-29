package com.example.viewmodettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.viewmodettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainVieModel: MainVieModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainVieModel = ViewModelProvider(this)[MainVieModel::class.java]

        binding.numberTextView.text = mainVieModel.number.toString()
        binding.addButton.setOnClickListener {
            mainVieModel.number++
            binding.numberTextView.text = mainVieModel.number.toString()
        }
    }
}