package com.example.telephone_api

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numbers= arrayOf("9876543234","8765465765","8765465768")
        var numAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,numbers)
        lv.adapter=numAdapter

        lv.setOnItemLongClickListener { adapterView, view, i, l ->
            var num=lv.getItemAtPosition(i).toString()
            var calling=Intent(Intent.ACTION_CALL)
            calling.setData(Uri.parse("tel:$num"))
            startActivity(calling)
            true
        }

        button.setOnClickListener {
            var calling=Intent(Intent.ACTION_CALL)
            calling.setData(Uri.parse("tel:8797867576"))
            startActivity(calling)
        }

    }
}