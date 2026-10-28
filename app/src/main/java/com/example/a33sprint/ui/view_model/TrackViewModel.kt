package com.example.a33sprint.ui.view_model

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a33sprint.MyApplication
import com.example.a33sprint.domain.api.TrackSearchInteractor

class TrackViewModel(
    private val trackId: String,
    private val tracksInteractor: TrackSearchInteractor
) : ViewModel() {

    init {
        Log.d("TEST", "init!: trackId = $trackId")
    }

    companion object {
        fun getViewModelFactory(trackId: String): ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = this[APPLICATION_KEY] as MyApplication
                val interactor = application.provideTrackSearchInteractor()
                TrackViewModel(trackId, interactor)
            }
        }
    }
}