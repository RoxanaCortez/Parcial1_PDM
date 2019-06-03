package com.roxyapps.roxana.parcial1pdm.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.roxyapps.roxana.parcial1pdm.R
import kotlinx.android.synthetic.main.registro_equipos.*

class BkballEquipoRegiter : AppCompatActivity() {

    companion object {
        const val newWordActivityRequestCode3 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_equipos)

        val  EtEquipo1= findViewById<EditText>(R.id.et_Equipo1)
        val  EtEquipo2= findViewById<EditText>(R.id.et_Equipo2)



        bt_iniciar.setOnClickListener {
            if (!et_Equipo1.text.toString().isEmpty() and !et_Equipo2.text.toString().isEmpty()) {
                val intent = Intent(this@BkballEquipoRegiter, BkballPuntajes::class.java)
                intent.putExtra("Equipo1",EtEquipo1.text.toString())
                intent.putExtra("Equipo2",EtEquipo2.text.toString())
                startActivityForResult(intent, newWordActivityRequestCode3)
            }
        }
    }
}