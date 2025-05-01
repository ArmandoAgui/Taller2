package com.pdmtaller2.c00174323_Armando_Aguilar.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.c00174323_Armando_Aguilar.data.dummyRestaurantes
import com.pdmtaller2.c00174323_Armando_Aguilar.model.Restaurante
import com.pdmtaller2.c00174323_Armando_Aguilar.ui.components.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuscarScreen(navController: NavController) {
    var query by remember { mutableStateOf("") }

    val resultados = dummyRestaurantes.filter { restaurante ->
        restaurante.nombre.contains(query, ignoreCase = true) ||
                restaurante.categoria.contains(query, ignoreCase = true) ||
                restaurante.menu.any { it.nombre.contains(query, ignoreCase = true) }
    }

    Scaffold(
        bottomBar = { BottomBar(navController) },
        topBar = {
            TopAppBar(title = { Text("Buscar") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Buscar por restaurante, platillo o categoría") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(resultados) { restaurante ->
                    RestauranteResultadoCard(restaurante) {
                        navController.navigate("menu/${restaurante.id}")
                    }
                }
            }
        }
    }
}

@Composable
fun RestauranteResultadoCard(restaurante: Restaurante, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Row(modifier = Modifier.padding(12.dp)) {
            Image(
                painter = rememberAsyncImagePainter(restaurante.imagenUrl),
                contentDescription = restaurante.nombre,
                modifier = Modifier
                    .size(80.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(restaurante.nombre, style = MaterialTheme.typography.titleMedium)
                Text(restaurante.descripcion, style = MaterialTheme.typography.bodyMedium)
                Text(
                    text = "Categoría: ${restaurante.categoria}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

