package com.example.airbnb.ui.SplashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.airbnb.R
import kotlinx.coroutines.delay
import androidx.navigation.NavController


@Composable
fun SplashScreenFun(navController: NavController){
    LaunchedEffect(true) {
        delay(3000)
        navController.navigate("SignUp")
    }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ,
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ){
        Image(
            painter = painterResource(id =R.drawable.airbnblogo),
            contentDescription =null
        )
    }
}