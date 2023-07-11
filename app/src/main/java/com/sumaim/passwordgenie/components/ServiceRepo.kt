package com.sumaim.passwordgenie.components

import androidx.lifecycle.LiveData
import com.sumaim.passwordgenie.database.ServiceDAO
import com.sumaim.passwordgenie.model.Service

class ServiceRepo(private val serviceDAO: ServiceDAO) {

    suspend fun insertService(service: Service) = serviceDAO.insertService(service)

    suspend fun deleteService(service: Service) = serviceDAO.deleteService(service)

    suspend fun updateService(service: Service) = serviceDAO.updateService(service)

    val getAllService: LiveData<List<Service>> = serviceDAO.getAllServices()
}