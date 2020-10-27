package com.example.pokedix.models

data class PokemonListResponse (
    var count: Int,
    var next: String,
    var previous: String,
    var results: List<Results>
)

data class Results (
    var name: String,
    var url: String
)
