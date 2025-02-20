package com.example.fooddeliveryapp.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
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
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface:Color,
    val regularSurface: Color,
    val onRegularSurface : Color,
    val actionSurface : Color,
    val onActionSurface: Color,
    val highlightSurface : Color,
    val onHighLightSurface: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        background=Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighLightSurface = Color.Unspecified

    )
}

// Define the Dark, Pink, YellowLight, and Green colors
val Dark = Color(0xFF000000) // You can change the hex value to your desired dark color
val Pink = Color(0xFFFFC0CB) // Example hex value for pink
val YellowLight = Color(0xFFFFFACD) // Example hex value for light yellow
val Green = Color(0xFF00FF00)
val Yellow = Color(0xFFFFFACD)

val extendedColors: AppColors
    get() = AppColors(
        background = Color.White,
        onBackground = Dark,
        surface = Color.White,
        onSurface = Dark,
        secondarySurface = Pink,
        onSecondarySurface = Color.White,
        regularSurface = YellowLight,
        onRegularSurface = Dark,
        actionSurface = Yellow,
        onActionSurface = Pink,
        highlightSurface = Green,
        onHighLightSurface = Color.White
    )