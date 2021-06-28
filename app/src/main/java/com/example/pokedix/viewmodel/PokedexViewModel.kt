package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokedexList
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokedexViewModel(application: Application) : AndroidViewModel(application) {
    private val pokedexRepository = PokedixRepositoryImpl()
    private val _pokedexLiveData: MutableLiveData<List<PokedexList>> = MutableLiveData()

    val pokedexLiveData: LiveData<List<PokedexList>>
        get() = _pokedexLiveData

    fun fetchPokedex(gameUrl: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _pokedexLiveData.postValue(pokedexRepository.getPokedex(gameUrl))
        }
    }
}