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

        mainVieModel.number.observe(this) {
            binding.showNumberValueButton.text = it.toString()
        }
        mainVieModel.evenOrOdd.observe(this) {
            if (it) {
                binding.even.text = "زوج"
            } else binding.even.text = "فرد"
        }
        binding.addPlusButton.setOnClickListener {
            mainVieModel.setAddNumber()
            mainVieModel.setEvenOrOdd()
        }

    }
}