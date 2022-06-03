package br.com.alexf.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.alexf.aluvery.R
import br.com.alexf.aluvery.extensions.toBrazilianCurrency
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.sampledata.samplePromotionProducts
import coil.compose.AsyncImage

@Composable
fun ProductItem(
    product: Product,
    modifier: Modifier = Modifier
) {
    val imageSize = 80.dp
    Card(
        modifier = modifier
            .heightIn(200.dp)
            .width(150.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
    ) {
        Column {
            Box(
                Modifier
                    .padding(bottom = imageSize / 2)
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(MaterialTheme.colors.primary, MaterialTheme.colors.secondary),
                        )
                    )
                    .fillMaxWidth()
            ) {
                AsyncImage(
                    model = product.image,
                    contentDescription = null,
                    Modifier
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .size(imageSize)
                        .align(Alignment.BottomCenter),
                    placeholder = painterResource(id = R.drawable.placeholder),
                    contentScale = ContentScale.Crop
                )
            }

            Text(
                product.name,
                Modifier.padding(
                    top = 8.dp,
                    start = 8.dp,
                    end = 8.dp
                ),
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold
            )
            Text(
                product.price.toBrazilianCurrency(),
                Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItemPreview() {
    ProductItem(samplePromotionProducts.first())
}