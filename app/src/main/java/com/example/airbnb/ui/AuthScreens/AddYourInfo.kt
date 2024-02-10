package com.example.airbnb.ui.AuthScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun AddInfoForm(navController: NavController,viewModel: AuthViewModel) {
   Scaffold(
       topBar = {
           TopAppBar(
               title = {
                   Image(
                       painter = painterResource(id =R.drawable.back),
                       contentDescription = null,
                       modifier = Modifier.size(20.dp)
                   )
               }
           )
       }
   ) {innerPadding->
       Column(
           modifier = Modifier
               .fillMaxSize()
               .padding(innerPadding)
               .padding(16.dp)
       ) {
           var FirstName = remember {mutableStateOf("")}
           var LastName = remember {mutableStateOf("")}
           var Email = remember {mutableStateOf("")}
           var Password = remember {mutableStateOf("")}
           var Birthday = remember {mutableStateOf("")}
           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(10.dp)
           ){
               Text(
                   text ="Add your info",
                   fontWeight = FontWeight.SemiBold,
                   fontSize = 30.sp
               )
           }

           Row {
               FormInput(
                   nameState = FirstName,
                   lable ="First Name"
               )
           }

           Row (
               modifier = Modifier.fillMaxWidth()
           ){
               FormInput(
                   nameState = LastName,
                   lable ="Last Name"
               )
           }

           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 10.dp)
           ){
               Text(
                   text = "Make sure it matches the name on your government ID."
               )
           }

           Row(
               modifier = Modifier.fillMaxWidth()
           ) {
               FormInput(
                   nameState =Birthday,
                   lable ="Birthday"
               )
           }

           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 10.dp)
           ){
               Text(
                   text = "To sign up, you need to be atlear 18. Other people who use Airbnb won't see your birthday."
               )
           }

           Row(
               modifier = Modifier.fillMaxWidth()
           ) {
               FormInput(
                   nameState =Email,
                   lable ="Email"
               )
           }

           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 10.dp)
           ){
               Text(
                   text = "We'll email you a reservation confirmation."
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

           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 10.dp)
           ){
               Text(
                   text = "By selecting Agree and continue, I agree to Airbnb's Terms of Service, Payments Terms of Service and Nondiscrimination Policy, and acknowledge the Privacy Policy.",
                   fontSize = 15.sp,
                   fontWeight = FontWeight.Light
               )
           }
           Box (
               modifier = Modifier
                   .padding(10.dp)
                   .padding(top = 10.dp)
                   .clip(RoundedCornerShape(10.dp))
                   .background(Color(255, 56, 92))
           ){
               Row(
                   modifier = Modifier.fillMaxWidth()
               ) {
                   AgreeAndContinue()
               }
           }
       }
   }
}

@Composable
fun AgreeAndContinue(){
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
            .padding(9.dp)
    ) {
        Text(
            text = "Agree and continue",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}
