package com.example.a05convencoes_ex2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a05convencoes_ex2.databinding.ActivityLoginOkBinding

class LoginOKActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginOkBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}