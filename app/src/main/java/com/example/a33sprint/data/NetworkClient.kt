package com.example.a33sprint.data

import com.example.a33sprint.data.dto.BaseResponse

interface NetworkClient {
    fun doRequest(dto: Any): BaseResponse
}