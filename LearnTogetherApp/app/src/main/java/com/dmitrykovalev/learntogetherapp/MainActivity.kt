package com.dmitrykovalev.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dmitrykovalev.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialHeaderImage()
                }
            }
        }
    }
}

@Composable
fun TutorialHeaderImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
    TutorialTitleText(modifier = modifier)
}

@Composable
fun TutorialTitleText(modifier: Modifier = Modifier) {
    Text(text = "Jetpack Compose tutorial", modifier = modifier)
    Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.")
    Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherAppTheme {
        TutorialHeaderImage()
    }
}