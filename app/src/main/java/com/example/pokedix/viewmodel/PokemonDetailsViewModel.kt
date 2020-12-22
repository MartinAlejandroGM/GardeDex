package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokemonDetails
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import com.example.pokedix.repository.impl.PokemonRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokemonRepositoryImpl()
    private val _pokemonLiveData: MutableLiveData<PokemonDetails> = MutableLiveData()

    val pokemonLiveData: LiveData<PokemonDetails>
        get() = _pokemonLiveData

    fun fetchPokemon(pokemonName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _pokemonLiveData.postValue(pokemonRepository.getPokemon(pokemonName))
        }
    }
}