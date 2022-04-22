package com.emon.viewmodelfactory

import androidx.lifecycle.ViewModel

class MainViewModel(val counter: Int) : ViewModel() {

    var count: Int = counter

    fun increment(){
        count++
    }

    fun decrement(){

        if (count > 0){
            count--
        }
    }


}