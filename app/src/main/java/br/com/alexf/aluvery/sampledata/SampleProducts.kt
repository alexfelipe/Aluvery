package br.com.alexf.aluvery.sampledata

import br.com.alexf.aluvery.model.Product
import java.math.BigDecimal

val samplePromotionProducts = listOf(
    Product(
        name = "Hamburguer",
        description = "Hamburguer bovino de 200g, com alface, cebola, bacon, cheddar, pickles e molho especial",
        image = "https://images.pexels.com/photos/327158/pexels-photo-327158.jpeg",
        price = BigDecimal("14.99")
    ),
    Product(
        name = "Pizza",
        description = "Pizza de vários sabores e preço único: muçarela, calabresa, portuguesa, frango com catupiry e especial da casa",
        image = "https://images.pexels.com/photos/1082343/pexels-photo-1082343.jpeg",
        price = BigDecimal("19.99")
    ),
    Product(
        name = "Bolo",
        description = "Bolo de vários recheios e preço único: chocolate, prestígio, creme de avelã e doce de leite",
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        price = BigDecimal("12.99")
    ),
    Product(
        name = "Cerveja",
        description = "Cervejas pilsen clara",
        image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
        price = BigDecimal("3.99")
    )
)

val sampleDrinks = listOf(
    Product(
        name = "Cerveja",
        description = "Cervejas pilsen clara",
        image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
        price = BigDecimal("3.99")
    ),
    Product(
        name = "Suco natural",
        description = "Sucos naturais de diferentes sabores: Laranja, Maçã, Uva, Maracujá, Limão e Abacaxi",
        image = "https://images.pexels.com/photos/96974/pexels-photo-96974.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        price = BigDecimal("7.99")
    ),
    Product(
        name = "Refrigerante",
        description = "Refrigerante de vários sabores: cola, laranja, guaraná, uva e limão",
        image = "https://images.pexels.com/photos/104509/pexels-photo-104509.jpeg",
        price = BigDecimal("5.99")
    )
)

val sampleCandies = listOf(
    Product(
        name = "Bolo",
        description = "Bolo de vários recheios e preço único: chocolate, prestígio, creme de avelã e doce de leite",
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        price = BigDecimal("12.99")
    ),
    Product(
        name = "Sorvete",
        description = "Sorvete de massa de vários sabores: morango, chocolate, pistache, flocos, baunilha, napolitano, abacaxi, milho verde e creme",
        image = "https://images.pexels.com/photos/3631/summer-dessert-sweet-ice-cream.jpg",
        price = BigDecimal("9.99")
    ),
    Product(
        name = "Chocolate",
        description = "Chocolate ao leite",
        image = "https://images.pexels.com/photos/7260258/pexels-photo-7260258.jpeg",
        price = BigDecimal("4.49")
    )
)

val sampleAllProducts = (
        samplePromotionProducts +
                sampleDrinks +
                sampleCandies).toSet()
