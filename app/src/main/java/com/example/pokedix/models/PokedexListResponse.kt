package com.example.pokedix.models


data class PokedexListResponse (
    var name: String,
    var pokemon_entries: List<PokemonEntries>,
    var region: Region
)

data class Region(
    var name: String,
    var url: String
)

data class PokemonEntries(
    var entry_number: Int,
    var pokemon_species: PokemonSpecies
)

data class PokemonSpecies(
    var name: String,
    var url: String
)

