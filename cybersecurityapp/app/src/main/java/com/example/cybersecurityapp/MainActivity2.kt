package com.example.cybersecurityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button2.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)

        }

        buttonp1.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}