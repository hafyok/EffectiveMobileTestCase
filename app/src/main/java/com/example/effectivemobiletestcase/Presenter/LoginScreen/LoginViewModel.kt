package com.example.effectivemobiletestcase.Presenter.LoginScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.effectivemobiletestcase.App
import com.example.effectivemobiletestcase.Data.DB

@Suppress("UNCHECKED_CAST")
class LoginViewModel(database: DB): ViewModel() {
    val itemsList = database.dao.getAllUsers()
    companion object{
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
            @Suppress("UNCHECKED_CAST")
            override fun <T: ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras): T{
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                return LoginViewModel(database) as T
            }
        }
    }
    init {
        //val taskDao = DB.getDatabase(application).dao()


    }
}