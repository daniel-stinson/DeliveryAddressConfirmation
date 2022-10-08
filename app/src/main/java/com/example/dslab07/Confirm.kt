package com.example.dslab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_confirm.*

class Confirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        snameid.text = intent.getStringExtra("name")
        saddressid.text = intent.getStringExtra("address")
        scityid.text = intent.getStringExtra("city")
        sstateid.text = intent.getStringExtra("state")
        szipid.text = intent.getStringExtra("zip")
    }
    fun Accept(view: View){
        var agree = Intent(this,ThankYou::class.java)
        startActivity(agree)
    }
    fun Edit(view:View){
        onBackPressed()
    }
}