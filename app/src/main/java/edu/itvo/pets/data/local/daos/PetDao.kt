package edu.itvo.pets.data.local.daos

import androidx.room.*
import edu.itvo.pets.data.local.entities.PetEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PetDao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(quote: PetEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(quotes: List<PetEntity>)

    @Query("SELECT * FROM pet ORDER BY name ASC")
    fun getPets(): Flow<List<PetEntity>>

    @Query("SELECT * FROM pet WHERE id = :petId")
    fun getPet(petId: Int): Flow<PetEntity>

    @Query("SELECT * FROM pet ORDER BY random() LIMIT 1")
    fun getPetRandom(): Flow<PetEntity>

    @Query("DELETE FROM pet")
    fun deleteAll(): Int

    @Query("DELETE FROM pet WHERE id=:petId ")
    fun delete(petId: Int): Int

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(pet: PetEntity): Int

}