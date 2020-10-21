package com.example.pokedix.network.webservice

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.PokemonsListResponse
import com.example.pokedix.network.Api
import com.example.pokedix.network.api.PokeApi

class PokeWS {
    private val service = Api.createApi(PokeApi::class.java)

    suspend fun fetchPokemons(): PokemonsListResponse {
        return service.getPokemonList()
    }

    suspend fun fetchGames(): GameListResponse {
        return service.getGamesList()
    }

}