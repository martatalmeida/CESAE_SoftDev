package com.example.a05convencoes_ex2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a05convencoes_ex2.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginErradoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val toast = Toast.makeText(this,"Login Errado", Toast.LENGTH_SHORT)
        toast.show();

        binding.botaoVoltar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}