package com.example.pokedix.extensions

import androidx.lifecycle.Transformations.map
import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.GameTypes
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.Results

fun GameListResponse.toGamesList(): List<GamesList>{
    return results.map {result->
        GamesList(
            GameTypes.valueOf(result.name.toFormatGameTypesEnum()),
            result.name.getUrlsByGameName()
        )
    }
}