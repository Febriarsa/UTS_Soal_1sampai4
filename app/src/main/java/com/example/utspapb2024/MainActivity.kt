package com.example.utspapb2024

import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utspapb2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgProfile.setImageResource(R.drawable.baseline_account_circle_24)

        binding.btnKeluar.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.getStringExtra("NAME")

            startActivity(intent)

            Toast.makeText(this, "Anda telah keluar", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}

