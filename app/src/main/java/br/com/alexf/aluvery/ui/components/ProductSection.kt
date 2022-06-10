package br.com.alexf.aluvery.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.sampledata.sampleProducts

@Composable
fun ProductSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            Modifier.padding(8.dp),
            fontSize = 20.sp
        )
        rememberScrollState()
        Row(Modifier.horizontalScroll(ScrollState(0))) {
            for (product in products) {
                ProductItem(product)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection("Promoções", sampleProducts)
}

