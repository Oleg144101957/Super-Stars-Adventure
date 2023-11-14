package com.superstrars.adventure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.superstrars.adventure.ui.theme.NavGraphFun
import com.superstrars.adventure.ui.theme.SuperStarsAdventureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperStarsAdventureTheme {
                // A surface container using the 'background' color from the theme
                NavGraphFun()
            }
        }
    }
}
