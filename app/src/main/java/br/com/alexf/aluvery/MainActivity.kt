package br.com.alexf.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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

@Preview(
    showBackground = true,
    showSystemUi = true,
    heightDp = 300,
    widthDp = 200,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun MyFirstComposable(){
    AluveryTheme {
        Surface {
            Text("Aluvery")
            Text("Meu primeiro código com o Compose")
        }
    }
}

@Preview
@Composable
fun MyFirstComposablePreview(){
    MyFirstComposable()
}