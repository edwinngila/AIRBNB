package com.example.airbnb.ui.Presentation

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.airbnb.Controllers.AuthViewModel
import com.example.airbnb.ui.components.BottomNavigationItem
import com.example.airbnb.ui.components.BottomNavigationMenu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(navController: NavController,viewModel: AuthViewModel) {
    Scaffold (
        topBar = {
            TopAppBar(
               colors = TopAppBarDefaults.largeTopAppBarColors(
                   containerColor = Color.White
               ),
                title = {
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                    ){
                         TextButton(
                             onClick = { /*TODO*/ }
                         ) {
                           Column {
//                               Icon(painter = Icons.Filled.Search,contentDescription = null)
                           }
                           Column {
                              Text(text = "Where to?")
                           }
                         }   
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigationMenu(selectedItem = BottomNavigationItem.EXPLORE, navController = navController)
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