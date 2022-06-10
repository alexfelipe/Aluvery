package br.com.alexf.aluvery.ui.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.alexf.aluvery.sampledata.sampleProducts
import br.com.alexf.aluvery.ui.components.ProductSection

@Composable
fun HomeScreen() {
    val items = List(10000) {
        "$it"
    }
    Column(Modifier.verticalScroll(ScrollState(0))) {
        for (item in items) {
            ProductSection(title = item, products = sampleProducts)
        }
    }
}

@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
