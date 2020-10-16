package com.empresa.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContent{
            // Text("Hello World")
            Greeting("Android")
        }*/

        setContent{
            NewsStory()
        }
    }

    // Here we are created the fuction Greeting Composable
    @Composable
    fun Greeting(name: String) {
        Text (text = "Hello $name!")
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Android")
    }

    @Composable
    fun NewsStory() {

        val image = imageResource(R.drawable.ic_launcher_background)

        Column(
                modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = Modifier
                    .preferredHeight(180.dp)
                    .fillMaxWidth()

            Image(image, modifier = imageModifier,
                    contentScale = ContentScale.Crop)
            Spacer(Modifier.preferredHeight(16.dp))

            Text("A day in Shark Fin Cove")
            Text("Davenport, California")
            Text("December 2018")
        }
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}