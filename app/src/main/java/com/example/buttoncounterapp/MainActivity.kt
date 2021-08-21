package com.example.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var btn_inc: Button? = null
    private var inc_number_text: TextView? = null
    private var inc_number: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_inc = findViewById(R.id.btn_inc)
        inc_number_text = findViewById(R.id.inc_number_text)

        btn_inc?.setOnClickListener {
            inc_number++
            inc_number_text?.text = inc_number.toString()
        }
    }
}