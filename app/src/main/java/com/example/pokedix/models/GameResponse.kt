package com.example.pokedix.models

data class GameResponse(
    var pokedexes: List<Pokedexes>
)

data class Pokedexes(
    var name: String,
    var url: String
)