package com.roxyapps.roxana.parcial1pdm.Database.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.roxyapps.roxana.parcial1pdm.Database.BkballRoomDatabase
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo
import com.roxyapps.roxana.parcial1pdm.Database.Repository.BkballEquipoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BkballEquipoViewModel (private val app : Application) : AndroidViewModel(app){

    private val repository : BkballEquipoRepository
    val allEquipos : LiveData<List<BkballEquipo>>

    init {
        val equipo = BkballRoomDatabase.getInstance(app).BkballEquipoDao()
        repository = BkballEquipoRepository(equipo)
        allEquipos = repository.getAll()
    }

    fun insert(BkballEquipo : BkballEquipo) = viewModelScope.launch(Dispatchers.IO){

        repository.insert(BkballEquipo)
    }
    fun getAll() : LiveData<List<BkballEquipo>>{
        return repository.getAll()
    }
}