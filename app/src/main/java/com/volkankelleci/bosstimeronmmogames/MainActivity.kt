package com.volkankelleci.bosstimeronmmogames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            }
    fun solgrandle(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView2.text="${p0/1000}"
            }
            override fun onFinish() {
                textView2.text="SG UP"
            }
        }.start()
    }
    fun hld(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView3.text="${p0/1000}"
            }
            override fun onFinish() {
                textView3.text="HLI UP"
            }
        }.start()
    }
    fun br(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView9.text="${p0/1000}"
            }
            override fun onFinish() {
                textView9.text="Brealeos UP"
            }
        }.start()
    }
    fun au(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView8.text="${p0/1000}"
            }
            override fun onFinish() {
                textView8.text="Aurion UP"
            }
        }.start()
    }
    fun mo(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView4.text="${p0/1000}"
            }
            override fun onFinish() {
                textView4.text="Moake UP"
            }
        }.start()
    }
    fun an(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView5.text="${p0/1000}"
            }
            override fun onFinish() {
                textView5.text="Ancheladus UP"
            }
        }.start()
    }
    fun ko(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView6.text="${p0/1000}"
            }
            override fun onFinish() {
                textView6.text="Kohinorr UP"
            }
        }.start()
    }
    fun mag(view: View){
        object : CountDownTimer(7200000 ,1000) {
            override fun onTick(p0: Long) {
                textView7.text="${p0/1000}"
            }
            override fun onFinish() {
                textView7.text="Magamadon UP"
            }
        }.start()
    }
    }


