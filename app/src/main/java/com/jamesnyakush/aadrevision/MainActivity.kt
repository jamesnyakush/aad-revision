package com.jamesnyakush.aadrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var snackbar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snack_click.setOnClickListener(this)
        toast_click.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.toast_click -> {
                Toast.makeText(this,
                    "Welcome To AAD Certification Exams",
                    Toast.LENGTH_LONG).show()
            }
            R.id.snack_click -> {
                snackbar = Snackbar.make(
                    snack_layout,
                    "This is An AAD Snackbar Revision",
                    Snackbar.LENGTH_LONG
                )
                snackbar.show()
            }
        }
    }


}
