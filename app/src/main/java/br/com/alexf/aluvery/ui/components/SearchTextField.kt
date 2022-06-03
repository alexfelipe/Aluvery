package br.com.alexf.aluvery.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var value by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
            onValueChange(it)
        },
        modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(32.dp),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        label = {
            Text("O que você quer?")
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
    )
}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {
    SearchTextField(onValueChange = {})
}