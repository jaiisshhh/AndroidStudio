package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler", "button Clicked")
        var dailIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("9630928324")) //Intent = Intention
        var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ndtv.com"))
        startActivity(webIntent)
    }
}
