package com.example.front_collecta.data.usuario

import java.util.UUID

data class ContaTokenDTO(
    val id: UUID,
    val email: String,
    val tipoConta: TipoConta,
    val token: String
)
