package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        val  buttonSubmit=findViewById<Button>(R.id.cirLoginButton)
        val  buttonSubmit1=findViewById<TextView>(R.id.signup)
        buttonSubmit.setOnClickListener {
            val mainactivity2Intent = Intent(this@login, MainActivity::class.java)
            startActivity(mainactivity2Intent)
            val duration = Toast.LENGTH_SHORT

            Toast.makeText(this, "welcome " ,Toast.LENGTH_SHORT) .show ();

        }
        buttonSubmit1.setOnClickListener {
            val mainactivity1Intent = Intent(this@login, signup::class.java)
            startActivity(mainactivity1Intent)
            val duration = Toast.LENGTH_SHORT

        }
    }
    }
