package com.example.pokedix.models

data class GameListResponse(
    var results: List<Result> = arrayListOf()
)

data class Result (
    var name: String = "",
    var url: String = ""
)
