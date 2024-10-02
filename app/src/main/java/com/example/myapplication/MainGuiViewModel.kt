package com.example.myapplication;

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGuiViewModel: ViewModel() {

    private val _contador = MutableLiveData(0)
    var contador = _contador

    fun IncrementaContador(){
        _contador.value = _contador.value?.plus(1)
    }

}
