package com.example.activitylife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","IN onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","IN onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","IN onRestart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","IN onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","IN onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","IN onDestroy")

    }
}