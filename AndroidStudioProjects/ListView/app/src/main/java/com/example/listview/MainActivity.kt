package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data= arrayOf("Jan","feb","march","april","may")
        var adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,data)

        listview.adapter=adapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            var d=adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,"$d",Toast.LENGTH_LONG).show()
        }
    }
}