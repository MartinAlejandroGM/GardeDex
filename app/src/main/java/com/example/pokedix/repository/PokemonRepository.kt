package com.example.pokedix.repository

import com.example.pokedix.models.Results

interface PokemonRepository {
    suspend fun getPokemons(): List<Results>
}