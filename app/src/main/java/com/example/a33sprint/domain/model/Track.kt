package com.example.a33sprint.domain.model

data class Track(
    val id: Long,
    val trackName: String,
    val artistName: String,
    val trackTime: String // Время уже в виде строки "03:45"
)