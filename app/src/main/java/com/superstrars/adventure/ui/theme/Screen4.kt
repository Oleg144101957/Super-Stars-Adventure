package com.superstrars.adventure.ui.theme

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.superstrars.adventure.ConstantsSuper
import com.superstrars.adventure.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen4(navController: NavHostController){

    //settings

    val context = LocalContext.current
    val sp = context.getSharedPreferences(ConstantsSuper.SHARE, Context.MODE_PRIVATE)
    val nameFromSP = sp.getString(ConstantsSuper.NAME, "user") ?: "user"
    val name = remember {
        mutableStateOf(nameFromSP)
    }

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = "bg settings",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        TextField(
            value = name.value,
            modifier = Modifier
                .align(Alignment.Center),
            onValueChange = {
                name.value = it
                sp.edit().putString(ConstantsSuper.NAME, it).apply()
            }
        )
    }

}