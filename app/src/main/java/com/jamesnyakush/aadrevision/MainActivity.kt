package com.jamesnyakush.aadrevision

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.jamesnyakush.aadrevision.utils.NotificationHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var snackbar: Snackbar
    val title =  "AAD Certification"
    val body = "Welcome to AAD Certification its something amazing "

    companion object {
        const val CHANNEL_ID = "aad_rev"
        private const val CHANNEL_NAME = "aad revision"
        private const val CHANNEL_DESC = "aad revision"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        snack_click.setOnClickListener(this)
        toast_click.setOnClickListener(this)
        notic_click.setOnClickListener(this)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT)
            channel.description = CHANNEL_DESC
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(channel)
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.toast_click -> {
                Toast.makeText(
                    this,
                    "Welcome To AAD Certification Exams",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.snack_click -> {
                snackbar = Snackbar.make(
                    snack_layout,
                    "This is An AAD Snackbar Revision",
                    Snackbar.LENGTH_LONG
                )
                snackbar.show()
            }
            R.id.notic_click -> {
                NotificationHelper.displayNotification(this, title, body)
            }
        }
    }


}
