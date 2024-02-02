package com.example.effectivemobiletestcase.Presenter.LoginScreen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.effectivemobiletestcase.Data.UserDatabase
import com.example.effectivemobiletestcase.Data.UserRepositoryImpl
import com.example.effectivemobiletestcase.Domain.UserEntity
import com.example.effectivemobiletestcase.Domain.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(application: Application): AndroidViewModel(application) {
    private val repository: UserRepository

    private val _allUsers = MutableStateFlow<List<UserEntity>>(emptyList())
    val allUsers: StateFlow<List<UserEntity>> get() = _allUsers

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepositoryImpl(userDao)
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            repository.getAllUsers().collect {
                _allUsers.value = it
            }
        }
    }

    fun addUser(user: UserEntity) {
        viewModelScope.launch {
            repository.addUser(user)
        }
    }

    fun deleteUser(user: UserEntity) {
        viewModelScope.launch {
            repository.deleteUser(user)
        }
    }
}