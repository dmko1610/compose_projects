package com.dmitrykovalev.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dmitrykovalev.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(name = "Dmitry Kovalev", position = "Software Engineer")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, position: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = modifier.background(Color(0xFF00000b))
            )
            Text(text = name)
            Text(text = position)
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Icon(Icons.Default.Call, contentDescription = "Phone number")
                Text("(+7) 937-659-63-56")
            }
            Row {
                Icon(Icons.Default.Person, contentDescription = "Social media")
                Text("@dmitrykovalev")
            }
            Row {
                Icon(Icons.Default.Email, contentDescription = "Email")
                Text("trigger1610@gmail.com")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard("Solaire Of Astora", "Knight of White")
    }
}