package com.tushu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var etName: TextView
    lateinit var etAge: TextView
    lateinit var etHeight: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name = intent.getStringExtra("name")
        var age=intent.getIntExtra("age",0)
        var height=intent.getFloatExtra("height", 0.0f)
        etName=findViewById(R.id.etName)
        etAge=findViewById(R.id.etAge)
        etHeight=findViewById(R.id.etHeight)


        etName.setText("Your name is $name")
        etAge.setText("Your Age is $age")
        etHeight.setText("Your height is $height")
        System.out.println("name $name")
        System.out.println("age $age")
        System.out.println("height $height")

    }
}