package com.volkankelleci.bosstimeronmmogames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity(millisInFuture: Long) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }

        }
    }
}