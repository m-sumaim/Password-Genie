package com.sumaim.passwordgenie.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.sumaim.passwordgenie.model.Service

@Dao
interface ServiceDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertService(service: Service)

    @Delete
    suspend fun deleteService(service: Service)

    @Update
    suspend fun updateService(service: Service)

    @Query("SELECT * FROM service_table")
    fun getAllServices(): LiveData<List<Service>>
}