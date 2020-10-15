package com.example.pokedix.network.api

import com.example.pokedix.models.PokemonsListResponse
import retrofit2.http.GET

interface PokeApi {
    @GET("v2/pokemon")
    suspend fun getPokemonList(): PokemonsListResponse
}