package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var status=0
        button.setOnClickListener {
            if (status==0)
            {
                imageView.setImageResource(R.drawable.images)
                status=1
            }
            else
            {
                imageView.setImageResource(R.drawable.ic_baseline_flight_24)
                status=0
            }
        }
    }
}