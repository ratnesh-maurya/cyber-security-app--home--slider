package com.example.cybersecurityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button3.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)

        }
        buttonp3.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}