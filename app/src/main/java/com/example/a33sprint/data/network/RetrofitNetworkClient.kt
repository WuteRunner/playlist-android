package com.example.a33sprint.data.network

import com.example.a33sprint.data.NetworkClient
import com.example.a33sprint.data.dto.BaseResponse
import com.example.a33sprint.data.dto.TracksSearchResponse

class RetrofitNetworkClient : NetworkClient {
    override fun doRequest(dto: Any): BaseResponse {
        return TracksSearchResponse(emptyList())
    }
}