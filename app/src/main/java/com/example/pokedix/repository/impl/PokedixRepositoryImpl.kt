package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.*
import com.example.pokedix.models.*
import com.example.pokedix.network.webservice.PokeWebService
import com.example.pokedix.repository.PokedixRepository
import kotlin.collections.ArrayList

class PokedixRepositoryImpl : PokedixRepository {
    override suspend fun getPokedex(gameUrl: String): List<PokedexList> {
        val pokeWs = PokeWebService()
        val gameResponse: GameResponse = pokeWs.fetchPokedexesByGroupVersion(gameUrl.toFormatURL())
        val pokedexResponseList: PokedexListResponse = pokeWs.fetchPokedex(gameResponse.pokedexes.first().name)
        val pokedexList: ArrayList<PokedexList> = ArrayList()

        pokedexResponseList.let {
            pokedexList.addAll(it.toPokemonList(gameResponse))
        }
        return pokedexList
    }

    override suspend fun getPokemon(pokedexSelected: PokedexList): PokemonDetails {
        val pokeWebService = PokeWebService()
        val pokemonResponse: PokemonDetailsResponse = pokeWebService.fetchPokemon(pokedexSelected.pokemonName)
        val pokemonSpecieResponse: PokemonSpecieResponse = pokeWebService.fetchPokemonSpecies(pokedexSelected.pokemonName)
        val pokemonDetails: PokemonDetails
        pokemonResponse.let {
            pokemonDetails = it.toPokemonDetails(pokedexSelected, pokemonSpecieResponse)
        }
        return pokemonDetails
    }

    override suspend fun getGames(): List<GameList> {
        val pokeWs = PokeWebService()
        val generationsResponseList: GameListResponse = pokeWs.fetchGames()
        val generationsList: ArrayList<GameList> = ArrayList()

        generationsResponseList.let {
            generationsList.addAll(it.toGamesList())
        }

        return generationsList
    }
}