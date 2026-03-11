package com.example.media_api

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var path="android.resource://com.example.media_api/raw/"+R.raw.nature
        videoView.setVideoURI(Uri.parse(path))
        videoView.setMediaController(MediaController(this))
        videoView.start()

    }
}