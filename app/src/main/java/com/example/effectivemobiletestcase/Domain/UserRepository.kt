package com.example.effectivemobiletestcase.Domain

interface UserRepository {
    suspend fun getUser(id: Int): UserEntity

    suspend fun addUser(user: UserEntity)

    //fun updateUser(id: Int): UserData
    suspend fun deleteUser(user: UserEntity)
}