package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    /* Exercício de Conversão para dolares
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            var euros: Double = binding.editEuros.text.toString().toDouble()

            var dolares : Double = euros*1.08
            dolares = String.format("%.2f", dolares).toDouble()
            binding.textResultado.text = "$dolares $"
        }
    }
    */


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            var nome: String = binding.editNome.text.toString()
            var apelido: String = binding.editApelido.text.toString()

            if (nome.isEmpty() || apelido.isEmpty()){
                binding.textResultado.text = "Nome ou Apelido não inserido"
            } else {
                binding.textResultado.text = "Olá $nome $apelido"
            }
        }
    }

}


