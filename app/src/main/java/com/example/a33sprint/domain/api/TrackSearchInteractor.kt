package com.example.a33sprint.domain.api

import com.example.a33sprint.domain.model.Track

interface TrackSearchInteractor {
    fun searchTracks(expression: String): List<Track>
}