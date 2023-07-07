package com.example.youtubeapi.data.repositories

import com.example.youtubeapi.base.BaseRepository
import com.example.youtubeapi.data.remote.apiservices.VideoCategoryApiService
import javax.inject.Inject

class VideoCategoryRepository  @Inject constructor(private val service: VideoCategoryApiService) :
    BaseRepository() {

    fun fetchVideoCategory() = doRequest {
        service.fetchVideoCategory()
    }
}