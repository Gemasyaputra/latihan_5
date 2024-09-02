package com.gema.latihan_

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class diskon : AppCompatActivity() {

    private lateinit var input : EditText
    private lateinit var buttonn: Button
    private lateinit var vieww : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon)

        input = findViewById(R.id.input)
        buttonn = findViewById(R.id.buttonn)
        vieww = findViewById(R.id.vieww)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonn.setOnClickListener(){

            val nilai = input.text.toString().toInt()

            if ( nilai >= 1000000){

                val hasil = nilai - (nilai * 0.3)
                vieww.setText("anda dapat 30% diskon menjadi :" + hasil)
            }

            else if ( nilai >=500000  && nilai < 1000000){

                val hasil = nilai - (nilai * 0.2)
                vieww.setText("anda dapat 20% diskon menjadi :" + hasil)
            }

            else if ( nilai >= 100000 && nilai < 500000){

                val hasil = nilai - (nilai * 0.1)
                vieww.setText("anda dapat 10% diskon menjadi :" + hasil)
            }

            else {
                val  hasil = nilai
                vieww.setText("anda tidak mendapat diskon, maka anda bayar harga normal :" + hasil)
            }
        }

    }
}