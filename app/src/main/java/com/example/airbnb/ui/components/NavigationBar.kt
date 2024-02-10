package com.example.airbnb.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.airbnb.R
import com.example.airbnb.Routes.Routes

enum class BottomNavigationItem(val icon: Int, val navDestination: Routes) {
    EXPLORE(R.drawable.search, Routes.Explore),
    TRIPS(R.drawable.airbnb, Routes.Trips),
    PROFILE(R.drawable.userprofile,Routes.Profile),
}


@Composable
fun BottomNavigationMenu(selectedItem: BottomNavigationItem, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.White)
    ) {
        for (item in BottomNavigationItem.values()) {
            Image(
                painter = painterResource(id = item.icon),
                contentDescription = null,
                modifier = Modifier
                    .size(35.dp)
                    .padding(5.dp)
                    .weight(1f)
                    .clickable {
                        navigateTo(navController, item.navDestination)
                    },
                colorFilter = if (item == selectedItem) ColorFilter.tint(Color(0x1F, 0xDF, 0x64))
                else ColorFilter.tint(Color.White)
            )
        }
    }
}
fun navigateTo(navController: NavController, dest: Routes) {
    navController.navigate(dest.route) {
        popUpTo(dest.route)
        launchSingleTop = true
    }
}