package com.roxyapps.roxana.parcial1pdm.Database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date
import java.sql.Time

@Entity(tableName = "BkballEquipo")
data class BkballEquipo (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id:Int,

    @ColumnInfo(name = "PrimerEquipo") val PrimerEquipo : String,
    @ColumnInfo(name = "PrimerPuntaje") val PrimerPuntaje : String,

    @ColumnInfo(name = "SegundoEquipo") val SegundoEquipo : String,
    @ColumnInfo(name = "SegundoPuntaje") val SegundoPuntaje : String,

    @ColumnInfo(name = "Fecha") val Fecha : Date,
    @ColumnInfo(name = "Hora") val Hora : Time

)