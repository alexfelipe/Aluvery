package br.com.alexf.aluvery.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alexf.aluvery.R
import br.com.alexf.aluvery.extensions.toBrazilianCurrency
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.sampledata.sampleAllProducts
import coil.compose.AsyncImage

@Composable
fun ProductsItemWithDetails(
    product: Product,
    expanded: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { }
) {
    Card(
        modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = 4.dp
    ) {
        Column {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                Modifier
                    .height(120.dp)
                    .fillMaxWidth(),
                placeholder = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = product.name,
                    Modifier
                        .fillMaxWidth(),
                    fontSize = 24.sp
                )
                Text(
                    text = product.price.toBrazilianCurrency(),
                    Modifier
                        .fillMaxWidth(),
                    fontSize = 18.sp
                )
                AnimatedVisibility(
                    visible = expanded,
                    Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = product.description,
                        Modifier.padding(top = 8.dp),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun ProductsItemWithDetailsExpandedPreview() {
    ProductsItemWithDetails(product = sampleAllProducts.first(), expanded = true)
}

@Preview
@Composable
fun ProductsItemWithDetailsNonExpandedPreview() {
    ProductsItemWithDetails(product = sampleAllProducts.first(), expanded = false)
}