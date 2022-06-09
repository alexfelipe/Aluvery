package br.com.alexf.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alexf.aluvery.model.Product
import br.com.alexf.aluvery.ui.theme.Purple500
import br.com.alexf.aluvery.ui.theme.Teal200
import coil.compose.AsyncImage
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    ProductSection()
                }
            }
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Surface(
        Modifier.padding(8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            Modifier
                .width(200.dp)
        ) {
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
                        .align(BottomCenter),
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
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = product.price.toPlainString(),
                    fontSize = 16.sp
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
            name = "Hamburguer",
            image = "",
            price = BigDecimal("14.99")
        )
    )
}

@Preview(showBackground = true)
@Composable
fun ProductSection() {
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(8.dp),
            fontSize = 20.sp
        )
        Row(Modifier.horizontalScroll(ScrollState(0))) {
            ProductItem(
                Product(
                    name = "Hamburguer",
                    image = "https://images.pexels.com/photos/1639557/pexels-photo-1639557.jpeg",
                    price = BigDecimal("14.99")
                )
            )
            ProductItem(
                Product(
                    name = "Pizza",
                    image = "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg",
                    price = BigDecimal("18.99")
                )
            )
            ProductItem(
                Product(
                    name = "Batata frita",
                    image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
                    price = BigDecimal("9.99")
                )
            )
        }
    }
}

