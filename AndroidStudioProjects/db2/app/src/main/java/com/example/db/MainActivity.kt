package com.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var dbObj=Mydb(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var u = un.text.toString()
            var p = pass.text.toString()
            dbObj.addData(u,p)
            readValue()
        }
        readValue()

        list_view.setOnItemLongClickListener { adapterView, view, i, l ->
            var id=list_view.getItemIdAtPosition(i).toString()[0].toString()
            dbObj.deleteRec(id)
            readValue()
            true
        }
    }

    fun readValue(){
        var table_data:ArrayList<String> =dbObj.readData()
        var dataAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,table_data)
        list_view.adapter=dataAdapter
    }
}