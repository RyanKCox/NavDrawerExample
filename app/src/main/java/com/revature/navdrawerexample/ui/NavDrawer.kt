package com.revature.navdrawerexample.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.revature.navdrawerexample.R
import com.revature.navdrawerexample.model.data.Screens
import com.revature.navdrawerexample.ui.theme.NavDrawerExampleTheme

@Composable
fun NavDrawer(modifier: Modifier = Modifier,
              onDestinationClicked:(route:String)->Unit){

    Column(
        modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 48.dp)) {

        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "App Icon")

        Spacer(Modifier.size(24.dp))

        Screens.forEach {screen->

            Spacer(Modifier.size(24.dp))

            Text(screen.title,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.clickable {  })

        }

    }
}

@Preview
@Composable
fun previewDrawer(){
    NavDrawerExampleTheme {

        NavDrawer{}
    }
}