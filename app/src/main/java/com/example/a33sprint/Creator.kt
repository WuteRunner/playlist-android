package com.example.a33sprint

import com.example.a33sprint.data.network.RetrofitNetworkClient
import com.example.a33sprint.data.network.TracksRepositoryImpl
import com.example.a33sprint.domain.api.TrackSearchInteractor
import com.example.a33sprint.domain.api.TracksRepository
import com.example.a33sprint.domain.impl.TrackSearchInteractorImpl

object Creator {
    private fun getTracksRepository(): TracksRepository {
        return TracksRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideTrackSearchInteractor(): TrackSearchInteractor {
        return TrackSearchInteractorImpl(getTracksRepository())
    }
}