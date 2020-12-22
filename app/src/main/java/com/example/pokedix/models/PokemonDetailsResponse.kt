package com.example.pokedix.models

data class PokemonDetailsResponse(
    val name: String,
    val stats: List<Stats>,
    val types: List<Types>
)

data class Stats(
    val base_stats: Int,
    val stat: Stat
)

data class Stat(
    val name: String,
    val url: String
)

data class Types(
    val slot: Int,
    val type: Type
)

data class Type(
    val name: String,
    val url: String
)