package br.com.alexf.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import br.com.alexf.aluvery.sampledata.sampleProducts
import br.com.alexf.aluvery.sampledata.sampleSectionWithProducts
import br.com.alexf.aluvery.ui.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    HomeScreen(sampleSectionWithProducts)
                }
            }
        }
    }
}
