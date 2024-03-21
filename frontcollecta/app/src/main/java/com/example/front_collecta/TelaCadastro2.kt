package com.example.front_collecta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaCadastro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_contribuidor_pt2)

        findViewById<Button>(R.id.btProx).setOnClickListener{
            pt2()
        }
    }
    private fun pt2(){
        val intent = Intent(this, TelaCadastro3::class.java)
        startActivity(intent)
    }
}