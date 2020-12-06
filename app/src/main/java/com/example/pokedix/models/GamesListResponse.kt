package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class GamesListResponse(
    var results: List<Results>
)

data class Results (
    var name: String,
    var url: String
)
