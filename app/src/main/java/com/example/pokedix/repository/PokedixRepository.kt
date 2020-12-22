package com.example.pokedix.repository

import com.example.pokedix.models.PokedexList

interface PokedixRepository {
    suspend fun getPokedex(gameUrl: String): List<PokedexList>
}