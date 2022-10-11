package com.example.hw3

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hw3.model.Person

@Database(entities = [Person::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}