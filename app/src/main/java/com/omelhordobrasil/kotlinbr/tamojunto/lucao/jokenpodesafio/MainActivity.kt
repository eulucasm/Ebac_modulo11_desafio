package com.omelhordobrasil.kotlinbr.tamojunto.lucao.jokenpodesafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omelhordobrasil.kotlinbr.tamojunto.lucao.jokenpodesafio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAppBar()
        iniciarGame()
    }

    private fun setupAppBar(){
        setSupportActionBar(binding.toolbarIniciar)
        supportActionBar?.title = "Jokenpô"
    }

    private fun iniciarGame(){
        binding.iniciarButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}