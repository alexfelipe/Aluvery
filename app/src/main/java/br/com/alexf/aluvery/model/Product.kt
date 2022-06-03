package br.com.alexf.aluvery.model

import java.math.BigDecimal

data class Product(
    val name: String,
    val description: String,
    val image: String,
    val price: BigDecimal
)