package com.example.logicakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.logicakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding()
        changeTextView()
    }

    private fun viewBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun changeTextView() {
        val list = listOf("Gato", "Cachorro", "Capivara")
        var currentItemIndex = 0

        binding.button.setOnClickListener {
            if (currentItemIndex >= list.size) {
                currentItemIndex = 0
            }
            binding.textView.text = list[currentItemIndex]
            currentItemIndex++
        }
    }
}


//Crie um app, de apenas uma tela. Na tela deve ter um TextView e um botão.
//Depois crie uma lista de qualquer coisa, números, strings, e façam uma função/ método que tenha
//a capacidade de percorrer item a item da lista a cada click no botão,
//o click no botão deve atualizar o TextView com o próximo item da lista.