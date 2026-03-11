package com.example.radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var btnid=rbg.checkedRadioButtonId

            var rb:RadioButton=findViewById(btnid)
            textView.text=rb.text.toString()

            rbg.setOnCheckedChangeListener { radioGroup, i ->
                var btnid=rbg.checkedRadioButtonId

                var rb:RadioButton=findViewById(btnid)
                textView.text=rb.text.toString()
            }
        }


    }
}