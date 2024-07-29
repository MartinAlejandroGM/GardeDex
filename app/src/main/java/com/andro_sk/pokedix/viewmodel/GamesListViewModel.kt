package com.andro_sk.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.andro_sk.pokedix.repository.impl.PokedixRepositoryImpl
import com.andro_sk.pokedix.utils.coroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import com.andro_sk.pokedix.viewmodel.flowstate.GameState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GamesListViewModel(application: Application) : AndroidViewModel(application) {
    private val gameRepository = PokedixRepositoryImpl()

    private val _gameStateFlow: MutableStateFlow<GameState> = MutableStateFlow(GameState.Success(arrayListOf()))

    val gameStateFlow: StateFlow<GameState>
        get() = _gameStateFlow

    fun fetchGame(){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _gameStateFlow.emit(GameState.Success(gameRepository.getGames()))
        }
    }
}