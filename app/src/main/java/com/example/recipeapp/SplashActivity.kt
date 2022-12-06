package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val button=findViewById<Button>(R.id.btnGetStarted)

        button.setOnClickListener {


            var intent=Intent(this@SplashActivity,HomeActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}