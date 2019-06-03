package com.roxyapps.roxana.parcial1pdm.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.roxyapps.roxana.parcial1pdm.R
import kotlinx.android.synthetic.main.botones_fragmento.*

class MainActivity : AppCompatActivity() {


    companion object {
        const val newWordActivityRequestCode = 1
        const val newWordActivityRequestCode2 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.botones_fragmento)


        bt_consultar.setOnClickListener { view ->
            val intent = Intent(this@MainActivity, BkballEquipoViewer::class.java)
            startActivityForResult(intent,
                newWordActivityRequestCode
            )
        }

        bt_registrar.setOnClickListener { view ->
            val intent2 = Intent (this@MainActivity, BkballEquipoRegiter::class.java)
            startActivityForResult(intent2, newWordActivityRequestCode2)
        }
    }

}
