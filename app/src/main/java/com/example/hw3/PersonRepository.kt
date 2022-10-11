package com.example.hw3

import android.content.Context
import androidx.room.Room

class PersonRepository(applicationContext: Context) {

    var db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java,
        "db-persons").build()

    var getAllPersons = db.personDao().getAllPersons()
}