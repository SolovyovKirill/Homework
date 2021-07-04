package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.homework10.CandyActivity
import com.example.myapplication.homework6.FlagsActivity
import com.example.myapplication.homework7.CounterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomework6.setOnClickListener {
            startActivity(Intent(this, FlagsActivity::class.java))
        }
        binding.btnHomework7.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
        binding.btnHomework10.setOnClickListener {
            startActivity(Intent(this, CandyActivity::class.java))
        }
    }
}