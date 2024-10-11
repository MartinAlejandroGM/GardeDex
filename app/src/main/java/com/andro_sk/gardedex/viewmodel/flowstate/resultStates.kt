package com.andro_sk.gardedex.viewmodel.flowstate

import com.andro_sk.gardedex.models.Game
import com.andro_sk.gardedex.models.Pokemon
import com.andro_sk.gardedex.models.PokemonDex

sealed class GameState{
    data object Loading:GameState()
    data class Success(val games: List<Game>): GameState()
    data class Error(val exception: Throwable): GameState()
}

sealed class PokedexState{
    data object Loading:PokedexState()
    data class Success(val pokedex: List<PokemonDex>): PokedexState()
    data class Error(val exception: Throwable): PokedexState()
}

sealed class PokemonState{
    data object Loading:PokemonState()
    data class Success(val pokemon: Pokemon): PokemonState()
    data class Error(val exception: Throwable): PokemonState()
}