package com.example.youtubeapi.data.remote.apiservices

import com.example.youtubeapi.data.models.YoutubeResponse
import com.example.youtubeapi.data.models.category.VideoCategory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoCategoryApiService {

    @GET("videoCategories")
    suspend fun fetchVideoCategory(
        @Query("part") part : String = "snippet",
        @Query("regionCode") regionCode: String = "ru",
        @Query("chart") chart: String = "mostPopular",
    ) : Response<YoutubeResponse<VideoCategory>>
}