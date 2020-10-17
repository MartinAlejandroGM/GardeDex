package com.example.pokedix.repository

import com.example.pokedix.models.PokedixType
import com.example.pokedix.models.Results

interface PokedixRepository {
    suspend fun getPokemons(): List<Results>

    suspend fun getGames(): List<Results>
}