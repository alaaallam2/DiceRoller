package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import javax.crypto.Mac

class splash : AppCompatActivity() {
    private  val  splashScreentimage :Long =2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startActivity(Intent(this,login::class.java))
            finish()
        },splashScreentimage)


    }
}