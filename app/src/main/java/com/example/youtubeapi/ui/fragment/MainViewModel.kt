package com.example.youtubeapi.ui.fragment

import androidx.lifecycle.ViewModel
import com.example.youtubeapi.data.repositories.VideoCategoryRepository
import com.example.youtubeapi.data.repositories.VideoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(
    private val repository: VideoCategoryRepository,
    private val searchRepository: VideoRepository
) : ViewModel() {

    fun fetchVideoCategory() = repository.fetchVideoCategory()

    fun fetchVideo(id: String?) = searchRepository.fetchVideo(id)
}