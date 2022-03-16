package com.revature.navdrawerexample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Home(openDrawer:()->Unit){

    Column(modifier = Modifier.fillMaxSize()) {

        TopBar(title = "Home",
                buttonIcon = Icons.Filled.Menu,
                onButtonClicked = {openDrawer()})

        Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

            Text("Home Page Content here")
        }
    }
}

@Composable
fun Account(openDrawer:()->Unit){

    Column(modifier = Modifier.fillMaxSize()) {

        TopBar(title = "Account",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = {openDrawer()})

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){

            Text("Account Page Content here")
        }
    }
}

@Composable
fun Help(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        TopBar(title = "Help",
            buttonIcon = Icons.Filled.KeyboardArrowLeft,
            onButtonClicked = { navController.popBackStack() })

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){

            Text("Help Page Content here")
        }
    }
}