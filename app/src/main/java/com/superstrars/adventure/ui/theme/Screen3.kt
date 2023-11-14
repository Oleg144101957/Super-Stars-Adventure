package com.superstrars.adventure.ui.theme

import android.content.Context
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
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
fun Screen3(navController: NavHostController){

    //game screen
    
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg2),
            contentDescription = "backgroung",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(id = R.drawable.basepart),
            contentDescription = "base1",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .alpha(0.7f)
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight
        )

        PlayGround()


        Image(
            painter = painterResource(id = R.drawable.basepart2),
            contentDescription = "base2",
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )


    }
}


@Composable
fun BoxScope.PlayGround(){

    val score = remember{
        mutableStateOf(0)
    }
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val context = LocalContext.current
    val sp = context.getSharedPreferences(ConstantsSuper.SHARE, Context.MODE_PRIVATE)
    val speedFromSP = sp.getInt(ConstantsSuper.SPEED, 3000)
    val speed = remember {
        mutableStateOf(speedFromSP)
    }

    Text(
        text = "Score ${score.value}",
        color = Color.White,
        fontFamily = ConstantsSuper.mainFont,
        fontSize = 24.sp,
        modifier = Modifier
            .align(Alignment.TopCenter)
            .padding(top = 32.dp)

    )


    val animation1 = remember {
        Animatable(0f)
    }

    val animation2 = remember {
        Animatable(0f)
    }

    val animation3 = remember {
        Animatable(0f)
    }

    val animation4 = remember {
        Animatable(0f)
    }

    val animation5 = remember {
        Animatable(0f)
    }


    val animation6 = remember {
        Animatable(0f)
    }

    val animation7 = remember {
        Animatable(0f)
    }

    val isVisible1 = remember {
        mutableStateOf(true)
    }


    val isVisible2 = remember {
        mutableStateOf(true)
    }


    val isVisible3 = remember {
        mutableStateOf(true)
    }


    val isVisible4 = remember {
        mutableStateOf(true)
    }


    val isVisible5 = remember {
        mutableStateOf(true)
    }


    val isVisible6 = remember {
        mutableStateOf(true)
    }


    val isVisible7 = remember {
        mutableStateOf(true)
    }

    LaunchedEffect(Unit){
        animation1.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 200
            ), repeatMode = RepeatMode.Restart)
        )
    }

    LaunchedEffect(Unit){
        animation2.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 400
            ), repeatMode = RepeatMode.Restart)
        )
    }


    LaunchedEffect(Unit){
        animation3.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 600
            ), repeatMode = RepeatMode.Restart)
        )
    }


    LaunchedEffect(Unit){
        animation4.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value
            ), repeatMode = RepeatMode.Restart)
        )
    }

    LaunchedEffect(Unit){
        animation5.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 200
            ), repeatMode = RepeatMode.Restart)
        )
    }

    LaunchedEffect(Unit){
        animation6.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 800
            ), repeatMode = RepeatMode.Restart)
        )
    }

    LaunchedEffect(Unit){
        animation7.animateTo(
            targetValue = screenHeight.toFloat(),
            animationSpec = infiniteRepeatable(animation = tween(
                durationMillis = speed.value,
                delayMillis = 0
            ), repeatMode = RepeatMode.Restart)
        )
    }

    LaunchedEffect(Unit){
        repeat(24){
            delay(5000)
            isVisible1.value = true
            isVisible2.value = true
            isVisible3.value = true
            isVisible4.value = true
            isVisible5.value = true
            isVisible6.value = true
            isVisible7.value = true
        }
    }

    if (isVisible1.value){
        Image(
            painter = painterResource(id = R.drawable.one),
            contentDescription = "one",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation1.value.dp)
                .clickable {
                    score.value += 1
                    isVisible1.value = false
                }
        )
    }

    if (isVisible2.value){
        Image(
            painter = painterResource(id = R.drawable.two),
            contentDescription = "two",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation2.value.dp, x = 16.dp)
                .clickable {
                    score.value += 1
                    isVisible2.value = false
                }
        )
    }


    if (isVisible3.value){
        Image(
            painter = painterResource(id = R.drawable.three),
            contentDescription = "three",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation3.value.dp, x = 64.dp)
                .clickable {
                    score.value += 1
                    isVisible3.value = false
                }
        )
    }


    if (isVisible4.value){
        Image(
            painter = painterResource(id = R.drawable.nine),
            contentDescription = "four",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation4.value.dp, x = 32.dp)
                .clickable {
                    score.value += 1
                    isVisible4.value = false
                }
        )
    }


    if (isVisible5.value){
        Image(
            painter = painterResource(id = R.drawable.ten),
            contentDescription = "five",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation5.value.dp, x = (-32).dp)
                .clickable {
                    score.value += 1
                    isVisible5.value = false
                }
        )
    }


    if (isVisible6.value){
        Image(
            painter = painterResource(id = R.drawable.ten),
            contentDescription = "six",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation6.value.dp, x = (-64).dp)
                .clickable {
                    score.value += 1
                    isVisible6.value = false
                }
        )
    }


    if (isVisible7.value){
        Image(
            painter = painterResource(id = R.drawable.five),
            contentDescription = "seven",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = animation7.value.dp, x = (-16).dp)
                .clickable {
                    score.value += 1
                    isVisible7.value = false
                }
        )
    }

}

@Composable
@Preview
fun Screen3Prev(){
    val nav = rememberNavController()
    Screen3(navController = nav)
}