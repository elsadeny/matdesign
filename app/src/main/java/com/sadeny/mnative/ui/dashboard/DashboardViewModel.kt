package com.sadeny.mnative.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to Travis/ Sadeny Alpha"
    }
    val text: LiveData<String> = _text
}