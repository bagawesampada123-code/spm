package com.example.audio

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.IBinder
import android.os.PersistableBundle
import android.widget.Toast

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")

    }

    override fun onCreate() {
        super.onCreate()
        var mp: MediaPlayer = MediaPlayer.create(this,R.raw.birds)
        var s=mp.start()
        Toast.makeText(this,"audio play",Toast.LENGTH_LONG).show()
    }
}