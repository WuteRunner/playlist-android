package com.example.a33sprint

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.statusBarsPadding

private val BlueBackground = Color(0xFF3772E7)
private val ScreenBackground = Color.White
private val TextColor = Color(0xFF1A1B22)
private val ArrowColor = Color(0xFF999999)

@Composable
fun MainScreen(
    navigateToSearch: () -> Unit,
    navigateToMediaLibrary: () -> Unit,
    navigateToFavorites: () -> Unit,
    navigateToSettings: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackground)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(BlueBackground)
                .statusBarsPadding()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            MenuItem(
                title = stringResource(R.string.btn_search),
                icon = Icons.Default.Search,
                onClick = navigateToSearch
            )
            MenuItem(
                title = stringResource(R.string.btn_media_library),
                icon = Icons.Default.List,
                onClick = navigateToMediaLibrary
            )
            MenuItem(
                title = stringResource(R.string.btn_favorites),
                icon = Icons.Default.FavoriteBorder,
                onClick = navigateToFavorites
            )
            MenuItem(
                title = stringResource(R.string.btn_settings),
                icon = Icons.Default.Settings,
                onClick = navigateToSettings
            )
        }
    }
}

@Composable
private fun MenuItem(
    title: String,
    icon: ImageVector,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = TextColor,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            color = TextColor,
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        )
        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = null,
            tint = ArrowColor,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(
        navigateToSearch = {},
        navigateToMediaLibrary = {},
        navigateToFavorites = {},
        navigateToSettings = {}
    )
}