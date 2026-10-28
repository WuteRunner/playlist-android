package com.example.a33sprint.data.network

import com.example.a33sprint.data.NetworkClient
import com.example.a33sprint.data.dto.TracksSearchRequest
import com.example.a33sprint.data.dto.TracksSearchResponse
import com.example.a33sprint.domain.api.TracksRepository
import com.example.a33sprint.domain.model.Track

class TracksRepositoryImpl(private val networkClient: NetworkClient) : TracksRepository {

    override fun searchTracks(expression: String): List<Track> {
        val response = networkClient.doRequest(TracksSearchRequest(expression))

        if (response.resultCode == 200) {
            return (response as TracksSearchResponse).results.map {

                val seconds = it.trackTimeMillis / 1000
                val minutes = seconds / 60
                val trackTime = "%02d".format(minutes) + ":" + "%02d".format(seconds - minutes * 60)

                Track(it.id, it.trackName, it.artistName, trackTime)
            }
        } else {
            return emptyList()
        }
    }
}