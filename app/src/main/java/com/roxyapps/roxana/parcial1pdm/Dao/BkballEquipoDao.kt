package com.roxyapps.roxana.parcial1pdm.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.roxyapps.roxana.parcial1pdm.Entity.BkballEquipo

@Dao
interface BkballEquipoDao {
    @Query("SELECT * FROM BkballEquipo")
    fun getAll():LiveData<List<BkballEquipo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun Insert(equipo: BkballEquipo)
}