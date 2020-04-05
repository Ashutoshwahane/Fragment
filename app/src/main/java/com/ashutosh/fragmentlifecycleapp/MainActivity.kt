package com.ashutosh.fragmentlifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    var isfragmentoneloader = true
    var isfragmenttwoloader = true
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val change = findViewById<Button>(R.id.btnchange)
        showFragmentOne()
        change.setOnClickListener {if (isfragmentoneloader){
            showFragmentTwo()
        }else {
            if(isfragmenttwoloader) {
                showFragmentOne()
            }else
                showFragmentTwo()
        }
        }
    }

    fun showFragmentOne(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isfragmentoneloader = true
    }
    fun showFragmentTwo(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isfragmenttwoloader = true
    }
}
