package com.example.viewmodettest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVieModel : ViewModel() {
    var number = MutableLiveData<Int>()
    var evenOrOdd = MutableLiveData<Boolean>()

    init {
        number.value = 0
        evenOrOdd.value = true
    }

    fun setAddNumber() {
        number.value = number.value?.plus(1)
    }

    fun setEvenOrOdd (){
        if (number.value!! % 2 == 0)
            evenOrOdd.value = true
        else
            evenOrOdd.value = false

    }
}