package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Body()
        }
    }
}

@Composable
fun Body() {
    val items = listOf("1", "sdg", "sdfsd", "sd");

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        itemsIndexed(items) { index, item ->
            ColumnListItem(index, item)
        }
    }
}

@Composable
fun ColumnListItem(rowIndex: Int, text: String) {
    Row(
        modifier = Modifier
            .padding(4.dp)
    ) {
        Text(
            text = text
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BodyPreview() {
    Body()
}