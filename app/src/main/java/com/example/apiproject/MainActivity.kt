package com.example.apiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apiproject.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val randomFactAPI = RetrofitHelper.getInstance().create(FactService::class.java)
        val randomFactCall = randomFactAPI.getRandomFact()
        val dailyFactCall = randomFactAPI.getTodayFact()

        val randomFoxAPI = RetrofitHelperFox.getInstance().create(FactService::class.java)
        val randomFoxDailyCall = randomFoxAPI.getFox()
        val randomFoxUnlimitedCall = randomFoxAPI.getFoxUnlimited()

        binding.textViewMainDaily.text = randomFactCall
        binding.textViewMainRandom.text = dailyFactCall

        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);


        binding.buttonMainNew.setOnClickListener {
            binding.textViewMainRandom.text = randomFactCall
            binding.imageViewMainUnlimited.Pic
            binding.imageViewMainDaily.load(randomFoxDailyCall)
        }
    }
}