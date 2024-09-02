package com.gema.latihan_

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konversi_suhu : AppCompatActivity() {

    private lateinit var celcius : EditText
    private  lateinit var textView4 : TextView
    private lateinit var fh : Button
    private lateinit var rm : Button
    private lateinit var kl : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)

        celcius =findViewById(R.id.celcius)
        textView4 =findViewById(R.id.textView4)
        kl =findViewById(R.id.kl)
        fh =findViewById(R.id.fh)
        rm =findViewById(R.id.rm)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fh.setOnClickListener(){
        val cel = celcius.text.toString().toInt()

        val hasil =  cel * 1.8 + 32

            textView4.setText("suhu dalam fahreinheit :"+hasil)
        }

        kl.setOnClickListener(){
            val cel = celcius.text.toString().toInt()

            val hasil =  cel + 273.15

            textView4.setText("suhu dalam kelvin :"+hasil)
        }

        rm.setOnClickListener(){
            val cel = celcius.text.toString().toInt()

            val hasil =  cel * 0.8

            textView4.setText("suhu dalam kelvin :"+hasil)
        }

    }
}