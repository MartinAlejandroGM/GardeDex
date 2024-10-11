package com.andro_sk.gardedex.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game (
    val name: String = "",
    val gameListUrls: GameImageUrls = GameImageUrls(),
    val url: String = ""
): Parcelable

@Parcelize
data class GameImageUrls(
    val image: String = "",
    val startScreen: String = "",
    val pokemonImage: String = "",
    val itemsImage: String = "",
    val machinesImage: String = ""
): Parcelable
