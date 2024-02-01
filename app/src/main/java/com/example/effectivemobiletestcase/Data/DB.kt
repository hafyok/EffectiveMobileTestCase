package com.example.effectivemobiletestcase.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.effectivemobiletestcase.Domain.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class DB : RoomDatabase() {
    abstract val dao: UserDao

    companion object {
        /*@Volatile
        private var INSTANCE: DB? = null*/

        fun getDatabase(context: Context): DB {
            return Room.databaseBuilder(
                context,
                DB::class.java,
                "app_db"
            ).build()
            //INSTANCE = instance
            //instance
        }
    }
}
