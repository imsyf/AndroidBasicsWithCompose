package com.posebasics.app.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.posebasics.app.R
import com.posebasics.app.demo.theme.DefaultTheme

class Unit1Pathway3Project1BusinessCard : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

private val backgroundColor = Color(0xFF073042)
private val tintColor = Color(0xFF3DDB84)

@Composable
private fun BusinessCard() {
    Column(
        modifier = Modifier
            .background(backgroundColor)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .weight(0.5f)
                .fillMaxSize(),
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Text(
                text = "Jennifer Doe",
                color = Color.White,
                fontSize = 50.sp,
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = tintColor,
                fontSize = 16.sp,
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .weight(0.5f)
                .fillMaxSize()
                .padding(bottom = 24.dp),
        ) {
            Divider()
            Info(
                imageVector = Icons.Filled.Phone,
                text = "+11 (123) 444 555 666",
            )
            Divider()
            Info(
                imageVector = Icons.Filled.Share,
                text = "@AndroidDev",
            )
            Divider()
            Info(
                imageVector = Icons.Filled.Email,
                text = "jen.doe@android.com",
            )
        }
    }
}

@Composable
private fun Info(
    imageVector: ImageVector,
    text: String,
) {
    Row(
        modifier = Modifier.padding(vertical = 8.dp),
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            tint = tintColor,
            modifier = Modifier.padding(start = 40.dp, end = 20.dp)
        )
        Text(
            text = text,
            color = Color.White,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DefaultTheme {
        BusinessCard()
    }
}
