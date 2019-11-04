package org.marissajones.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number1=findViewById<View>(R.id.editText1)as EditText
        var number2=findViewById<View>(R.id.editText2)as EditText
        var output=findViewById<View>(R.id.sum)as TextView
        var addition=findViewById<View>(R.id.addition)as Button
        var subtraction=findViewById<View>(R.id.subtraction)as Button
        addition.setOnClickListener(view.OnClickListener {
            output.text="addition="+(number1.text.toString().toInt()+number2.text.toString().toInt()).toString()
            output.text="subtraction="+(number1.text.toString().toInt()+number2.text.toString().toInt()).toString()
        })
    }
}

