package com.andro_sk.gardedex.models

data class GameListResponse(
    var results: List<Result> = arrayListOf()
)

data class Result (
    var name: String = "",
    var url: String = ""
)
