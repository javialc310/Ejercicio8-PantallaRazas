package com.example.ejercicio8_pantallarazas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio8_pantallarazas.databinding.ActivityRazasBinding

class Razas : AppCompatActivity() {
    private lateinit var binding: ActivityRazasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRazasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cambiarImagenes(binding)
    }

    fun cambiarImagenes(binding: ActivityRazasBinding){
        var cadena=""

        binding.humano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.hombre)
            cadena="Humano"
        }
        binding.elfo.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.elfo)
            cadena="Elfo"
        }

        binding.enano.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.enano)
            cadena="Enano"
        }

        binding.goblin.setOnClickListener{
            binding.imageView2.setImageResource(R.drawable.goblin)
            cadena="Goblin"
        }

        binding.aceptar2.setOnClickListener {
            val clase = intent.getStringExtra("CLASE")
            val intent2= Intent(this, Resumen::class.java)
            intent2.putExtra("RAZA", cadena)
            intent2.putExtra("CLASE", clase)
            startActivity(intent2)
        }

    }
}