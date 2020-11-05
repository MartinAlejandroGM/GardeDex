package com.example.pokedix.repository

import com.example.pokedix.models.GamesList

interface GameRepository {
    suspend fun getGames(): List<GamesList>
}