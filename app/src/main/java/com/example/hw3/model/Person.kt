package com.example.hw3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "persons")
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "First_name")
    val name: String,
    @ColumnInfo(name = "Age")
    val age: Int
)
