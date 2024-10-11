package com.andro_sk.gardedex.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andro_sk.gardedex.repository.impl.PokedixRepositoryImpl
import com.andro_sk.gardedex.utils.coroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import com.andro_sk.gardedex.viewmodel.flowstate.PokedexState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokedexViewModel() : ViewModel() {
    private val pokedexRepository = PokedixRepositoryImpl()

    private val _pokedexStateFlow: MutableStateFlow<PokedexState> = MutableStateFlow(PokedexState.Loading)

    val pokedexStateFlow: StateFlow<PokedexState> = _pokedexStateFlow.asStateFlow()

    fun fetchPokedex(gameUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            runCatching {
                pokedexRepository.getPokedex(gameUrl)
            }.onSuccess { result ->
                _pokedexStateFlow.emit(PokedexState.Success(result))
            }.onFailure { error ->
                _pokedexStateFlow.emit(PokedexState.Error(error))
            }
        }
    }
}