package com.roxyapps.roxana.parcial1pdm.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo
import com.roxyapps.roxana.parcial1pdm.R
import kotlinx.android.synthetic.main.elemento_equipo.view.*

class BkballEquipoAdapter (var equipos:List<BkballEquipo>): RecyclerView.Adapter<BkballEquipoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.elemento_equipo, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return equipos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(equipos[position])
    }

    fun updateList(newEquipos:List<BkballEquipo>){
        newEquipos.forEach{
            println("Hola")
        }
        this.equipos=newEquipos
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(equipo: BkballEquipo) = with(itemView) {
            this.tv_nombre1.text = equipo.PrimerEquipo
            this.tv_score1.text = equipo.PrimerEquipo
            this.tv_nombre2.text = equipo.SegundoEquipo
            this.tv_score2.text = equipo.SegundoPuntaje
            //this.tv_fecha.text = equipo.Fecha.toString()
            //this.tv_hora.text = equipo.Hora.toString()
        }

    }
}