package com.example.effectivemobiletestcase.Domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val name: String,
    val secondName: String,
    val userNumber: String
)
