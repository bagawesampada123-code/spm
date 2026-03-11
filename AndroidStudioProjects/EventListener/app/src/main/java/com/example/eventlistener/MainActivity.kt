package com.example.eventlistener

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Toast.makeText(this,"ON CLICK",Toast.LENGTH_LONG).show()
        }
        button.setOnLongClickListener {
            Toast.makeText(this,"ON LONG CLICK",Toast.LENGTH_LONG).show()
            bgcolor.setBackgroundColor(Color.YELLOW)
            true
        }
        imageView.setOnTouchListener { view, motionEvent ->
            when(motionEvent.action){
                MotionEvent.ACTION_DOWN->textView.text="Action Down"

                MotionEvent.ACTION_UP->textView.text="Action Up"

                MotionEvent.ACTION_MOVE->textView.text="Action Move"
            }
            true
        }

        udata.setOnKeyListener { view, i, keyEvent ->
            if (keyEvent.keyCode==KeyEvent.KEYCODE_ENTER){
                textView.text="Enter Button Click"
            }
                true
        }



    }
}