package com.example.chatmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val l1 : RelativeLayout = findViewById(R.id.l1)
        l1.setOnClickListener {
            val intent = Intent(this,List1Activity::class.java)
            startActivity(intent)
        }
        val l2 : RelativeLayout = findViewById(R.id.l2)
        l2.setOnClickListener {
            val intent = Intent(this, List2Activity ::class.java)
            startActivity(intent)
        }
        val l3 : RelativeLayout = findViewById(R.id.l3)
        l3.setOnClickListener {
            val intent = Intent(this, List3Activity::class.java)
            startActivity(intent)
        }
    }
}