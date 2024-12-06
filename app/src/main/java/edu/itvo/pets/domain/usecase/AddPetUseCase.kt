package edu.itvo.pets.domain.usecase


import edu.itvo.pets.data.model.PetModel
import edu.itvo.pets.domain.repositories.PetRepository
import javax.inject.Inject

class AddPetUseCase @Inject constructor(private val petRepository: PetRepository) {

    suspend fun addPet(petModel: PetModel) {
        petRepository.addPet(petModel)
    }


}