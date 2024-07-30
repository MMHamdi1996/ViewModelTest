package com.example.viewmodettest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVieModel : ViewModel() {
    var number = MutableLiveData<Int>()

    init {
        number.value = 0
    }

    fun setAddNumber() {
        number.value = number.value?.plus(1)
    }
}