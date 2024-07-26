package com.andro_sk.pokedix.repository

import com.andro_sk.pokedix.models.*

interface PokedixRepository {
    suspend fun getPokedex(gameUrl: String): List<PokemonDex>
    suspend fun getPokemon(pokedexSelected: PokemonDex): Pokemon
    suspend fun getGames(): List<Game>
}