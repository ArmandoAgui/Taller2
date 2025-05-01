package com.pdmtaller2.c00174323_Armando_Aguilar.model

data class Restaurante(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val categoria: String,
    val imagenUrl: String,
    val menu: List<Platillo>
)
