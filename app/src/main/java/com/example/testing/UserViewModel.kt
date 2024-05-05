package com.example.testing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class User(val nama: String, val email: String)

class UserViewModel: ViewModel() {
    private val _user = MutableLiveData<User>()
    val user : LiveData<User> = _user

    fun setUser(nama: String, email: String){
        _user.value = User(nama, email)
    }
}