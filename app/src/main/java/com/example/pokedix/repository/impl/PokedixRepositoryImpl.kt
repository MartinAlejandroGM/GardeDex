package com.example.pokedix.repository.impl

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.PokemonListResponse
import com.example.pokedix.models.Results
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokedixRepository

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokemons(): List<Results> {
        val pokeWs = PokeWS()
        val pokemonResponseList: PokemonListResponse = pokeWs.fetchPokemons()
        return pokemonResponseList.results
    }
}