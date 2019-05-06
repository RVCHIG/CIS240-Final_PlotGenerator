package com.example.plotgemerator

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val txtview = findViewById<TextView>(R.id.txtView)
        val btnHome = findViewById<Button>(R.id.btnHome)

        var pCharShow: String = intent.getStringExtra("SendPlotChara")
        var pThingShow: String = intent.getStringExtra("SendPlotThing")
        var pFuckShow: String = intent.getStringExtra("SendPlotFuck")
        txtview.text ="Plot: ${pCharShow} wants ${pThingShow}, but is opposed by ${pFuckShow}."

        btnHome.setOnClickListener{
            this.finish() }


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
