package com.example.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class Mydb(var ct:Context):SQLiteOpenHelper(ct,"tyit",null,1)
{
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table demo(id integer primary key autoincrement,username varchar(10),password varchar(10))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun addData(un:String,pass:String){
        var ob=this.writableDatabase
        var cv=ContentValues()
        cv.put("username",un)
        cv.put("password",pass)
        var res=ob.insert("demo",null,cv)
        if(res>0)
        {
            Toast.makeText(ct,"rec insert",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(ct,"Error",Toast.LENGTH_LONG).show()
        }
    }

    fun readData():ArrayList<String>{
        var ob=this.readableDatabase
        var data=ArrayList<String>()
        var res=ob.rawQuery("select * from demo",null)
        if (res.moveToFirst())
        {
            do{
                data.add(res.getString(0).toString()+" "+res.getString(1).toString()+""+res.getString(2).toString())
            }while (
                res.moveToNext()
            )
        }
        return data
    }

    fun deleteRec(id:String){
        var ob=this.writableDatabase
        var res=ob.delete("demo","id=?",arrayOf("$id"))
        if(res==1){
            Toast.makeText(ct,"Rec delete",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(ct,"error",Toast.LENGTH_LONG).show()
        }
    }


}