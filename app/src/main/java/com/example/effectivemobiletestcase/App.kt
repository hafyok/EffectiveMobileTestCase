package com.example.effectivemobiletestcase

import android.app.Application
import com.example.effectivemobiletestcase.Data.DB

class App: Application() {
    val database by lazy { DB.getDatabase(this)}

}