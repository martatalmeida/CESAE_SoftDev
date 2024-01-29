package com.example.linearlayout_ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearlayout_ex4.databinding.ActivityMainBinding

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
               binding.textResultado.text = "Login Válido"
           } else {
               binding.textResultado.text = "Login Inválido"
           }

           binding.editUsername.text.clear()
           binding.editPassword.text.clear()
       }
   }
}
