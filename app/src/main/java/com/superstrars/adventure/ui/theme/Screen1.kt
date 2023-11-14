package com.superstrars.adventure.ui.theme

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
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
import kotlinx.coroutines.delay

@Composable
fun Screen1(navController: NavHostController){
    //Loading

    val animatableX = remember {
        Animatable(-64f)
    }

    LaunchedEffect(Unit){
        animatableX.animateTo(
            targetValue = 0f,
            animationSpec = tween(2000)
        )
    }

    LaunchedEffect(Unit){
        delay(2200)
        navController.navigate(Routes.Screen2.route)
    }

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = "start bg",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Text(
            text = "Loading screen ...",
            color = Color.White,
            fontFamily = ConstantsSuper.mainFont,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 24.dp, x = animatableX.value.dp)
        )
    }
}

@Composable
@Preview
fun PrevScreen1(){
    val nav = rememberNavController()
    Screen1(navController = nav)
}