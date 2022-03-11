package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val  buttonSubmit1=findViewById<TextView>(R.id.cirRegisterButton)
        buttonSubmit1.setOnClickListener {
            val mainactivity2Intent = Intent(this@signup, login::class.java)
            startActivity(mainactivity2Intent)
            val duration = Toast.LENGTH_SHORT

            Toast.makeText(this, "welcome " , Toast.LENGTH_SHORT) .show ();

        }
    }
}