package com.example.phoneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalculator:Button
    lateinit var mContacts:Button
    lateinit var mWebsite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalculator = findViewById(R.id.mBtnCalc)
        mContacts = findViewById(R.id.mBtnContacts)
        mWebsite = findViewById(R.id.mBtnWebsite)
    }
}