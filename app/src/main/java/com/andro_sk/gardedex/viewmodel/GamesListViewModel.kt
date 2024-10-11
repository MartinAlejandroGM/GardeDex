package com.andro_sk.gardedex.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.andro_sk.gardedex.repository.impl.PokedixRepositoryImpl
import com.andro_sk.gardedex.utils.coroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import com.andro_sk.gardedex.viewmodel.flowstate.GameState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GamesListViewModel(application: Application) : AndroidViewModel(application) {
    private val gameRepository = PokedixRepositoryImpl()

    private val _gameStateFlow: MutableStateFlow<GameState> = MutableStateFlow(GameState.Loading)

    val gameStateFlow: StateFlow<GameState>
        get() = _gameStateFlow

    fun fetchGame(){
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            runCatching {
                gameRepository.getGames()
            }.onSuccess { result ->
                _gameStateFlow.emit(GameState.Success(result))
            }.onFailure {
                _gameStateFlow.emit(GameState.Error(it))
            }
        }
    }
}