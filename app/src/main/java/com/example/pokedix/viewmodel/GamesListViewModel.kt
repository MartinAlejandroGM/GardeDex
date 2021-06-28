package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.GameList
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import com.example.pokedix.extensions.launch
import com.example.pokedix.extensions.Result
import kotlin.Exception

class GamesListViewModel(application: Application) : AndroidViewModel(application) {
    private val gameRepository = PokedixRepositoryImpl()
    private val _gameLiveData: MutableLiveData<Result<List<GameList>>> = MutableLiveData()

    val gameLiveData: LiveData<Result<List<GameList>>>
        get() = _gameLiveData

    fun fetchGame(){
        viewModelScope.launch(_gameLiveData, Dispatchers.IO) {
            val result = gameRepository.getGames()
            if (result.isNullOrEmpty())
                throw Exception("Empty game list.")
            result
        }
    }
}