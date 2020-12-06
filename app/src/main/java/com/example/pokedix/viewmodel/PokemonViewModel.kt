package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokemonList
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokedixRepositoryImpl()
    private val _pokemonLiveData: MutableLiveData<List<PokemonList>> = MutableLiveData()

    val pokemonLiveData: LiveData<List<PokemonList>>
        get() = _pokemonLiveData

    fun fetchPokedex(gameUrl: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _pokemonLiveData.postValue(pokemonRepository.getPokedex(gameUrl))
        }
    }
}