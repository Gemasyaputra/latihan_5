package com.gema.latihan_

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var suhu : Button
    private lateinit var diskonn: Button
    private lateinit var blk : Button
    private lateinit var gjl : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        suhu = findViewById(R.id.suhu)
        diskonn = findViewById(R.id.diskonn)
        blk = findViewById(R.id.blk)
        gjl = findViewById(R.id.gjl)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        suhu.setOnClickListener(){
            val intent = Intent(this, konversi_suhu::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        diskonn.setOnClickListener(){
            val intent = Intent(this, diskon::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }


        blk.setOnClickListener(){
            val intent = Intent(this, balok::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        gjl.setOnClickListener(){
            val intent = Intent(this, ganjilgenap::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }
    }
}