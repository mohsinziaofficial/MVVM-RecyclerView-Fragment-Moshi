package com.example.mvvmrecyclerviewfragment.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmrecyclerviewfragment.booksDataClass.Item
import com.example.mvvmrecyclerviewfragment.network.Repository
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    private var mutableReponseList = MutableLiveData<List<Item>>()
    val liveDataResponse : LiveData<List<Item>> = mutableReponseList

    private val repository by lazy {
        Repository()
    }

    fun getResponse(input : String) = viewModelScope.launch {
        var response = repository.getAllDataFromResponse(input)
        mutableReponseList.postValue(response)
    }
}