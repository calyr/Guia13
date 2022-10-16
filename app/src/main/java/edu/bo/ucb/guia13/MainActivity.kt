package edu.bo.ucb.guia13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val button: Button get() = findViewById(R.id.button)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session.user = "calyr.software@gmail.com"

        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }
}