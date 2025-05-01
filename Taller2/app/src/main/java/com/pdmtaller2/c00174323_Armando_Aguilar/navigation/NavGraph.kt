package com.pdmtaller2.c00174323_Armando_Aguilar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.c00174323_Armando_Aguilar.ui.screens.*

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("buscar") {
            BuscarScreen(navController)
        }
        composable("ordenes") {
            OrdenesScreen(navController)
        }
        composable("menu/{id}") { backStackEntry ->
            val restauranteId = backStackEntry.arguments?.getString("id")?.toIntOrNull()
            if (restauranteId != null) {
                MenuScreen(navController, restauranteId)
            }
        }
    }
}
