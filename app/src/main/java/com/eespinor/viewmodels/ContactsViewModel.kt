package com.eespinor.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel(
    val helloWorld: String
) : ViewModel() {

    var backgroundColor by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor() {
        this.backgroundColor = Color.Red
    }

}