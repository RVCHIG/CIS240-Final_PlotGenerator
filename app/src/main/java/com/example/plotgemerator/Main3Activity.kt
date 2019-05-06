package com.example.plotgemerator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var chara = mutableListOf("Aqua", "Bob", "Carol", "Darkness", "Edgar", "Faye", "Greg", "Hass", "Iggy", "Jeb", "Kazuma", "Lenny", "Megumin", "Nick", "Ophelia", "Wiz", "Vanir", "Yunyun")
        var thing = mutableListOf("a good man", "a good woman", "world peace", "complete global saturation", "to sleep", "a pony", "all of the drugs", "to be a whaler on the moon", "a bitchin' Camaro", "the Dragon Balls", "to be a NEET", "to go back to heaven", "to explode", "to be dominated", "to dominate", "to finish this class", "a glass of water", "a pint", "a Red Rider BB Gun", "money")
        var fuck = mutableListOf("me", "a bad man", "a bad woman", "a better man", "a better woman", "peanut allergies", "zombies", "Luchador cartels", "those meddling kids", "those meddling adults", "everything", "Kazuma's lazy ass", "a lack of mana", "decency laws", "time dinosaurs", "robot Hitler", "actual Hitler", "their crippling masochism", "general fuckuppery", "their evil twin")

        class plotGenerator (val plotChara: String, val plotThing: String, val plotFuck: String)
        var plot = plotGenerator(chara.random(), thing.random(), fuck.random())


        val btnran = findViewById<Button>(R.id.btnRandom)
        btnran.setOnClickListener{
            val intent = Intent(this, Main4Activity::class.java)
            intent.putExtra("SendPlotChara", plot.plotChara)
            intent.putExtra("SendPlotThing", plot.plotThing)
            intent.putExtra("SendPlotFuck", plot.plotFuck)
            startActivity(intent)

        }

        val btnhome = findViewById<Button>(R.id.btnHome)
        btnhome.setOnClickListener{
            this.finish() }
    }
}
