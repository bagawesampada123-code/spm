package com.example.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mp: MediaPlayer = MediaPlayer.create(this,R.raw.birds)
        button.setOnClickListener {
            if(!mp.isPlaying)
            {
                mp.start()
                Toast.makeText(this,"START", Toast.LENGTH_LONG).show()
            }
        }

        button2.setOnClickListener {
            mp.pause()
            Toast.makeText(this,"PAUSE",Toast.LENGTH_LONG).show()
        }
    }
}