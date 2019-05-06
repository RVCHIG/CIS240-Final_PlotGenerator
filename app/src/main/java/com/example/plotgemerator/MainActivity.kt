package com.example.plotgemerator

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btngo = findViewById<Button>(R.id.btnRandomizer)
        val txtChar = findViewById<EditText>(R.id.txtCharacter)
        val txtThing = findViewById<EditText>(R.id.txtThing)
        val txtFuck = findViewById<EditText>(R.id.txtFuckery)
        val btnGen = findViewById<Button>(R.id.btnGenerate)


        btngo.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }

        btnGen.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendChar", txtChar.text.toString())
            intent.putExtra("SendThing", txtThing.text.toString())
            intent.putExtra("SendFuck", txtFuck.text.toString())
            startActivity(intent)
        }

        findViewById<View>(android.R.id.content).setOnTouchListener { _, event ->
            hideKeyboard()
            false
        }
    }
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            println("It's fucked.")
        }

    }

}
