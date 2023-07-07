package com.example.youtubeapi.data.models.video

import com.google.gson.annotations.SerializedName

data class Localaized(

    @SerializedName("description")
    val description: String = "",
    @SerializedName("title")
    val title: String = ""

)
