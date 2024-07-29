package com.andro_sk.pokedix.extensions

import android.os.Bundle
import androidx.navigation.NavType
import com.andro_sk.pokedix.models.Game
import com.andro_sk.pokedix.models.PokemonDex
import com.google.gson.Gson

class GameTypeParam : NavType<Game>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): Game? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): Game {
        return Gson().fromJson(value, Game::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: Game) {
        bundle.putParcelable(key, value)
    }
}

class PokemonTypeParam : NavType<PokemonDex>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): PokemonDex? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): PokemonDex {
        return Gson().fromJson(value, PokemonDex::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: PokemonDex) {
        bundle.putParcelable(key, value)
    }
}

