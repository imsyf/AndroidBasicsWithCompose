package com.posebasics.app.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.posebasics.app.demo.theme.DefaultTheme

class Unit1Pathway3Practice3Quadrants : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantsScreen()
                }
            }
        }
    }
}

@Composable
private fun QuadrantsScreen() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "Text",
                description = "Displays text and follows Material Design guidelines.",
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f),
            )
            Quadrant(
                title = "Image",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f),
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "Row",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f),
            )
            Quadrant(
                title = "Column",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun Quadrant(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
    ) {
        Text(
            text = "$title composable",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DefaultTheme {
        QuadrantsScreen()
    }
}
