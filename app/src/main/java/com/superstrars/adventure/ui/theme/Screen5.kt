package com.superstrars.adventure.ui.theme

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.superstrars.adventure.ConstantsSuper
import com.superstrars.adventure.R


@Composable
fun Screen5(navController: NavHostController){

    //Game Level

    val context = LocalContext.current
    val sp = context.getSharedPreferences(ConstantsSuper.SPEED, Context.MODE_PRIVATE)

    val isChecked = remember {
        mutableStateOf(false)
    }

    if (isChecked.value){
        sp.edit().putInt(ConstantsSuper.SPEED, 1500).apply()
    } else {
        sp.edit().putInt(ConstantsSuper.SPEED, 3000).apply()
    }


    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = "start bg",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )



        Switch(
            checked = isChecked.value,
            modifier = Modifier.align(Alignment.Center),
            colors = SwitchDefaults.colors(checkedThumbColor = Color.Red),
            onCheckedChange = {
                isChecked.value = it
            }
        )

        Text(
            text = "Extra Hard Level",
            color = Color.White,
            fontFamily = ConstantsSuper.mainFont,
            fontSize = 32.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 48.dp)
        )
    }
}