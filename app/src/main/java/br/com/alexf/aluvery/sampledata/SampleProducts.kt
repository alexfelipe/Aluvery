package br.com.alexf.aluvery.sampledata

import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.model.SectionWithProducts
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        image = "https://images.pexels.com/photos/1639557/pexels-photo-1639557.jpeg",
        price = BigDecimal("14.99")
    ),
    Product(
        name = "Pizza",
        image = "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg",
        price = BigDecimal("18.99")
    ),
    Product(
        name = "Batata frita",
        image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
        price = BigDecimal("9.99")
    )
)

val sampleSectionWithProducts = listOf(
    SectionWithProducts("Promoções", sampleProducts),
    SectionWithProducts("Doces", sampleProducts),
    SectionWithProducts("Comidas típicas", sampleProducts),
    SectionWithProducts("Bebidas", sampleProducts),
    SectionWithProducts("Porções", sampleProducts),
)