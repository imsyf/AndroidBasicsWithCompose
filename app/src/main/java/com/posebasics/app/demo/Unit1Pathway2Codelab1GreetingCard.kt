package com.posebasics.app.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.posebasics.app.demo.theme.DefaultTheme

class Unit1Pathway2Codelab1GreetingCard : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(24.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DefaultTheme {
        Greeting("World")
    }
}
