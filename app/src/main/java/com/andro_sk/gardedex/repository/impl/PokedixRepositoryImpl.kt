package com.andro_sk.gardedex.repository.impl

import com.andro_sk.gardedex.extensions.*
import com.andro_sk.gardedex.models.*
import com.andro_sk.gardedex.network.webservice.PokeWebService
import com.andro_sk.gardedex.repository.PokedixRepository
import kotlin.collections.ArrayList

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokedex(gameUrl: String): List<PokemonDex> {
        val pokeWs = PokeWebService()
        val gameResponse: GameResponse = pokeWs.fetchPokedexesByGroupVersion(gameUrl.toFormatURL())
        val pokedexResponseList: PokedexListResponse = pokeWs.fetchPokedex(gameResponse.pokedexes.first().name)
        val pokemonDex: ArrayList<PokemonDex> = ArrayList()

        pokedexResponseList.let {
            pokemonDex.addAll(it.toPokemonList(gameResponse))
        }
        if (pokemonDex.isEmpty())
            throw IllegalArgumentException()
        return pokemonDex
    }

    override suspend fun getPokemon(pokedexSelected: PokemonDex): Pokemon {
        val pokeWebService = PokeWebService()
        val pokemonResponse: PokemonResponse = pokeWebService.fetchPokemon(pokedexSelected.pokemonName)
        val pokemonSpecieResponse: PokemonSpecieResponse = pokeWebService.fetchPokemonSpecies(pokedexSelected.pokemonName)
        val pokemon: Pokemon
        pokemonResponse.let {
            pokemon = it.toPokemonDetails(pokedexSelected, pokemonSpecieResponse)
        }
        return pokemon
    }

    override suspend fun getGames(): List<Game> {
        val pokeWs = PokeWebService()
        val generationsResponseList: GameListResponse = pokeWs.fetchGames()
        val generationsList: ArrayList<Game> = ArrayList()

        generationsResponseList.let {
            generationsList.addAll(it.toGamesList())
        }

        return generationsList
    }
}