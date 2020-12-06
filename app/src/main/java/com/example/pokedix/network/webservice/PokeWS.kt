package com.example.pokedix.network.webservice

import com.example.pokedix.models.GameResponse
import com.example.pokedix.models.GamesListResponse
import com.example.pokedix.models.PokemonListResponse
import com.example.pokedix.network.Api
import com.example.pokedix.network.api.PokeApi

class PokeWS {
    private val service = Api.createApi(PokeApi::class.java)

    suspend fun fetchPokemons(): PokemonListResponse {
        return service.getPokemonList()
    }

    suspend fun fetchGames(): GamesListResponse {
        return service.getGamesList()
    }

    suspend fun fetchPokedex(region: String?): PokemonListResponse {
        return service.getPokedex(region)
    }
    
    suspend fun fetchPokedexesByGroupVersion(id: Int?): GameResponse {
        return service.getPokedexesByGroupVersion(id)
    }

}