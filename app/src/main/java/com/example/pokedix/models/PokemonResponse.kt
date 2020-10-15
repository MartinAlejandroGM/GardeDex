package com.example.pokedix.models

data class PokemonResponse(
    var id: Int,
    var name: String,
    var base_experience: Int,
    var height: Int,
    var is_default: Boolean,
    var order: Int,
    var weihgt: Int
)