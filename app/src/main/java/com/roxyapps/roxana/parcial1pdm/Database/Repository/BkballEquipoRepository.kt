package com.roxyapps.roxana.parcial1pdm.Database.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.roxyapps.roxana.parcial1pdm.Database.Dao.BkballEquipoDao
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo

class BkballEquipoRepository (val BkballEquipoDao : BkballEquipoDao) {

    val AllEquipos : LiveData<List<BkballEquipo>> = BkballEquipoDao.getAll()

    fun GetAll() : LiveData<List<BkballEquipo>>{
        return BkballEquipoDao.getAll()
    }

    @WorkerThread
    fun Insert(equipo: BkballEquipo){
        BkballEquipoDao.Insert(equipo)
    }
}