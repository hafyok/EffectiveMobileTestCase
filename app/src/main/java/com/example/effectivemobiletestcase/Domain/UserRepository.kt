package com.example.effectivemobiletestcase.Domain

interface UserRepository {
    suspend fun getUser(id: Int): UserData

    suspend fun addUser(user: UserData)

    //fun updateUser(id: Int): UserData
    suspend fun deleteUser(user: UserData)
}