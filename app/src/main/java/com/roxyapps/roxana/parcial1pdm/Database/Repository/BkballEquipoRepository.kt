package com.roxyapps.roxana.parcial1pdm.Database.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.roxyapps.roxana.parcial1pdm.Database.Dao.BkballEquipoDao
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo

class BkballEquipoRepository (val BkballEquipoDao : BkballEquipoDao) {

    val allEquipos : LiveData<List<BkballEquipo>> = BkballEquipoDao.getAll()

    fun getAll() : LiveData<List<BkballEquipo>>{
        return BkballEquipoDao.getAll()
    }

    @WorkerThread
    fun insert(equipo: BkballEquipo){
        BkballEquipoDao.insert(equipo)
    }
}