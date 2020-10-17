package com.example.pokedix.repository.impl

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.PokedixType
import com.example.pokedix.models.PokemonsListResponse
import com.example.pokedix.models.Results
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokedixRepository

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokemons(): List<Results> {
        val pokeWs = PokeWS()
        val pokemonResponseList: PokemonsListResponse = pokeWs.fetchPokemons()
        return pokemonResponseList.results
    }

    override suspend fun getGames(): List<Results> {
        val pokeWs = PokeWS()
        val generationsResponseList: GameListResponse = pokeWs.fetchGames()
        return generationsResponseList.results
    }
}