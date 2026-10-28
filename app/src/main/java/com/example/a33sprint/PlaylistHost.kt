package com.example.a33sprint

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun PlaylistHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = Destination.MAIN.route,
        modifier = modifier
    ) {
        composable(route = Destination.MAIN.route) {
            MainScreen(
                navigateToSearch = {
                    navController.navigate(Destination.SEARCH.route) {
                        launchSingleTop = true
                    }
                },
                navigateToMediaLibrary = {
                    Toast.makeText(context, "Нажата кнопка \"Плейлисты\"", Toast.LENGTH_SHORT).show()
                },
                navigateToFavorites = {
                    Toast.makeText(context, "Нажата кнопка \"Избранное\"", Toast.LENGTH_SHORT).show()
                },
                navigateToSettings = {
                    navController.navigate(Destination.SETTINGS.route) {
                        launchSingleTop = true
                    }
                }
            )
        }

        composable(route = Destination.SEARCH.route) {
            SearchScreen()
        }

        composable(route = Destination.SETTINGS.route) {
            SettingsScreen(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}