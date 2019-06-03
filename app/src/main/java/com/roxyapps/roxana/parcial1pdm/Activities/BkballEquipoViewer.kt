package com.roxyapps.roxana.parcial1pdm.Activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
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

class BkballEquipoViewer : AppCompatActivity(){

    lateinit var viewModel:BkballEquipoViewModel
    lateinit var adapter:BkballEquipoAdapter

    companion object {
        const val newWordActivityRequestCode = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.equipo_lista_fragmento)
        bind()

    }

    private fun bind(){
        adapter= BkballEquipoAdapter(ArrayList())
        viewModel=ViewModelProviders.of(this).get(BkballEquipoViewModel::class.java)
        rv_equipos.apply {
            adapter=this@BkballEquipoViewer.adapter
            layoutManager=LinearLayoutManager(this@BkballEquipoViewer)
        }
        viewModel.allEquipos.observe(this, Observer {
            adapter.updateList(it)
        })
    }
}