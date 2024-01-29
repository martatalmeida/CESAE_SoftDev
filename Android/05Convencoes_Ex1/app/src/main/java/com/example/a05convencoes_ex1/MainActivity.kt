package com.example.a05convencoes_ex1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05convencoes_ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonClicar.setOnClickListener{
            binding.textView.text = "Botão clicado"
        }

        binding.buttonActivity.setOnClickListener{
        val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}