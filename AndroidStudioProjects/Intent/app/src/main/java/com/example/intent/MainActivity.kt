package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var udata=editTextTextPersonName.text.toString()
            var sendData=Intent(Intent.ACTION_SEND)

            sendData.putExtra(Intent.EXTRA_TEXT,udata.toString())
            sendData.type="text/plain"

            var selectApp=Intent.createChooser(sendData,null)
            startActivity(selectApp)
        }

        button2.setOnClickListener {
            var url=Intent(Intent.ACTION_VIEW)
            url.setData(Uri.parse("https://www.instagram.com"))
            startActivity(url)
        }
    }
}