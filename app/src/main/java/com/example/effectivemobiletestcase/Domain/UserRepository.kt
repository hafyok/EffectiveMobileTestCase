package com.example.effectivemobiletestcase.Domain

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getAllUsers(): Flow<List<UserEntity>>
    suspend fun getUser(id: Int): UserEntity

    suspend fun addUser(user: UserEntity)

    //fun updateUser(id: Int): UserData
    suspend fun deleteUser(user: UserEntity)
}