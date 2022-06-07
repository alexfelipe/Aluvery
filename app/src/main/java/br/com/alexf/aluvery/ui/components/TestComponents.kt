package br.com.alexf.aluvery.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.alexf.aluvery.ui.theme.AluveryTheme

@Preview
@Composable
fun CustomLayoutPreview() {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .padding(8.dp)
                    .background(Color.Red)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Text(
                    "Texto A"
                )
                Text(
                    "Texto B"
                )
                Row(
                    Modifier
                        .padding(8.dp)
                        .background(Color.Blue)
                        .fillMaxWidth(0.8f)
                        .fillMaxHeight(0.5f)
                ) {
                    Text(
                        "Texto C",
                    )
                    Text("Texto D")
                }
                Box(
                    Modifier
                        .padding(8.dp)
                        .background(Color.Green)
                        .fillMaxSize(0.5f)
                ) {
                    Row(
                        Modifier
                            .padding(16.dp)
                            .background(Color.Yellow)
                    ) {
                        Text("Texto E")
                        Text("Texto F")
                    }
                    Row(
                        Modifier
                            .padding(8.dp)
                            .background(Color.Gray)
                    ) {
                        Text("Texto G")
                        Text("Texto H")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ColumnPreview() {
    AluveryTheme {
        Surface {
            Column {
                Text("Aluvery")
                Text("Meu primeiro código com o Compose")
            }
        }
    }
}

@Preview
@Composable
fun RowPreview() {
    AluveryTheme {
        Surface {
            Row {
                Text("Aluvery")
                Text("Meu primeiro código com o Compose")
            }
        }
    }
}

@Preview
@Composable
fun BoxPreview() {
    AluveryTheme {
        Surface {
            Box {
                Text("Aluvery")
                Text("Meu primeiro código com o Compose")
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    heightDp = 300,
    widthDp = 200,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun MyFirstComposable() {
    AluveryTheme {
        Surface {
            Text("Aluvery")
            Text("Meu primeiro código com o Compose")
        }
    }
}

@Preview
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}