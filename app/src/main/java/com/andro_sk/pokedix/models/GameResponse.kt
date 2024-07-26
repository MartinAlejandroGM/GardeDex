package com.andro_sk.pokedix.models

data class GameResponse(
    var generation: Generation = Generation(),
    var name: String = "",
    var pokedexes: List<Pokedex> = arrayListOf(),
    var versions: List<GameVersion> = arrayListOf()
)

data class Generation(
    var name: String = "",
    var url: String = ""
)

data class GameVersion(
    var name: String = "",
    var url: String = ""
)

data class Pokedex(
    var name: String = "",
    var url: String = ""
)