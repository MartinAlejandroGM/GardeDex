package com.example.pokedix.repository.impl

import com.example.pokedix.models.PokemonsListResponse
import com.example.pokedix.models.Results
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokemonRepository

class PokemonRepositoryImpl: PokemonRepository {
    override suspend fun getPokemons(): List<Results> {
        val pokemonResponseList: PokemonsListResponse
        val pokemonList: List<Results>
        val pokeWs = PokeWS()

        pokemonResponseList = pokeWs.fetchPokemons()

        pokemonList = pokemonResponseList.results

        return pokemonList
    }
}