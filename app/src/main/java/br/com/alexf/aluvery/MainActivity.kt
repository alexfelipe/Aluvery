package br.com.alexf.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.alexf.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}

@Preview
@Composable
fun CustomLayoutPreview() {
    AluveryTheme {
        Surface {
            Column {
                Text("Texto A")
                Text("Texto B")
                Row {
                    Text("Texto C")
                    Text("Texto D")
                }
                Box {
                    Row {
                        Text("Texto E")
                        Text("Texto F")
                    }
                    Row {
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
    uiMode = UI_MODE_NIGHT_YES
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
