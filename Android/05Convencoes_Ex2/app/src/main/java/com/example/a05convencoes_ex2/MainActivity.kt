package com.example.a05convencoes_ex2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05convencoes_ex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.botaoEntrar.setOnClickListener{
            var username: String = binding.editUsername.text.toString()
            var password: String = binding.editPassword.text.toString()

            if (username.equals("user") && password.equals("pass")){
                val intent = Intent(this, LoginOKActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, LoginErradoActivity::class.java)
                startActivity(intent)
            }

            binding.editUsername.text.clear()
            binding.editPassword.text.clear()
        }

    }
}