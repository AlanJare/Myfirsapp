package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView32dotexto = findViewById<TextView>(R.id.textView32dotexto)

        findViewById<Button>(R.id.buttonready).setOnClickListener {
            textView32dotexto.visibility = View.VISIBLE

            findViewById<TextView>(R.id.textView2Hello).text = "Tu puedes Alan!!! "
        }
    }
}