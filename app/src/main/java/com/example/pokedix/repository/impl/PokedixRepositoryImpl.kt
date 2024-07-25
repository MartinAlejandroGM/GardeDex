package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.*
import com.example.pokedix.models.*
import com.example.pokedix.network.webservice.PokeWebService
import com.example.pokedix.repository.PokedixRepository
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