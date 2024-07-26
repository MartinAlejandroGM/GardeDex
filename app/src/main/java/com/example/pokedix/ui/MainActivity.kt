package com.example.pokedix.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import com.example.pokedix.navigation.AppNavigation
import com.example.pokedix.viewmodel.GamesListViewModel
import com.example.pokedix.viewmodel.flowstate.GameState

class MainActivity : AppCompatActivity() {
    private val gamesViewModel: GamesListViewModel by viewModels<GamesListViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gamesViewModel.fetchGame()
        setContent {
            val data = gamesViewModel.gameStateFlow.collectAsState(null)
            when (data.value) {
                is GameState.Success -> {
                    (data.value as? GameState.Success)?.games?.let {
                        AppNavigation(games = it)
                    }
                }
                else -> {
                    Log.e("Errooooooor", "this is an error")
                }
            }
        }
    }
}