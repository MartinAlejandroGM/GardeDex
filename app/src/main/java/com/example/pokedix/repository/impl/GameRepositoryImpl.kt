package com.example.pokedix.repository.impl

import com.example.pokedix.extensions.toGamesList
import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.Results
import com.example.pokedix.network.webservice.PokeWS
import com.example.pokedix.repository.GameRepository
import com.example.pokedix.repository.PokedixRepository

class GameRepositoryImpl: GameRepository {
    override suspend fun getGames(): List<GamesList> {
        val pokeWs = PokeWS()
        val generationsResponseList: GameListResponse = pokeWs.fetchGames()
        var generationsList: ArrayList<GamesList> = ArrayList<GamesList>()

        generationsResponseList.let {
            generationsList.addAll(it.toGamesList())
        }

        //generationsList = generationsResponseList.toGamesList() as ArrayList<GamesList>

        return generationsList
    }
}