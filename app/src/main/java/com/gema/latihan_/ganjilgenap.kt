package com.gema.latihan_

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ganjilgenap : AppCompatActivity() {

    private lateinit var  angka : EditText
    private  lateinit var tombol : Button
    private lateinit var cek : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjilgenap)

        angka = findViewById(R.id.angka)
        tombol = findViewById(R.id.tombol)
        cek = findViewById(R.id.cek)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tombol.setOnClickListener(){
            val ang = angka.text.toString().toInt()

            if ( ang % 2 == 0){
                cek.setText(" $ang adalah angka genap")
            }

            else {
                cek.setText(" $ang adalah angka ganjil")
            }
        }
    }
}