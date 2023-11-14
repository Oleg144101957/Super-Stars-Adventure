package com.superstrars.adventure.ui.theme

sealed class Routes (val route: String){

    object Screen1: Routes("screen1")
    object Screen2: Routes("screen2")
    object Screen3: Routes("screen3")
    object Screen4: Routes("screen4")
    object Screen5: Routes("screen5")
    object Screen6: Routes("screen6")

}