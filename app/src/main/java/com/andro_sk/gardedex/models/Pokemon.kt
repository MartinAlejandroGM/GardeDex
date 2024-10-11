package com.andro_sk.gardedex.models

data class Pokemon(
    val id: Int = 0,
    val pokeName: String = "",
    val pokeType1: PokemonType = PokemonType.BUG,
    val pokeType2: PokemonType = PokemonType.NO,
    val pokeDescription: String = "",
    val baseStats: BaseStats = BaseStats(),
    val pokeGenera: String = "",
    val pokemonSprite: Sprites = Sprites()
)

data class Sprites(
    val frontSprite: String = "",
    val backSprite: String = ""
)

data class BaseStats(
    val hp: Int = 0,
    val atk: Int = 0,
    val def: Int = 0,
    val sa: Int = 0,
    val sd: Int = 0,
    val sp: Int = 0
)