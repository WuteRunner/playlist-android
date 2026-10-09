package com.example.a33sprint.com.example.a33sprint

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TrackItem(track: Track) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFF1E1E1E))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(track.title, color = Color.White)
            Text(track.artist, color = Color.Gray)
        }
        Text(track.duration, color = Color.Gray)
        if (track.isFavorite) {
            Text("★", color = Color.Yellow, modifier = Modifier.padding(start = 8.dp))
        }
    }
}