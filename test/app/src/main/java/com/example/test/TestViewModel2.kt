package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel2: ViewModel() {
    val user: MutableLiveData<User> by lazy { MutableLiveData<User>() }
}