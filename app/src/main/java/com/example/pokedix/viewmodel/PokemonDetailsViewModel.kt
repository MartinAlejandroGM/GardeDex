package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.PokemonDex
import com.example.pokedix.models.Pokemon
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.example.pokedix.utils.coroutineExceptionHandler
import com.example.pokedix.viewmodel.flowstate.PokedexState
import com.example.pokedix.viewmodel.flowstate.PokemonState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokedixRepositoryImpl()
    private val _pokemonLiveData: MutableLiveData<Result<Pokemon>> = MutableLiveData()

    val pokemonLiveData: LiveData<Result<Pokemon>>
        get() = _pokemonLiveData

    private val _pokemonStateFlow: MutableStateFlow<PokemonState> = MutableStateFlow(PokemonState.Success(Pokemon()))

    val pokemonStateFlow: StateFlow<PokemonState>
        get() = _pokemonStateFlow

    fun fetchPokemon(pokedexSelected: PokemonDex){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _pokemonStateFlow.emit(PokemonState.Success(pokemonRepository.getPokemon(pokedexSelected)))
        }
    }
}