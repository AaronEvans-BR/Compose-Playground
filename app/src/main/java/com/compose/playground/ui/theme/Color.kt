package com.compose.playground.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


@Composable
fun defaultTextColor(isDarkTheme: Boolean): Color =
    if (isDarkTheme) Color.LightGray else Color.Black