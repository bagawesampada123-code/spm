package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var pm:PopupMenu=PopupMenu(this,button)
            pm.menuInflater.inflate(R.menu.my_menu,pm.menu)

            pm.setOnMenuItemClickListener {
                if (it.itemId==R.id.one)
                {
                    Toast.makeText(this,"Copied",Toast.LENGTH_LONG).show()
                }
                true
            }
            pm.show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId==R.id.one)
        {
            Toast.makeText(this,"Copied",Toast.LENGTH_LONG).show()
        }
        if(item.itemId==R.id.two)
        {
            Toast.makeText(this,"Paste",Toast.LENGTH_LONG).show()
        }
        if(item.itemId==R.id.t)
        {
            Toast.makeText(this,"New file",Toast.LENGTH_LONG).show()
        }
        if(item.itemId==R.id.f)
        {
           System.exit(0)
        }
        return super.onOptionsItemSelected(item)
    }

}