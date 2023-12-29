package com.dmitrykovalev.quadrantapp

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dmitrykovalev.quadrantapp.ui.theme.QuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(modifier = modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = modifier.weight(1f)

            )
            QuadrantCard(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = modifier.weight(1f)
            )
        }
        Row(modifier = modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = modifier.weight(1f)
            )
            QuadrantCard(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(text = description, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantAppTheme {
        Quadrant()
    }
}