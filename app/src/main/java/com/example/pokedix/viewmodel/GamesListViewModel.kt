package com.example.pokedix.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.Results
import com.example.pokedix.repository.GameRepository
import com.example.pokedix.repository.impl.GameRepositoryImpl
import com.example.pokedix.repository.impl.PokedixRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GamesListViewModel(application: Application) : AndroidViewModel(application) {
    private val gameRepository = GameRepositoryImpl()
    private val _gameLiveData: MutableLiveData<List<GamesList>> = MutableLiveData()

    val gameLiveData: LiveData<List<GamesList>>
        get() = _gameLiveData

    fun fetchGame(){
        viewModelScope.launch(Dispatchers.IO) {
            _gameLiveData.postValue(gameRepository.getGames())
        }
    }
}