package com.andro_sk.pokedix.viewmodel.flowstate

import com.andro_sk.pokedix.models.Game
import com.andro_sk.pokedix.models.Pokemon
import com.andro_sk.pokedix.models.PokemonDex

sealed class GameState(){
    data class Success(val games: List<Game>): GameState()
    data class Error(val exception: Throwable): GameState()
}

sealed class PokedexState(){
    data class Success(val pokedex: List<PokemonDex>): PokedexState()
    data class Error(val exception: Throwable): PokedexState()
}

sealed class PokemonState() {
    data class Success(val pokemon: Pokemon): PokemonState()
    data class Error(val exception: Throwable): PokemonState()
}