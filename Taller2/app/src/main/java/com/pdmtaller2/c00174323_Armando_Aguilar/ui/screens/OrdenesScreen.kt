package com.pdmtaller2.c00174323_Armando_Aguilar.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.c00174323_Armando_Aguilar.ui.components.BottomBar

@Composable
fun OrdenesScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        Text(
            text = "Pantalla de órdenes",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        )
    }
}
