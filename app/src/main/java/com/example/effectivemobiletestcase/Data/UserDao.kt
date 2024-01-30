package com.example.effectivemobiletestcase.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.example.effectivemobiletestcase.Domain.UserData

@Dao
interface UserDao {
    @Query("SELECT * FROM UserEntity WHERE id = :id")
    suspend fun getUser(id: Int): UserData

    @Insert(onConflict = IGNORE)
    suspend fun addUser(user: UserData)

    @Update
    suspend fun updateUser(user: UserData)

    @Delete
    suspend fun deleteUser(user: UserData)
}