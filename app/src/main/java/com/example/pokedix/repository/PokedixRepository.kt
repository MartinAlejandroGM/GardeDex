package com.example.pokedix.repository

import com.example.pokedix.models.*

interface PokedixRepository {
    suspend fun getPokedex(gameUrl: String): List<PokemonDex>
    suspend fun getPokemon(pokedexSelected: PokemonDex): Pokemon
    suspend fun getGames(): List<Game>
}