package com.example.front_collecta

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AlertDialog
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.front_collecta.ui.theme.FrontcollectaTheme

class MainActivity : ComponentActivity() {

    private lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontcollectaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        findViewById<Button>(R.id.btn_selecionar_entrar).setOnClickListener {
            entrarHome()
        }

        val btnCadastrar = findViewById<Button>(R.id.btn_selecionar_cadastrar)
        Log.d("MeuApp", "Botão encontrado: $btnCadastrar")
        btnCadastrar.setOnClickListener {
            cadastro()
        }

    }

    private fun cadastro() {
        Log.d("MeuApp", "Função cadastro() chamada")
        val intent = Intent(this, TelaCadastro::class.java)
        startActivity(intent)
    }


    private fun entrarHome(){
        val intent = Intent(this, FormLogin::class.java)
        startActivity(intent)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FrontcollectaTheme {
        Greeting("Android")
    }
}