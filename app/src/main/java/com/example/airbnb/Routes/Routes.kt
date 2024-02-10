package com.example.airbnb.Routes

sealed class Routes(val route: String) {
    object Splash: Routes("SplashScreen")
    object SignUp: Routes("SignUp")
    object AddYourInfo:Routes("AddYourInfo")
    object PasswordLogin:Routes("PasswordLogin")

    object Explore: Routes("Explore")
    object Profile: Routes("Profile")
    object Trips:Routes("Trips")

    object EditUserProfile:Routes("EditUserProfile")
}