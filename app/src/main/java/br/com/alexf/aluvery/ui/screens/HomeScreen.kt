package br.com.alexf.aluvery.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.sampledata.sampleAllProducts
import br.com.alexf.aluvery.sampledata.sampleCandies
import br.com.alexf.aluvery.sampledata.sampleDrinks
import br.com.alexf.aluvery.sampledata.samplePromotionProducts
import br.com.alexf.aluvery.ui.components.ProductItem
import br.com.alexf.aluvery.ui.components.ProductsItemWithDetails
import br.com.alexf.aluvery.ui.components.SearchTextField

@Composable
fun HomeScreen() {
    var searchText by remember {
        mutableStateOf("")
    }
    HomeScreen(
        searchText,
        onSearchTextChange = {
            searchText = it
        }
    )
}

@Composable
fun HomeScreen(
    searchText: String,
    onSearchTextChange: (String) -> Unit = {}
) {
    Column {
        SearchTextField(
            onValueChange = onSearchTextChange,
            Modifier.padding(8.dp)
        )
        LazyColumn {
            if (searchText.isEmpty()) {
                item {

                    ProductsSection("Promoções", samplePromotionProducts)
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Black.copy(0.1f))
                    )
                    ProductsSection("Bebidas", sampleDrinks)
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Black.copy(0.1f))
                    )
                    ProductsSection("Doces", sampleCandies)
                }
            } else {
                val products = sampleAllProducts.filter {
                    val textInUpperCase = searchText
                        .toUpperCase(Locale.current)
                    val name = it.name.toUpperCase(Locale.current)
                    val description = it.description.toUpperCase(Locale.current)
                    name.contains(textInUpperCase) or description.contains(textInUpperCase)
                }
                items(products) { product ->
                    var expanded by rememberSaveable {
                        mutableStateOf(false)
                    }
                    ProductsItemWithDetails(
                        product,
                        expanded,
                        Modifier.padding(8.dp),
                        onClick = {
                            expanded = !expanded
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun ProductsSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            title,
            Modifier.padding(8.dp),
            style = MaterialTheme.typography.h6
        )
        LazyRow {
            items(products) { product ->
                ProductItem(
                    product,
                    Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductsSection("Promoções", samplePromotionProducts)
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Preview(showBackground = true)
@Composable
fun HomeScreenWithSearchTextFieldFilledPreview() {
    HomeScreen(searchText = "a")
}




