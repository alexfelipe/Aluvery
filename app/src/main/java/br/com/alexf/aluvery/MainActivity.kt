package br.com.alexf.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import br.com.alexf.aluvery.ui.theme.Purple200
import br.com.alexf.aluvery.ui.theme.Purple500
import br.com.alexf.aluvery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItem() {
    Column(Modifier.width(200.dp)) {
        Box(
            Modifier
                .heightIn(min = 100.dp)
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient(listOf(Purple500, Teal200))
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier
                    .size(100.dp)
                    .offset(y = 50.dp)
                    .clip(CircleShape)
                    .align(BottomCenter)
            )
        }
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp))
        Text(text = "Hamburguer")
        Text(text = "R$ 14,99")
    }
}


