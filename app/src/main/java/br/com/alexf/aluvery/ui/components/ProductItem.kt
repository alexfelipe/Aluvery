package br.com.alexf.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alexf.aluvery.R
import br.com.alexf.aluvery.extensions.toBrazilianCurrency
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.ui.theme.Purple500
import br.com.alexf.aluvery.ui.theme.Teal200
import coil.compose.AsyncImage
import java.math.BigDecimal

@Composable
fun ProductItem(
    product: Product,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier
            .width(200.dp)
            .height(250.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {
            val imageSize = 100.dp
            Box(
                Modifier
                    .heightIn(min = imageSize)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(listOf(Purple500, Teal200))
                    )
            ) {
                AsyncImage(
                    product.image,
                    contentDescription = null,
                    Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(Alignment.BottomCenter),
                    placeholder = painterResource(
                        id = R.drawable.placeholder
                    ),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(imageSize / 2)
            )
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 14.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            name = LoremIpsum(50).values.first(),
            image = "",
            price = BigDecimal("14.99"),
        ),
        modifier = Modifier.padding(16.dp)
    )
}
