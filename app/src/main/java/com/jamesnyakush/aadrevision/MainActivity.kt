package com.jamesnyakush.aadrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // this is a toast
        Toast.makeText(this,"Welcome To AAD Certification Exams",Toast.LENGTH_LONG).show()
    }
}
