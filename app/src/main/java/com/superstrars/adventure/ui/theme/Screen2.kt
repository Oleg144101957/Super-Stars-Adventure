package com.superstrars.adventure.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.superstrars.adventure.ConstantsSuper
import com.superstrars.adventure.R
import kotlin.system.exitProcess


@Composable
fun Screen2(navController: NavHostController){
    //Menu screen

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg2),
            contentDescription = "bg2",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        
        Column(modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 32.dp)
        ) {
            Box(){
                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "btn",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.Screen3.route)
                        }
                )
                
                Text(
                    text = "Play",
                    fontFamily = ConstantsSuper.mainFont,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }


            Box(){
                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "btn",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.Screen4.route)
                        }
                )

                Text(
                    text = "Settings",
                    fontFamily = ConstantsSuper.mainFont,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Box(){
                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "btn",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.Screen5.route)
                        }
                )

                Text(
                    text = "Game Level",
                    fontFamily = ConstantsSuper.mainFont,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Box(){
                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "btn",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(Routes.Screen6.route)
                        }
                )

                Text(
                    text = "Help",
                    fontFamily = ConstantsSuper.mainFont,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Box(){
                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "btn",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp)
                        .clickable {
                            //exit
                            exitProcess(0)
                        }
                )

                Text(
                    text = "Exit",
                    fontFamily = ConstantsSuper.mainFont,
                    color = Color.White,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
        }
    }
}


@Composable
@Preview
fun PrevScreen2(){
    val nav = rememberNavController()
    
    Screen2(navController = nav)
}