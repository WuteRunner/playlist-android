package com.example.a33sprint.com.example.a33sprint

data class Track(
    val title: String,
    val artist: String,
    val duration: String,          // например "3:45"
    val isFavorite: Boolean = false
)