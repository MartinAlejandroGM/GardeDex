package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokedexList
import com.example.pokedix.models.PokemonDetails
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.example.pokedix.extensions.launch
import com.example.pokedix.extensions.Result

class PokemonDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokedixRepositoryImpl()
    private val _pokemonLiveData: MutableLiveData<Result<PokemonDetails>> = MutableLiveData()

    val pokemonLiveData: LiveData<Result<PokemonDetails>>
        get() = _pokemonLiveData

    fun fetchPokemon(pokedexSelected: PokedexList){
        viewModelScope.launch(_pokemonLiveData, Dispatchers.IO) {
            val result = pokemonRepository.getPokemon(pokedexSelected)
            result
        }
    }
}