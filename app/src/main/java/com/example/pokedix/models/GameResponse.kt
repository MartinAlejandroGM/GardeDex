package com.example.pokedix.models

data class GameResponse(
    var generation: Generation,
    var name: String,
    var pokedexes: List<Pokedex>,
    var versions: List<GameVersion>
)

data class Generation(
    var name: String,
    var url: String
)

data class GameVersion(
    var name: String,
    var url: String
)

data class Pokedex(
    var name: String,
    var url: String
)