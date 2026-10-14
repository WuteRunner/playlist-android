package com.example.a33sprint

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun PlaylistHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Destination.MAIN.route,
        modifier = modifier
    ) {
        composable(route = Destination.MAIN.route) {
            MainScreen(
                navigateToSearch = { navController.navigate(Destination.SEARCH.route) },
                navigateToMediaLibrary = { },
                navigateToSettings = { navController.navigate(Destination.SETTINGS.route) }
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