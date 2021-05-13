package com.fhz.myapplicationdemo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Text01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text01)

        val stringExtra = intent.getStringExtra(EXTRA_MESSAGE)
        val apply = findViewById<TextView>(R.id.textView3).apply {
            text = stringExtra
        }
    }
}