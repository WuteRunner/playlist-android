package com.example.a33sprint

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.a33sprint.com.example.a33sprint.Track

class MainActivity : ComponentActivity() {

    private val tag = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")
        setContent {
            PlaylistScreen(
                tracks = listOf(
                    Track("Bohemian Rhapsody", "Queen", "5:55", isFavorite = true),
                    Track("Imagine", "John Lennon", "3:03"),
                    Track("Stairway to Heaven", "Led Zeppelin", "8:02", isFavorite = true)
                ),
                onAboutClick = {
                    // явный Intent → переход на AboutActivity
                    val intent = Intent(this@MainActivity, AboutActivity::class.java)
                    startActivity(intent)
                },
                onShareClick = {
                    // неявный Intent → поделиться текстом
                    val shareText = getString(R.string.share_text)
                    val shareIntent = Intent(Intent.ACTION_SEND).apply {
                        type = "text/plain"
                        putExtra(Intent.EXTRA_SUBJECT, getString(R.string.share_subject))
                        putExtra(Intent.EXTRA_TEXT, shareText)
                    }
                    startActivity(Intent.createChooser(shareIntent, null))
                }
            )
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
}