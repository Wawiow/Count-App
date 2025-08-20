package com.example.countapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        //set content view
        setContentView(binding.root)

        with(binding){
            textNumber.text = number.toString()
            btnCount.setOnClickListener {
                number ++
                textNumber.text = number.toString()
            }

            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity,"count $number", Toast.LENGTH_SHORT).show()
            }
        }


    }
}