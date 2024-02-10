package com.example.airbnb.ui.AuthScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.airbnb.Controllers.AuthViewModel
import com.example.airbnb.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PasswordLogin(navController: NavController,viewModel: AuthViewModel) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription =null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(start = 5.dp)
                    )
                },
            )
        }
    ){innerPadding->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
                .padding(20.dp)
        ) {
            var Password = remember {mutableStateOf("")}

            Row (
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 26.sp,
                    text = "Log in",
                    modifier = Modifier
                        .padding(10.dp)
                        .padding(bottom = 20.dp)
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth()
            ){
                FormInput(
                    nameState = Password,
                    lable = "Password"
                )
            }

            Box (
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(255, 56, 92))
            ){
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    loginBTN()
                }
            }

            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ){
                Text(
                    text = "Forgot password",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }
        }
    }
}
@Composable
fun loginBTN(){
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(255, 56, 92),
            contentColor = Color.White
        ),

        onClick = { /*TODO*/ },
        modifier = Modifier
            .background(Color(255, 56, 92))
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
    ) {
        Text(
            text = "Continue",
            fontSize = 19.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}