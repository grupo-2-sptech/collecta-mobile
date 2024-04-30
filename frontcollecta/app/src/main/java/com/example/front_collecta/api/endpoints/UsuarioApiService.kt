package com.example.front_collecta.api.endpoints

import com.example.front_collecta.data.usuario.ContaLoginDTO
import com.example.front_collecta.data.usuario.ContaTokenDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UsuarioApiService {

    @POST("api/login")
    fun login(@Body credenciais: ContaLoginDTO): Call<ContaTokenDTO>
}