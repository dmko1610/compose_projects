package com.dmitrykovalev.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(32.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(32.dp)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = modifier
                    .background(Color(0xFF00000b))
                    .width(150.dp)
            )
            Text(text = name, fontSize = 36.sp, textAlign = TextAlign.Center, lineHeight = 40.sp)
            Text(text = position, fontSize = 20.sp)
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
            modifier = modifier.padding(horizontal = 32.dp)
        ) {
            Row {
                Icon(
                    Icons.Default.Call,
                    contentDescription = "Phone number",
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text("(+7) 937-659-63-56", textAlign = TextAlign.Justify)
            }
            Row {
                Icon(
                    Icons.Default.Person,
                    contentDescription = "Social media",
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text("@dmitrykovalev", textAlign = TextAlign.Justify)
            }
            Row {
                Icon(
                    Icons.Default.Email,
                    contentDescription = "Email",
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text("trigger1610@gmail.com", textAlign = TextAlign.Justify)
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