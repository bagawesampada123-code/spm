package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var flag=false
    var sec=0
    var handler=Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (!flag)
            {
                flag=true
                handler.post(object :Runnable{
                    override fun run() {
                        sec++
                        textView2.text=sec.toString()
                        handler.postDelayed(this,1000)
                    }
                })
                Toast.makeText(this,"Time Start",Toast.LENGTH_LONG).show()
            }
        }

        button2.setOnClickListener {
            flag=false
            Toast.makeText(this,"Time Pause",Toast.LENGTH_LONG).show()
            handler.removeCallbacksAndMessages(null)
        }

    }
}