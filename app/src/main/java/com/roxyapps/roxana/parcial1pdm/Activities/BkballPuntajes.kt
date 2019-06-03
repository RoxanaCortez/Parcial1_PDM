package com.roxyapps.roxana.parcial1pdm.Activities


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.roxyapps.roxana.parcial1pdm.R

class BkballPuntajes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.puntajes)

        val intent = intent

        val resultTvA = findViewById<TextView>(R.id.tv_player1)
        resultTvA.text = intent.extras.getString("Equipo1")

        val resultTvB = findViewById<TextView>(R.id.tv_player2)
        resultTvB.text = intent.extras.getString("Equipo2")


    }
}