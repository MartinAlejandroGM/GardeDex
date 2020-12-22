package com.example.pokedix.repository.impl

import com.example.pokedix.models.BaseStats
import com.example.pokedix.models.PokemonDetails
import com.example.pokedix.models.PokemonDetailsResponse
import com.example.pokedix.models.PokemonType
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.PokemonRepository
import java.util.*

class PokemonRepositoryImpl: PokemonRepository {
    override suspend fun getPokemon(pokemonName: String): PokemonDetails {
        val pokeWs = PokeWS()
        val pokemonResponse: PokemonDetailsResponse = pokeWs.fetchPokemon(pokemonName)
        val pokemonDetails: PokemonDetails

        pokemonResponse.let {
            pokemonDetails = PokemonDetails(1, it.name, PokemonType.valueOf(it.types.first().type.name.toUpperCase(
                Locale.ROOT)), PokemonType.valueOf(it.types.last().type.name.toUpperCase(Locale.ROOT)), "Description",
                BaseStats(it.stats[0].base_stats,it.stats[1].base_stats, it.stats[2].base_stats, it.stats[3].base_stats, it.stats[4].base_stats, it.stats[5].base_stats))
        }

        return pokemonDetails
    }
}