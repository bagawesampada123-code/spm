package com.example.dialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var mydialog= AlertDialog.Builder(this)
            mydialog.setTitle("Confirm Action")
            mydialog.setMessage("Are you sure you want to do this?")
            mydialog.setPositiveButton("Yes")
            {
                dialog,which->
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
            mydialog.setNegativeButton("No")
            {
                    dialog,which->
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
            mydialog.setNeutralButton("Cancel")
            {
                    dialog,which->
                Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
            }
            mydialog.show()
        }
    }

}