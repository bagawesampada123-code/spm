package com.example.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var newPage=Intent(this,Second::class.java)
            var uData=text1.text.toString()
            newPage.putExtra("my data",uData)
           // newPage.putExtra("my data","TYIT")
            startActivity(newPage)
        }
    }

}