package com.andro_sk.pokedix.models

import com.google.gson.annotations.SerializedName


data class PokedexListResponse (
    var name: String,
    @SerializedName("pokemon_entries")
    var pokemonEntries: List<PokemonEntries>,
    var region: Region
)

data class Region(
    var name: String,
    var url: String
)

data class PokemonEntries(
    @SerializedName("entry_number")
    var entryNumber: Int,
    @SerializedName("pokemon_species")
    var pokemonSpecies: PokemonSpecies
)

data class PokemonSpecies(
    var name: String,
    var url: String
)

