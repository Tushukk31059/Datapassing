package com.tushu.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etAge:EditText
    lateinit var etHeight:EditText
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName=findViewById(R.id.etName)
        etAge=findViewById(R.id.etAge)
        etHeight=findViewById(R.id.etHeight)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            if(etName.text.toString().isNullOrEmpty()){
                etName.error = "Enter your Name"
            }
            else if(etAge.text.toString().isNullOrEmpty()){
                etAge.error="Enter your Age"
            }
            else if(etHeight.text.toString().isNullOrEmpty()){
                etHeight.error="Enter your Height"
            }
            else{
                Toast.makeText(this,"done",Toast.LENGTH_LONG).show()
                var intent=Intent(this,MainActivity2::class.java)
                intent.putExtra("name",etName.text.toString() )
                intent.putExtra("age",etAge.text.toString().toInt())
                intent.putExtra("height",etHeight.text.toString().toFloat())
                startActivity(intent)
                finish()
            }
            }


        }

}

