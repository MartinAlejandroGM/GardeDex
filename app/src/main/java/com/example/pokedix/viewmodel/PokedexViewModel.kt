package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokedexList
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.example.pokedix.extensions.launch
import com.example.pokedix.extensions.Result

class PokedexViewModel(application: Application) : AndroidViewModel(application) {
    private val pokedexRepository = PokedixRepositoryImpl()
    private val _pokedexLiveData: MutableLiveData<Result<List<PokedexList>>> = MutableLiveData()

    val pokedexLiveData: LiveData<Result<List<PokedexList>>>
        get() = _pokedexLiveData

    fun fetchPokedex(gameUrl: String) {
        viewModelScope.launch(_pokedexLiveData, Dispatchers.IO) {
            val result = pokedexRepository.getPokedex(gameUrl)
            if (result.isNullOrEmpty())
                throw Exception("Empty PokemonView.")
            result
        }
    }
}