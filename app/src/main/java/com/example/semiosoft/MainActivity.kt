package com.example.semiosoft

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //if (supportActionBar!=null){
        //    supportActionBar!!.hide()
       // }
        cardiovascularButton.setOnClickListener{
            val cardiovascular = Intent(applicationContext,CardiovascularActivity::class.java)
            startActivity(cardiovascular)
        }



    }
}
