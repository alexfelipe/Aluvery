package br.com.alexf.aluvery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
    products: List<Product>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(
        horizontal = 16.dp,
        vertical = 8.dp
    )
) {
    Column(modifier) {
        Text(
            text = title,
            Modifier.padding(
                contentPadding
            ),
            fontSize = 20.sp
        )
        rememberScrollState()
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = contentPadding,
        ) {
            items(products) { product ->
                ProductItem(
                    product = product
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection("Promoções", sampleProducts)
}
