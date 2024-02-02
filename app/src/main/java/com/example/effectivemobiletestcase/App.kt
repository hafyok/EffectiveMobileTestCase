package com.example.effectivemobiletestcase

import android.app.Application
import com.example.effectivemobiletestcase.Data.UserDatabase

class App: Application() {
    val database by lazy { UserDatabase.getDatabase(this)}

}