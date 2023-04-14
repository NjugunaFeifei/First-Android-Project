package com.example.phoneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculator : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var mSnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mMul:Button
    lateinit var mDiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEdFstNum)
        mSnum = findViewById(R.id.mEdSecNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMul = findViewById(R.id.mBtnMul)
        mDiv = findViewById(R.id.mBtnDiv)

        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()

            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please Enter the values"
            }else{
                var jibu = firstNumber.toDouble()+secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()

            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please Enter the values"
            }else{
                var jibu = firstNumber.toDouble()-secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()

            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please Enter the values"
            }else{
                var jibu = firstNumber.toDouble()*secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()

            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please Enter the values"
            }else{
                var jibu = firstNumber.toDouble()/secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
    }
}