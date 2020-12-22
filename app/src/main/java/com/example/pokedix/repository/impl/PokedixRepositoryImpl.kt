package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.toFormatURL
import com.example.pokedix.extensions.toPokemonList
import com.example.pokedix.models.*
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokedixRepository

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokedex(gameUrl: String): List<PokedexList> {
        val pokeWs = PokeWS()
        val gameResponse: GameResponse = pokeWs.fetchPokedexesByGroupVersion(gameUrl.toFormatURL())
        val pokedexResponseList: PokedexListResponse = pokeWs.fetchPokedex(gameResponse.pokedexes.first().name)
        val pokedexList: ArrayList<PokedexList> = ArrayList()

        pokedexResponseList.let {
            pokedexList.addAll(it.toPokemonList())
        }

        return pokedexList
    }
}