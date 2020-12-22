package com.example.pokedix.network.api

import com.example.pokedix.models.GamesListResponse
import com.example.pokedix.models.PokedexListResponse
import com.example.pokedix.models.GameResponse
import com.example.pokedix.models.PokemonDetailsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {
    @GET("v2/pokemon")
    suspend fun getPokemonList(): PokedexListResponse

    @GET("v2/pokedex/{region}/")
    suspend fun getPokedex(@Path("region") region: String?): PokedexListResponse

    @GET("v2/version-group")
    suspend fun getGamesList(): GamesListResponse

    @GET("{url}")
    suspend fun getPokedexesByGroupVersion(@Path("url") url: String?): GameResponse

    @GET("v2/pokemon/{pokeName}/")
    suspend fun getPokemon(@Path("pokeName") pokeName: String?): PokemonDetailsResponse
}