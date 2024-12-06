package edu.itvo.pets.data.local

import edu.itvo.pets.data.model.PetModel
import edu.itvo.pets.data.model.PetResponse
import kotlinx.coroutines.flow.Flow

interface PetLocalDataSource {
    suspend fun  getPets(): Flow<PetResponse?>
    suspend fun  getPet(petId:Int): Flow<PetResponse>
    suspend fun  getPetRandom(): Flow<PetResponse>
    suspend fun  insertAll(pets : List<PetModel>)
    suspend fun  insert(pet : PetModel)
    suspend fun  update(pet : PetModel)
}