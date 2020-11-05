package com.example.pokedix.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class GameListResponse(
    var results: List<Results>
)
