package com.posebasics.app.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.posebasics.app.R
import com.posebasics.app.demo.theme.DefaultTheme

class Unit1Pathway3Practice1Article : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
private fun Article(
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
        )
        Text(
            text = stringResource(R.string.article_p1),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp),
        )
        Text(
            text = stringResource(R.string.article_p2),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DefaultTheme {
        Article()
    }
}
