package br.com.alexf.aluvery.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.alexf.aluvery.sampledata.sampleProducts
import br.com.alexf.aluvery.ui.components.ProductSection

@Composable
fun HomeScreen() {
    Column {
        ProductSection("Promoções", sampleProducts)
        ProductSection("Doces", sampleProducts)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
