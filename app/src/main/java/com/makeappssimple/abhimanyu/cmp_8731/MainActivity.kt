package com.makeappssimple.abhimanyu.cmp_8731

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.makeappssimple.abhimanyu.cmp_8731.features.home.HomeScreen
import com.makeappssimple.abhimanyu.cmp_8731.features.settings.SettingsScreen
import com.makeappssimple.abhimanyu.cmp_8731.ui.theme.CMP8731Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CMP8731Theme {
                MyNavHost(
                    navHostController = rememberNavController(),
                )
            }
        }
    }
}

@Composable
private fun MyNavHost(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = "home",
    ) {
        composable(
            route = "home",
        ) {
            HomeScreen(
                openSettings = {
                    navHostController.navigate("settings")
                },
            )
        }
        composable(
            route = "settings",
        ) {
            SettingsScreen()
        }
    }
}
