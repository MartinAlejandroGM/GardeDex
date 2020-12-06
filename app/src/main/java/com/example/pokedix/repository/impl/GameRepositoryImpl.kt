package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.toGamesList
import com.example.pokedix.models.GamesListResponse
import com.example.pokedix.models.GamesList
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.GameRepository

class GameRepositoryImpl : GameRepository {
    override suspend fun getGames(): List<GamesList> {
        val pokeWs = PokeWS()
        val generationsResponseList: GamesListResponse = pokeWs.fetchGames()
        val generationsList: ArrayList<GamesList> = ArrayList()

        generationsResponseList.let {
            generationsList.addAll(it.toGamesList())
        }

        return generationsList
    }
}