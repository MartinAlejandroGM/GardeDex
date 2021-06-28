package com.example.pokedix.models

data class PokemonDetails(
    val Id: Int,
    val pokeName: String,
    val pokeType1: PokemonType,
    val pokeType2: PokemonType,
    val pokeDescription: String,
    val baseStats: BaseStats,
    val pokeGenera: String,
    val pokemonSprite: PokemonSprites
)

data class PokemonSprites(
    val frontSprite: String,
    val backSprite: String
)

data class BaseStats(
    val hp: Int,
    val atk: Int,
    val def: Int,
    val sa: Int,
    val sd: Int,
    val sp: Int
)