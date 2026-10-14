package com.example.a33sprint

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val BlueBackground = Color(0xFF2E5BFF)
private val ScreenBackground = Color.White
private val ButtonBackground = Color(0xFFE6E8EB)
private val TextColor = Color(0xFF1A1B22)

@Composable
fun MainScreen(
    navigateToSearch: () -> Unit,
    navigateToMediaLibrary: () -> Unit,
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
                .padding(horizontal = 16.dp, vertical = 24.dp)
        ) {
            MainButton(text = stringResource(R.string.btn_search), onClick = navigateToSearch)
            Spacer(Modifier.height(12.dp))
            MainButton(text = stringResource(R.string.btn_media_library), onClick = navigateToMediaLibrary)
            Spacer(Modifier.height(12.dp))
            MainButton(text = stringResource(R.string.btn_settings), onClick = navigateToSettings)
        }
    }
}

@Composable
private fun MainButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonBackground,
            contentColor = TextColor
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(
        navigateToSearch = {},
        navigateToMediaLibrary = {},
        navigateToSettings = {}
    )
}