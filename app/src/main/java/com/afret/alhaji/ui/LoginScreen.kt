package com.afret.alhaji.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afret.alhaji.R
import com.afret.alhaji.ui.theme.*


@Composable
fun LoginScreen() {


    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = ColorGunmetal)
    ) {


        //Image
        Image(
            modifier = Modifier
                .height(225.dp)
                .width(225.dp),
            painter = painterResource(id = R.drawable.ic_mobile_login),
            contentDescription = "ic_mobile_login"
        )

        Text(text = "Login", color = ColorWhite, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Pleas sign in to continue",
            color = ColorWhite, fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        BasicTextField(value = email,
            textStyle = TextStyle(color = ColorWhite, fontSize = 15.sp),
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth(0.8f)
                .background(ColorAmericanPurple), onValueChange =
            {

                email = it
                println("onValue Change Email $email")
            })

        Spacer(modifier = Modifier.height(16.dp))

        BasicTextField(value = password,
            textStyle = TextStyle(color = ColorWhite, fontSize = 15.sp),
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth(0.8f)
                .background(ColorAmericanPurple), onValueChange =
            {
                password = it
                println("onValue Change Password $password")
            })


        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {

                println("Onclick Email $email")
                println("Onclick Passwod $password")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor =
                ColorVerdigris
            ),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(0.6f)
        ) {


            Text("Login", color = ColorBLack, fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "Forger Password?", color = ColorVerdigris,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row() {

            Text(
                "Don't have an account?", color = ColorVerdigris,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text("Sign up", color = ColorWhite, fontSize = 18.sp)

        }

    }
}

@Composable
@Preview
fun LoginScreenPreview() {

    LoginScreen()
}