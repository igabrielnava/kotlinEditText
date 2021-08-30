package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import android.widget.EditText as EditText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit:android.widget.EditText = findViewById<EditText1>(R.id.texto)
        edit.addTextChangedListener(object: TextWatcher{

            override fun afterTextChanged(s:Editable?){

            }

            override fun beforeTextChanged(s: CharSequence?, start:Int, count:Int, after:Int){

            }

            override fun onTextChanged(s:CharSequence?, start:Int, before:Int, count:Int){
                val a:String = edit.text.toString()
                Toast.makeText(this@MainActivity, a, Toast.LENGTH_LONG).show()
            }

        })


    }
}