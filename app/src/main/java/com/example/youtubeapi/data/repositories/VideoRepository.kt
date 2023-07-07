package com.example.youtubeapi.data.repositories

import com.example.youtubeapi.base.BaseRepository
import com.example.youtubeapi.data.remote.apiservices.VideoApiService
import javax.inject.Inject

class VideoRepository  @Inject constructor(private val service: VideoApiService) : BaseRepository() {

    fun fetchVideo(categoryId: String?) = doRequest {
        service.fetchVideo(categoryId = categoryId)
    }
}