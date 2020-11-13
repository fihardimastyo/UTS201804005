package com.example.uts201804005

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val menu_data = findViewById<Button>(R.id.menu_data)
        val menu_skill = findViewById<Button>(R.id.menu_skill)

        menu_data.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
        menu_skill.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}