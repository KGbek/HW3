package com.example.hw3

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.hw3.model.Person

@Dao
interface PersonDao {

    @Query("SELECT * FROM persons")
    fun getAllPersons() : List<Person>

    @Query("SELECT * FROM persons WHERE id = :id")
    fun getPersonById(id: Long)

    @Insert
    fun putPerson(person: Person)

    @Update
    fun updatePerson(person: Person)

    @Delete
    fun deletePerson(person: Person)
}