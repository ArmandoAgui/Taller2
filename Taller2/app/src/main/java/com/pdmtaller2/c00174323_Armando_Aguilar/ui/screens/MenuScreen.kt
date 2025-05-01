package com.pdmtaller2.c00174323_Armando_Aguilar.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.c00174323_Armando_Aguilar.data.dummyRestaurantes
import com.pdmtaller2.c00174323_Armando_Aguilar.model.Platillo
import com.pdmtaller2.c00174323_Armando_Aguilar.ui.components.BottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.Alignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController, restauranteId: Int) {
    val restaurante = dummyRestaurantes.find { it.id == restauranteId }
    val context = LocalContext.current
    var searchQuery by remember { mutableStateOf("") }

    if (restaurante != null) {
        val platillosFiltrados = restaurante.menu.filter {
            it.nombre.contains(searchQuery, ignoreCase = true)
        }

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(restaurante.nombre) },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                        }
                    }
                )
            },
            bottomBar = { BottomBar(navController) }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text(text = restaurante.descripcion, style = MaterialTheme.typography.bodyLarge)

                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = { Text("Buscar platillo") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                )

                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(platillosFiltrados) { platillo ->
                        PlatilloCard(platillo) {
                            Toast.makeText(context, "${platillo.nombre} agregado al carrito", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    } else {
        Text("Restaurante no encontrado")
    }
}

@Composable
fun PlatilloCard(platillo: Platillo, onAgregarClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Image(
                painter = rememberAsyncImagePainter(platillo.imagenUrl),
                contentDescription = platillo.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(platillo.nombre, style = MaterialTheme.typography.titleMedium)
            Text(platillo.descripcion, style = MaterialTheme.typography.bodyMedium)
            Button(
                onClick = { onAgregarClick() },
                modifier = Modifier
                    .padding(top = 8.dp)
                    .align(Alignment.End)
            ) {
                Text("Agregar al carrito")
            }
        }
    }
}


