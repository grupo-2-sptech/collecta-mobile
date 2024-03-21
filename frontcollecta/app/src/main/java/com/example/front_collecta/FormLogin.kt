package com.example.front_collecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar?.hide()

        val btnEntrar: Button = findViewById(R.id.btn_entrar)

        btnEntrar.setOnClickListener {
            val intent = Intent(this, FormHome::class.java)
            startActivity(intent)

        }
    }
}