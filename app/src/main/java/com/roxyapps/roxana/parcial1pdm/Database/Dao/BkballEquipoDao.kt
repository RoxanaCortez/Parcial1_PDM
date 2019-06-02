package com.roxyapps.roxana.parcial1pdm.Database.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo

@Dao
interface BkballEquipoDao {
    @Query("SELECT * FROM BkballEquipo")
    suspend fun getAll():LiveData<List<BkballEquipo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     suspend fun Insert(equipo: BkballEquipo)
}