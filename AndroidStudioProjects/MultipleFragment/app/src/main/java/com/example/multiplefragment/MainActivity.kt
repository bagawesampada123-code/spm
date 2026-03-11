package com.example.multiplefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var st=0
        button.setOnClickListener {
            if (st==0)
            {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,FirstFragment()).commit()
                st=1
            }
            else
            {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,SecondFragment()).commit()
                st=0
            }
        }


    }
}