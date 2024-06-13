package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.tabs.TabLayout.TabGravity
import java.lang.NullPointerException


class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"Activity is getting started")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"Activity is started")
    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG,"Activity has paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Activity has Stopped")
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"Activity has Destroyed")
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler", "button Clicked")
        //var dailIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("9630928324")) //Intent = Intention
        var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ndtv.com"))
        startActivity(webIntent)
        throw NullPointerException("demo crash")
    }
}
