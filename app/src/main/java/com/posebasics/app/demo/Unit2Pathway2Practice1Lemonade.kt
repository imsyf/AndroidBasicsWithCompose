package com.posebasics.app.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.posebasics.app.R
import com.posebasics.app.demo.theme.DefaultTheme

class Unit2Pathway2Practice1Lemonade : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeScreen()
                }
            }
        }
    }
}

data class Lemon(
    @StringRes val instruction: Int,
    @DrawableRes val logo: Int,
)

@Composable
private fun LemonadeScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
    ) {
        var step by remember { mutableStateOf(1) }
        var squeeze by remember { mutableStateOf(0) }

        val lemon = when (step) {
            1 -> Lemon(R.string.lemon1, R.drawable.lemon1_tree)
            2 -> Lemon(R.string.lemon2, R.drawable.lemon2_squeeze)
            3 -> Lemon(R.string.lemon3, R.drawable.lemon3_drink)
            4 -> Lemon(R.string.lemon4, R.drawable.lemon4_restart)
            else -> throw IllegalStateException("Illegal step: $step")
        }

        Text(
            text = stringResource(lemon.instruction),
            fontSize = 18.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(lemon.logo),
            contentDescription = stringResource(lemon.instruction),
            modifier = Modifier
                .border(width = 1.dp, Color.Blue)
                .clickable {
                    when (step) {
                        4 -> step = 1
                        1 -> {
                            squeeze = (2..4).random()
                            step = 2
                        }
                        2 -> if (squeeze > 0) {
                            squeeze--
                            if (squeeze == 0) step = 3
                        }
                        else -> step++
                    }
                }
        )
        if (squeeze > 0) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Squeeze $squeeze more ${if (squeeze > 1) "times" else "time"}",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DefaultTheme {
        LemonadeScreen()
    }
}
