package com.pdmtaller2.c00174323_Armando_Aguilar.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.c00174323_Armando_Aguilar.data.dummyRestaurantes
import com.pdmtaller2.c00174323_Armando_Aguilar.model.Restaurante
import com.pdmtaller2.c00174323_Armando_Aguilar.ui.components.BottomBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Agrupar por categoría
            val agrupadoPorCategoria = dummyRestaurantes.groupBy { it.categoria }
            agrupadoPorCategoria.forEach { (categoria, restaurantes) ->
                item {
                    Text(
                        text = categoria,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
                item {
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(restaurantes) { restaurante ->
                            RestauranteCard(restaurante) {
                                navController.navigate("menu/${restaurante.id}")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RestauranteCard(restaurante: Restaurante, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(220.dp)
            .clickable { onClick() },
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column {
            Image(
                painter = rememberAsyncImagePainter(restaurante.imagenUrl),
                contentDescription = restaurante.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = restaurante.nombre,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = restaurante.categoria,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}
