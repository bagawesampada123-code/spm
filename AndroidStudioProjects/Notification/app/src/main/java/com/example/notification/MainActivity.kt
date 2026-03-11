package com.example.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nchid = "TYIT"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            CreateNotificationChannel()
        }
    }

    fun CreateNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var channel = NotificationChannel(nchid, "TYIT", NotificationManager.IMPORTANCE_HIGH)

            var manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            manager.createNotificationChannel(channel)
        }
    }

    fun CreateMyNotification() {
        var noti = NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_baseline_notifications_none_24)
            .setContentTitle("SRM TYIT")
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .build()

        NotificationManagerCompat.from(this).notify(1, noti)

    }
}
