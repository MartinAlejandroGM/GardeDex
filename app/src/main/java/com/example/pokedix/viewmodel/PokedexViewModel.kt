package com.example.pokedix.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import com.example.pokedix.utils.coroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import com.example.pokedix.viewmodel.flowstate.PokedexState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokedexViewModel() : ViewModel() {
    private val pokedexRepository = PokedixRepositoryImpl()

    private val _pokedexStateFlow: MutableStateFlow<PokedexState> = MutableStateFlow(PokedexState.Success(arrayListOf()))

    val pokedexStateFlow: StateFlow<PokedexState>
        get() = _pokedexStateFlow

    fun fetchPokedex(gameUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _pokedexStateFlow.emit(PokedexState.Success(pokedexRepository.getPokedex(gameUrl)))
        }
    }
}