package com.example.pokedix.repository

import com.example.pokedix.models.*

interface PokedixRepository {
    suspend fun getPokedex(gameUrl: String): List<PokedexList>
    suspend fun getPokemon(pokedexSelected: PokedexList): PokemonDetails
    suspend fun getGames(): List<GameList>
}