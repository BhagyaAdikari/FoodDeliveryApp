package com.example.fooddeliveryapp.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.core.content.pm.ShortcutInfoCompat.Surface

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

@Immutable
data class AppColors(
    val background: Color,
    val onBackground: Color,
    val Onsurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface:Color,
    val regularSurface: Color,
    val onRegularSurface : Color,
    val actionSurface : Color,
    val onActionSurface: Color,
    val highlightSurface : Color,
    val onHighLightSurface: Color
)