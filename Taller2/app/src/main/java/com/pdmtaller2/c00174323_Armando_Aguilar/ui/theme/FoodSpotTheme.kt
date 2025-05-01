package com.pdmtaller2.c00174323_Armando_Aguilar.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Puedes personalizar estos colores
private val LightColors = lightColorScheme(
    primary = Color(0xFF7A1FC2),       // Púrpura eléctrico
    secondary = Color(0xFF00E6FF),     // Cian brillante
    background = Color(0xFFF5F5F5),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFB68CF2),       // Violeta suave
    secondary = Color(0xFF00E6FF),
    background = Color(0xFF0B0F2F),    // Azul medianoche
    surface = Color(0xFF121212),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun FoodSpotTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography, // puedes personalizar Typography si quieres
        content = content
    )
}