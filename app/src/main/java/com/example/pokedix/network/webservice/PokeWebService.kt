package com.example.pokedix.network.webservice

import com.example.pokedix.models.*
import com.example.pokedix.network.Api
import com.example.pokedix.network.api.PokeApi

class PokeWebService {
    private val service = Api.createApi(PokeApi::class.java)

    suspend fun fetchPokemons(): PokedexListResponse {
        return service.getPokemonList()
    }

    suspend fun fetchGames(): GameListResponse {
        return service.getGamesList()
    }

    suspend fun fetchPokedex(region: String): PokedexListResponse {
        return service.getPokedex(region)
    }
    
    suspend fun fetchPokedexesByGroupVersion(url: String): GameResponse {
        return service.getPokedexesByGroupVersion(url)
    }

    suspend fun fetchPokemon(pokemonName: String): PokemonDetailsResponse {
        return service.getPokemon(pokemonName)
    }

    suspend fun fetchPokemonSpecies(pokemonName: String): PokemonSpecieResponse {
        return service.getPokeSpecies(pokemonName)
    }

}