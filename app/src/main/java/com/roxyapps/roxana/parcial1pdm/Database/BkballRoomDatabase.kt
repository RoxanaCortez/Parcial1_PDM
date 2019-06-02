package com.roxyapps.roxana.parcial1pdm.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.roxyapps.roxana.parcial1pdm.Database.Dao.BkballEquipoDao
import com.roxyapps.roxana.parcial1pdm.Database.Entity.BkballEquipo

@Database(entities = [BkballEquipo::class], version = 1, exportSchema = false)
abstract class BkballRoomDatabase : RoomDatabase() {

    abstract fun BkballEquipoDao() : BkballEquipoDao

    companion object {
        @Volatile
        private  var INSTANCE : BkballRoomDatabase? = null

        fun getInstance(
            context: Context
        ): BkballRoomDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room
                    .databaseBuilder(context.applicationContext, BkballRoomDatabase::class.java, "Equipos")
                    .build()
                    INSTANCE =instance
                    return instance
            }
        }
    }
}