package com.example.pokedix.extensions

import com.example.pokedix.models.GamesListResponse
import com.example.pokedix.models.GameTypes
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.PokedexRegions

fun GamesListResponse.toGamesList(): List<GamesList> {
    return results.map { result ->
        GamesList(
            GameTypes.valueOf(result.name.toFormatGameTypesEnum()),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}