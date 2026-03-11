package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var b_r = object:BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            if (p1?.action==Intent.ACTION_AIRPLANE_MODE_CHANGED){
                //Toast.makeText(p0,"Airplane body on",Toast.LENGTH_LONG).show()
                var flag=p1.getBooleanExtra("state",false)
                if(flag){
                    Toast.makeText(p0,"Airplane body on",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(p0,"Airplane body off",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        registerReceiver(b_r, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(b_r)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}