package com.fhz.myapplicationdemo01

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.fhz.myapplicationdemo01.MESSAGE";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 先通过ID找到控件
        // 为控件设置点击事件
    }

    fun sendMessage(view: View) {
        val tv = findViewById<EditText>(R.id.editText1)
        val toString = tv.text.toString()
        val apply = Intent(this, Text01Activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, toString)
        }
        startActivity(apply)
    }
}