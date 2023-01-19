package com.example.ejercicio8_pantallarazas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio8_pantallarazas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cambiarImagenes(binding)
    }

    fun cambiarImagenes(binding: ActivityMainBinding){
        var cadena=""

        binding.guerrero.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.guerrero)
            cadena="Guerrero"
        }
        binding.mago.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.mago)
            cadena="Mago"
        }

        binding.ladron.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.ladron)
            cadena="Ladron"
        }

        binding.clerigo.setOnClickListener{
            binding.imageView.setImageResource(R.drawable.clerigo)
            cadena="Clerigo"
        }

        binding.aceptar.setOnClickListener {
            val intent= Intent(this, Razas::class.java)
            intent.putExtra("CLASE", cadena)
            startActivity(intent)
        }

    }
}