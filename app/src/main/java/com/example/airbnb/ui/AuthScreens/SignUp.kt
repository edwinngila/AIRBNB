package com.example.airbnb.ui.AuthScreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.airbnb.Controllers.AuthViewModel
import com.example.airbnb.R
import com.example.airbnb.ui.components.LoadingScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginAuthScreen(navController: NavController,viewModel: AuthViewModel){
    var progressindicater = viewModel.inProgress.value
    if (progressindicater){
        LoadingScreen()
    }
        Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color.White
                ),
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.close),
                        contentDescription =null,
                        modifier = Modifier.size(20.dp)
                    )
                },
            )
        }
    ){ innerPadding ->
        val emailState = remember { mutableStateOf("") }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
                .padding(15.dp)
        ){
            Text(
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp,
                text = "Log in or sign up to Airbnb",
                color = Color.Gray,
                modifier = Modifier
                    .padding(10.dp)
                    .padding(bottom = 30.dp)
            )
            FormInput(
                nameState = emailState,
                lable = "Email"
            )
            Box (
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(255, 56, 92))
            ){
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(255, 56, 92),
                            contentColor = Color.White
                        ),

                        onClick = {
//                            viewModel.AuthScreen(
//                                email = emailState.value,
//                                navController=navController
//                            )
                        },
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
            }

            Box (
                modifier = Modifier
                    .padding(10.dp)
                    .padding(top = 30.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
            ){
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    TextButton(onClick = { /*TODO*/ }) {
                       Row (
                           horizontalArrangement = Arrangement.Center,
                           modifier = Modifier.fillMaxWidth()
                       ){
                           Column (
                               modifier = Modifier.padding(end = 20.dp)
                           ){
                               Image(
                                   painter = painterResource(id = R.drawable.facebook),
                                   contentDescription = null,
                                   modifier = Modifier.size(25.dp)
                               )
                           }
                           Column{
                               Text(
                                   text = "Continue with Facebook",
                                   color = Color.Black,
                                   fontWeight = FontWeight.SemiBold
                               )
                           }
                       }
                    }
                }
            }

            Box (
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
            ){
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    TextButton(onClick = { /*TODO*/ }) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()

                        ) {
                            Column(
                                modifier = Modifier.padding(end = 20.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = null,
                                    modifier = Modifier.size(25.dp)
                                )
                            }
                            Column{
                                Text(
                                    text = "Continue with Google",
                                    color = Color.Black,
                                    fontWeight = FontWeight.SemiBold

                                )
                            }
                        }
                    }
                }
            }

            Box (
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
            ){
                Row (
                    modifier = Modifier.fillMaxWidth()
                ){
                    TextButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Row (
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Column(
                                modifier = Modifier.padding(end = 20.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.apple),
                                    contentDescription = null,
                                    modifier = Modifier.size(25.dp)
                                )
                            }
                            Column{
                                Text(
                                    text = "Continue with Apple",
                                    color = Color.Black,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
    
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInput(nameState: MutableState<String>, lable:String) {
    OutlinedTextField(
        value = nameState.value,
        onValueChange = {
            nameState.value = it
        },
        label = {
            Text(
                text = lable
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
}

@Composable
fun Divider(
    modifier: Modifier = Modifier,
    thickness: Dp = DividerDefaults.Thickness,
    color: Color = DividerDefaults.color,
){

}
