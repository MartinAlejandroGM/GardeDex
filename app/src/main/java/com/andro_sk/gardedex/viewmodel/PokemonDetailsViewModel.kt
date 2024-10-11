package com.andro_sk.gardedex.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.andro_sk.gardedex.models.PokemonDex
import com.andro_sk.gardedex.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.andro_sk.gardedex.utils.coroutineExceptionHandler
import com.andro_sk.gardedex.viewmodel.flowstate.PokemonState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val pokemonRepository = PokedixRepositoryImpl()

    private val _pokemonStateFlow: MutableStateFlow<PokemonState> = MutableStateFlow(PokemonState.Loading)

    val pokemonStateFlow: StateFlow<PokemonState>
        get() = _pokemonStateFlow

    fun fetchPokemon(pokedexSelected: PokemonDex){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            runCatching {
                pokemonRepository.getPokemon(pokedexSelected)
            }.onSuccess { result ->
                _pokemonStateFlow.emit(PokemonState.Success(result))
            }.onFailure {
                _pokemonStateFlow.emit(PokemonState.Error(it))
            }
        }
    }
}