package com.example.dslab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySchedule(view: View) {
        var intent = Intent(this,Confirm::class.java)
        intent.putExtra("name", nameid.text.toString())
        intent.putExtra("address", addressid.text.toString())
        intent.putExtra("city", cityid.text.toString())
        intent.putExtra("state", stateid.text.toString())
        intent.putExtra("zip", zipid.text.toString())
        startActivity(intent)
    }
}