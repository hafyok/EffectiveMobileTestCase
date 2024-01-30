package com.example.effectivemobiletestcase.Data

import com.example.effectivemobiletestcase.Domain.UserData
import com.example.effectivemobiletestcase.Domain.UserRepository

class UserRepositoryImpl(
    private val userDao: UserDao
): UserRepository {

    override suspend fun getUser(id: Int) = userDao.getUser(id)


    override suspend fun addUser(user: UserData) = userDao.addUser(user)

    override suspend fun deleteUser(user: UserData) = userDao.deleteUser(user)
}