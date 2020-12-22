package com.example.pokedix.extensions

import com.example.pokedix.models.*

fun PokedexListResponse.toPokemonList(): List<PokedexList> {
    return pokemon_entries.map { pokemon ->
        PokedexList(
            pokemon.entry_number,
            pokemon.pokemon_species.name,
            PokemonImageUrls("URL1","URL2")
        )
    }
}