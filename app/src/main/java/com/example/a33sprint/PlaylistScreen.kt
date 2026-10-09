package com.example.a33sprint

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a33sprint.com.example.a33sprint.Track
import com.example.a33sprint.com.example.a33sprint.TrackItem

@Composable
fun PlaylistScreen(
    tracks: List<Track>,
    onAboutClick: () -> Unit,
    onShareClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.playlist_title),
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        tracks.forEach { TrackItem(it) }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Button(
                onClick = onAboutClick,
                modifier = Modifier.weight(1f).padding(end = 4.dp)
            ) {
                Text(stringResource(R.string.btn_about))
            }
            Button(
                onClick = onShareClick,
                modifier = Modifier.weight(1f).padding(start = 4.dp)
            ) {
                Text(stringResource(R.string.btn_share))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PlaylistScreenPreview() {
    PlaylistScreen(
        tracks = listOf(
            Track("Bohemian Rhapsody", "Queen", "5:55", isFavorite = true),
            Track("Imagine", "John Lennon", "3:03"),
            Track("Stairway to Heaven", "Led Zeppelin", "8:02", isFavorite = true)
        ),
        onAboutClick = {},
        onShareClick = {}
    )
}