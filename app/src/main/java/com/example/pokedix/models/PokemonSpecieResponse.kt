package com.example.pokedix.models

import com.google.gson.annotations.SerializedName

data class PokemonSpecieResponse(
    @SerializedName("egg_groups")
    var eggGroup: List<EggGroup>,
    @SerializedName("flavor_text_entries")
    var flavorTextEntries: List<FlavorTextEntries>,
    var genera: List<Genera>
)

data class EggGroup(
    var name: String,
    var url: String
)

data class FlavorTextEntries(
    @SerializedName("flavor_text")
    var flavorText: String,
    var language: Language,
    var version: Version
)

data class Language(
    var name: String,
    var url: String
)

data class Version(
    var name: String,
    var url: String
)

data class Genera(
    var genus: String,
    var language: Language
)