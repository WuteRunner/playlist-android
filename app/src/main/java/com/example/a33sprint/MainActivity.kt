package com.example.a33sprint

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {

    private val tag = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")

        setContent {
            MainScreen(
                onSearchClick = {
                    startActivity(Intent(this@MainActivity, SearchActivity::class.java))
                },
                onMediaLibraryClick = {
                    Toast.makeText(
                        this@MainActivity,
                        "Нажата кнопка \"Медиатека\"",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                onSettingsClick = {
                    startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
                }
            )
        }
    }

    override fun onStart() { super.onStart(); Log.d(tag, "onStart") }
    override fun onResume() { super.onResume(); Log.d(tag, "onResume") }
    override fun onPause() { super.onPause(); Log.d(tag, "onPause") }
    override fun onStop() { super.onStop(); Log.d(tag, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(tag, "onDestroy") }
}