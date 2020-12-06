package com.example.pokedix.extensions

import com.example.pokedix.models.*

fun PokemonListResponse.toPokemonList(): List<PokemonList> {
    return pokemon_entries.map { pokemon ->
        PokemonList(
            pokemon.entry_number,
            pokemon.pokemon_species.name,
            PokemonType.BUG,
            PokemonType.DARK,
            PokemonImageUrls("URL1","URL2")
        )
    }
}