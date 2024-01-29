package com.example.firstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()

            var reais : Double = euros*4.4
            reais = String.format("%.2f", reais).toDouble()
            val toast = Toast.makeText(this,"$reais R$", Toast.LENGTH_SHORT)
            toast.show();
        }

        binding.buttonDolar.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()

            var dolares : Double = euros*1.2
            dolares = String.format("%.2f", dolares).toDouble()
            val toast = Toast.makeText(this,"$dolares $",Toast.LENGTH_SHORT)
            toast.show();
        }

        binding.buttonPeso.setOnClickListener{
            var euros: Double = binding.editValorEuros.text.toString().toDouble()

            var pesos : Double = euros*31.5
            pesos = String.format("%.2f", pesos).toDouble()
            val toast = Toast.makeText(this,"$pesos M$",Toast.LENGTH_SHORT)
            toast.show();
        }
    }




}


