package com.example.effectivemobiletestcase.Data

import com.example.effectivemobiletestcase.Domain.UserEntity
import com.example.effectivemobiletestcase.Domain.UserRepository

class UserRepositoryImpl(
    private val userDao: UserDao
): UserRepository {

    override suspend fun getUser(id: Int) = userDao.getUser(id)


    override suspend fun addUser(user: UserEntity) = userDao.addUser(user)

    override suspend fun deleteUser(user: UserEntity) = userDao.deleteUser(user)
}