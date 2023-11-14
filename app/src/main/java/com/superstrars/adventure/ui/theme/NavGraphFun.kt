package com.superstrars.adventure.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavGraphFun(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Screen1.route){

        composable(route = Routes.Screen1.route){
            Screen1(navController)
        }

        composable(route = Routes.Screen2.route){
            Screen2(navController)
        }

        composable(route = Routes.Screen3.route){
            Screen3(navController)
        }

        composable(route = Routes.Screen4.route){
            Screen4(navController)
        }

        composable(route = Routes.Screen5.route){
            Screen5(navController)
        }

        composable(route = Routes.Screen6.route){
            Screen6(navController)
        }

    }
}