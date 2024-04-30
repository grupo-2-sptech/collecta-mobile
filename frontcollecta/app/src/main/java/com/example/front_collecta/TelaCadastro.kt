package com.example.front_collecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_contribuidor_pt1)


        findViewById<Button>(R.id.btProx).setOnClickListener{
            pt2() // Chamando a função pt2 diretamente aqui
        }
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            voltar()
        }
        findViewById<TextView>(R.id.TipoConta).setOnClickListener {
            trocar()
        }
    }
    private fun trocar(){
        val intent = Intent(this, Campanha::class.java)
        startActivity(intent)
    }
    private fun voltar(){
        val intent = Intent(this, FormLogin::class.java)
        startActivity(intent)
    }

    private fun pt2(){
        val intent = Intent(this, TelaCadastro2::class.java)
        startActivity(intent)
    }
}