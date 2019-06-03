package com.roxyapps.roxana.parcial1pdm.Activities


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.roxyapps.roxana.parcial1pdm.Adapter.BkballEquipoAdapter
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo
import com.roxyapps.roxana.parcial1pdm.Database.ViewModel.BkballEquipoViewModel
import com.roxyapps.roxana.parcial1pdm.R
import kotlinx.android.synthetic.main.equipo_lista_fragmento.*
import kotlinx.android.synthetic.main.puntajes.*

class BkballPuntajes : AppCompatActivity() {

    var score1 = 0
    var score2 = 0
    lateinit var viewModel: BkballEquipoViewModel
    lateinit var adapter: BkballEquipoAdapter
    /*
    private lateinit var player1: TextView
    private lateinit var player2: TextView
    private lateinit var scorea: TextView
    private lateinit var scoreb: TextView
    private lateinit var ganador: TextView*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.puntajes)

        val intent = intent

        val resultTvA = findViewById<TextView>(R.id.tv_player1)
        resultTvA.text = intent.extras.getString("Equipo1")

        val resultTvB = findViewById<TextView>(R.id.tv_player2)
        resultTvB.text = intent.extras.getString("Equipo2")

        playerA1Score()
        playerA2Score()
        playerA3Score()
        playerB1Score()
        playerB2Score()
        playerB3Score()
        ganador()
        /*
        player1 = findViewById(R.id.tv_player1)
        player2 = findViewById(R.id.tv_player2)
        scorea = findViewById(R.id.team_score1)
        scoreb = findViewById(R.id.team_score2)
        ganador = findViewById(R.id.ganador)

        val button = findViewById<Button>(R.id.fin)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(player1.text) and TextUtils.isEmpty(player2.text) and TextUtils.isEmpty(scorea.text) and TextUtils.isEmpty(scoreb.text) and TextUtils.isEmpty(ganador.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val p1 = player1.text.toString()
                val p2 = player2.text.toString()
                val sc1 = scorea.text.toString()
                val sc2 = scoreb.text.toString()
                val gan = ganador.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, p1)
                replyIntent.putExtra(EXTRA_REPLY, p2)
                replyIntent.putExtra(EXTRA_REPLY, sc1)
                replyIntent.putExtra(EXTRA_REPLY, sc2)
                replyIntent.putExtra(EXTRA_REPLY, gan)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }*/
    }

    fun playerA1Score()= team_apunto1.setOnClickListener {
        score1 = score1 + 1
        displayForEquipo1(score1)
    }
    fun playerA2Score()= team_apunto2.setOnClickListener {
        score1 = score1 + 2
        displayForEquipo1(score1)
    }
    fun playerA3Score()= team_apunto3.setOnClickListener {
        score1 = score1 + 3
        displayForEquipo1(score1)
    }

    private fun displayForEquipo1(score: Int){
        val scoreView = findViewById<View>(R.id.team_score1) as TextView
        scoreView.text = "" + score
    }

    fun playerB1Score()= team_bpunto1.setOnClickListener {
        score2 = score2 + 1
        displayForEquipo2(score2)
    }
    fun playerB2Score()= team_bpunto2.setOnClickListener {
        score2 = score2 + 2
        displayForEquipo2(score2)
    }
    fun playerB3Score()= team_bpunto3.setOnClickListener {
        score2 = score2 + 3
        displayForEquipo2(score2)
    }

    private fun displayForEquipo2(score: Int){
        val scoreView = findViewById<View>(R.id.team_score2) as TextView
         scoreView.text = "" + score
    }

    private fun ganador()= fin.setOnClickListener{
        if(score1>score2){
            val gano= findViewById<TextView>(R.id.ganador)
            gano.setText("Ganador equipo 1")
        }
        if(score1<score2){
            val gano= findViewById<TextView>(R.id.ganador)
            gano.setText("Ganador equipo 2")
        }
        if(score1==score2){
            val gano= findViewById<TextView>(R.id.ganador)
            gano.setText("Empate")
        }
    }
    companion object {
        const val EXTRA_REPLY = ":)"
    }
}