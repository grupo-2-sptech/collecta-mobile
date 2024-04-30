package com.example.front_collecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.compose.ui.platform.LocalContext
import com.example.front_collecta.api.RetrofitInstace
import com.example.front_collecta.api.endpoints.UsuarioApiService
import com.example.front_collecta.data.PreferencesManager
import com.example.front_collecta.data.usuario.ContaLoginDTO
import com.example.front_collecta.data.usuario.ContaTokenDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        TRANSAFORMAR EM COMPOSABLE, PARA USAR NA FUNÇÃO DO PREFERENCESMANAGER
//        val contexto = LocalContext.current
        setContentView(R.layout.activity_form_login)
        val usuarioApiService = RetrofitInstace.getUsuarioApiService()
        supportActionBar?.hide()

        val btnEntrar: Button = findViewById(R.id.btn_entrar)

        btnEntrar.setOnClickListener {

            val intent = Intent(this, FormHome::class.java)

            val credenciais = ContaLoginDTO(
                email = "cristhian.silva@sptech.school",
                senha = "@Titila123"
            )
            usuarioApiService.login(credenciais).enqueue(object : Callback<ContaTokenDTO> {
                override fun onResponse(call: Call<ContaTokenDTO>, response: Response<ContaTokenDTO>) {
                    if (response.isSuccessful) {
                        val contaTokenDTO = response.body()

                        //salvar as informações no  "cache" do app
//                        val prefsManager = PreferencesManager.getInstance(contexto)
//                        println("Token salvo: ${prefsManager.getToken()}")
//                        println("Nome salvo: ${prefsManager.getName()}")
                        startActivity(intent)
                        println(contaTokenDTO)
                    } else {
                        println("Deu ruim")
                    }
                }

                override fun onFailure(call: Call<ContaTokenDTO>, t: Throwable) {
                    println(t)
                }
            })
        }

        val btnCadastrar: Button = findViewById(R.id.btn_selecionar_cadastrar)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this, TelaCadastro::class.java)
            startActivity(intent)
        }
    }
}