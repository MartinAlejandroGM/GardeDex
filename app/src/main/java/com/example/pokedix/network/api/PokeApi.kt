package com.example.pokedix.network.api

import com.example.pokedix.models.GamesListResponse
import com.example.pokedix.models.PokemonListResponse
import com.example.pokedix.models.GameResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {
    @GET("v2/pokemon")
    suspend fun getPokemonList(): PokemonListResponse

    @GET("v2/pokedex/{region}/")
    suspend fun getPokedex(@Path("region") region: String?): PokemonListResponse

    @GET("v2/version-group")
    suspend fun getGamesList(): GamesListResponse

    @GET("v2/version-group/{id}/")
    suspend fun getPokedexesByGroupVersion(@Path("id") id: Int?): GameResponse
}