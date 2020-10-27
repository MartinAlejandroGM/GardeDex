package com.example.pokedix.network.api

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.PokemonListResponse
import retrofit2.http.GET

interface PokeApi {
    @GET("v2/pokemon")
    suspend fun getPokemonList(): PokemonListResponse

    @GET("v2/version-group")
    suspend fun getGamesList(): GameListResponse
}