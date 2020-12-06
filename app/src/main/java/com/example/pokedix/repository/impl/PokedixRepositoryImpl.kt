package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.toFormatURL
import com.example.pokedix.extensions.toPokemonList
import com.example.pokedix.models.*
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokedixRepository

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokedex(gameUrl: String): List<PokemonList> {
        val pokeWs = PokeWS()
        val gameResponse: GameResponse = pokeWs.fetchPokedexesByGroupVersion(gameUrl.toFormatURL().toInt())
        val pokemonResponseList: PokemonListResponse = pokeWs.fetchPokedex(gameResponse.pokedexes.first().name)
        val pokemonList: ArrayList<PokemonList> = ArrayList()

        pokemonResponseList.let {
            pokemonList.addAll(it.toPokemonList())
        }

        return pokemonList
    }
}