package com.example.airbnb.Routes

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.airbnb.Controllers.AuthViewModel
import com.example.airbnb.ui.components.LoadingScreen
import com.example.airbnb.ui.components.NotificationMessage
import androidx.navigation.compose.composable
import com.example.airbnb.ui.AuthScreens.AddInfoForm
import com.example.airbnb.ui.AuthScreens.LoginAuthScreen
import com.example.airbnb.ui.AuthScreens.PasswordLogin
import com.example.airbnb.ui.Presentation.ExploreScreen
import com.example.airbnb.ui.Presentation.ProfileScreen
import com.example.airbnb.ui.Presentation.TripsScreen
import com.example.airbnb.ui.SplashScreen.SplashScreenFun

@Composable
fun OnDemandRoutes() {
    val navController = rememberNavController()
    val vm : AuthViewModel = hiltViewModel()
    LoadingScreen()
    NotificationMessage(vm = vm)
    NavHost(navController = navController, startDestination = Routes.Splash.route ) {
        composable(Routes.Splash.route){ SplashScreenFun(navController) }
        composable(Routes.SignUp.route){ LoginAuthScreen(navController,vm) }
        composable(Routes.PasswordLogin.route){ PasswordLogin(navController,vm) }
        composable(Routes.AddYourInfo.route){ AddInfoForm(navController,vm) }

        composable(Routes.Explore.route){ ExploreScreen(navController,vm) }
        composable(Routes.Profile.route){ ProfileScreen(navController,vm) }
        composable(Routes.Trips.route){ TripsScreen(navController,vm) }
    }
}


