package com.example.myapp10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val helloText = findViewById<TextView>(R.id.textView1)
        var itr=0;
        btnClickMe.setOnClickListener {
          itr++;
            helloText.text=itr.toString()
            Toast.makeText(this,"Good Job",Toast.LENGTH_SHORT).show()

        }
    }
}