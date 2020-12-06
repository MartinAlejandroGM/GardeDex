package com.example.pokedix.repository

import com.example.pokedix.models.PokemonList
import com.example.pokedix.models.Results

interface PokedixRepository {
    suspend fun getPokedex(gameUrl: String): List<PokemonList>
}