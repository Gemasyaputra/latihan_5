package com.gema.latihan_

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class balok : AppCompatActivity() {

    private lateinit var panjang : EditText
    private lateinit var lebar : EditText
    private lateinit var tinggi : EditText
    private lateinit var luas : Button
    private lateinit var volume : Button
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_balok)

        panjang =findViewById(R.id.panjang)
        tinggi =findViewById(R.id.tinggi)
        lebar =findViewById(R.id.lebar)
        luas =findViewById(R.id.luas)
        volume =findViewById(R.id.volume)
        hasil =findViewById(R.id.hasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        luas.setOnClickListener(){
            val pjg = panjang.text.toString().toInt()
            val lbr = lebar.text.toString().toInt()
            val tgi = tinggi.text.toString().toInt()

            val hsl = 2 * (pjg * lbr + pjg * tgi + lbr * tgi)

            hasil.setText("luas balok tersebut adalah : " + hsl)

        }
        volume.setOnClickListener() {
            val pjg = panjang.text.toString().toInt()
            val lbr = lebar.text.toString().toInt()
            val tgi = tinggi.text.toString().toInt()

            val hsl = pjg * lbr * tgi
            hasil.setText("volume balok tersebut adalah : " + hsl)


        }
        }
}