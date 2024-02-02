package com.example.effectivemobiletestcase.Data

import com.example.effectivemobiletestcase.Domain.UserEntity
import com.example.effectivemobiletestcase.Domain.UserRepository
import kotlinx.coroutines.flow.Flow


class UserRepositoryImpl(private val userDao: UserDao) : UserRepository {
    override fun getAllUsers(): Flow<List<UserEntity>> = userDao.getAllUsers()
    override suspend fun getUser(id: Int): UserEntity {
        TODO("Not yet implemented")
    }

    override suspend fun addUser(user: UserEntity) {
        userDao.addUser(user)
    }

    override suspend fun deleteUser(user: UserEntity) {
        userDao.deleteUser(user)
    }
}