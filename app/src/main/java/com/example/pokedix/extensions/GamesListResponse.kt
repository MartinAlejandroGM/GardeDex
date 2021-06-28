package com.example.pokedix.extensions

import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.GameTypes
import com.example.pokedix.models.GameList

fun GameListResponse.toGamesList(): List<GameList> {
    return results.map { result ->
        GameList(
            GameTypes.valueOf(result.name.toValidFormatTypesEnum()),
            result.name.getUrlsByGameName(),
            result.url
        )
    }
}