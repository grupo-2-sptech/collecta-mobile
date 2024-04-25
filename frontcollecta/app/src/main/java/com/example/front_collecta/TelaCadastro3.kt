package com.example.front_collecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaCadastro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_ong_pt1)

        findViewById<Button>(R.id.btProx).setOnClickListener{
            pt2()
        }
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            voltar()
        }
    }
    private fun voltar(){
        val intent = Intent(this, FormLogin::class.java)
        startActivity(intent)
    }
    private fun pt2(){
        val intent = Intent(this, TelaCadastro4::class.java)
        startActivity(intent)
    }
}