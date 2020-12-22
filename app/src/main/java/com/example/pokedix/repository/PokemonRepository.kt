package com.example.pokedix.repository

import com.example.pokedix.models.PokemonDetails

interface PokemonRepository {
    suspend fun getPokemon(pokemonName: String): PokemonDetails
}