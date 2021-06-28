package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.GameList
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GamesListViewModel(application: Application) : AndroidViewModel(application) {
    private val gameRepository = PokedixRepositoryImpl()
    private val _gameLiveData: MutableLiveData<List<GameList>> = MutableLiveData()

    val gameLiveData: LiveData<List<GameList>>
        get() = _gameLiveData

    fun fetchGame(){
        viewModelScope.launch(Dispatchers.IO) {
            _gameLiveData.postValue(gameRepository.getGames())
        }
    }
}