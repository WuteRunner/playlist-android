package com.example.a33sprint.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.example.a33sprint.ui.view_model.TrackViewModel

class TrackActivity : ComponentActivity() {

    private val viewModel: TrackViewModel by viewModels {
        TrackViewModel.getViewModelFactory("123")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Text(text = "Экран трека. ViewModel создана: ${viewModel.hashCode()}")
            }
        }
    }
}