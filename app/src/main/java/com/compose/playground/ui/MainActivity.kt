package com.compose.playground.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.playground.ui.theme.ComposePlaygroundTheme
import com.compose.playground.ui.theme.defaultTextColor
import com.playground.playground.R
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    private val viewModel: MainActivityViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = getString(R.string.lorem_ipsum),
                    color = Color.Black,
                    style = TextStyle(
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, color: Color? = null) {
    Text(
        text = "Hello $name!",
        color = color ?: defaultTextColor(isDarkTheme = isSystemInDarkTheme())
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePlaygroundTheme {
        Greeting("Android")
    }
}


@Composable
fun getDefaultTextColor() = defaultTextColor(isDarkTheme = isSystemInDarkTheme())