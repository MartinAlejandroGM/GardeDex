package com.andro_sk.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.andro_sk.pokedix.models.PokemonDex
import com.andro_sk.pokedix.models.Pokemon
import com.andro_sk.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.andro_sk.pokedix.utils.coroutineExceptionHandler
import com.andro_sk.pokedix.viewmodel.flowstate.PokemonState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokedixRepositoryImpl()

    private val _pokemonStateFlow: MutableStateFlow<PokemonState> = MutableStateFlow(PokemonState.Success(Pokemon()))

    val pokemonStateFlow: StateFlow<PokemonState>
        get() = _pokemonStateFlow

    fun fetchPokemon(pokedexSelected: PokemonDex){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _pokemonStateFlow.emit(PokemonState.Success(pokemonRepository.getPokemon(pokedexSelected)))
        }
    }
}