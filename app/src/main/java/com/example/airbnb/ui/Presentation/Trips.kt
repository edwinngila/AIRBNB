package com.example.airbnb.ui.Presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.airbnb.Controllers.AuthViewModel
import com.example.airbnb.ui.components.BottomNavigationItem
import com.example.airbnb.ui.components.BottomNavigationMenu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripsScreen(navController: NavController,viewModel: AuthViewModel) {
    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color.White
                ),
                title = {
                    Text(text = "Trips")
                }
            )
        },
        bottomBar = {
            BottomNavigationMenu(selectedItem = BottomNavigationItem.TRIPS, navController = navController)
        }
    ){innerPadding->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){

        }
    }
}