package com.example.a33sprint.domain.impl

import com.example.a33sprint.domain.api.TrackSearchInteractor
import com.example.a33sprint.domain.api.TracksRepository
import com.example.a33sprint.domain.model.Track

class TrackSearchInteractorImpl(private val repository: TracksRepository) : TrackSearchInteractor {
    override fun searchTracks(expression: String): List<Track> {
        return repository.searchTracks(expression)
    }
}