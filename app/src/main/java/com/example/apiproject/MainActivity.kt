package com.example.apiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apiproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val randomFactAPI = RetrofitHelper.getInstance().create(FactService::class.java)
        val randomFactCall = randomFactAPI.getRandomFact()
        val dailyFactCall = randomFactAPI.getTodayFact()

        binding.textViewMainDaily.text = randomFactCall
        binding.textViewMainRandom.text = dailyFactCall

        binding.buttonMainNew.setOnClickListener {
            binding.textViewMainDaily.text = randomFactCall
        }
    }
}