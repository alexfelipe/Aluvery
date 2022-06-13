package br.com.alexf.aluvery.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.alexf.aluvery.model.SectionWithProducts
import br.com.alexf.aluvery.sampledata.sampleSectionWithProducts
import br.com.alexf.aluvery.ui.components.ProductSection

@Composable
fun HomeScreen(
    sections: List<SectionWithProducts>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        items(sections) { section ->
            ProductSection(
                title = section.title,
                products = section.products
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(sampleSectionWithProducts)
}