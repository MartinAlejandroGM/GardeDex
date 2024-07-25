package com.example.pokedix.models

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    val id: Int,
    val name: String,
    val sprites: Sprite,
    val stats: List<Stats>,
    val types: List<Types>
)

data class Sprite(
    @SerializedName("front_default")
    val frontDefault: String,
    val versions: VersionGame
)

data class VersionGame(
    @SerializedName("generation-i")
    val generationI: GenerationI,

    @SerializedName("generation-ii")
    val generationII: GenerationII,

    @SerializedName("generation-iii")
    val generationIII: GenerationIII,

    @SerializedName("generation-iv")
    val generationIV: GenerationIV,

    @SerializedName("generation-v")
    val generationV: GenerationV,

    @SerializedName("generation-vi")
    val generationVI: GenerationVI,

    @SerializedName("generation-vii")
    val generationVII: GenerationVII
)

data class GenerationI(
    @SerializedName("red-blue")
    val RedBlue: RedBlue,
    val yellow: Yellow
)

data class RedBlue(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Yellow(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationII(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
)

data class Crystal(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Gold(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Silver(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationIII(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireRedLeafGreen: FireRedLeafGreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)

data class Emerald(
    @SerializedName("front_default")
    val frontDefault: String
)

data class FireRedLeafGreen(
    @SerializedName("front_default")
    val frontDefault: String
)

data class RubySapphire(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationIV(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerializedName("heartgorld-soulsilver")
    val heartGoldSoulSilver: HeartGoldSoulSilver,
    val platinum: Platinum
)

data class DiamondPearl(
    @SerializedName("front_default")
    val frontDefault: String
)

data class HeartGoldSoulSilver(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Platinum(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationV(
    @SerializedName("black_white")
    val blackWhite: BlackWhite
)

data class BlackWhite(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationVI(
    @SerializedName("omegaruby-alphasapphire")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire,
    @SerializedName("x-y")
    val xY: XY
)

data class OmegaRubyAlphaSapphire(
    @SerializedName("front_default")
    val frontDefault: String
)

data class XY(
    @SerializedName("front_default")
    val frontDefault: String
)

data class GenerationVII(
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoon
)

data class UltraSunUltraMoon(
    @SerializedName("front_default")
    val frontDefault: String
)

data class Stats(
    @SerializedName("base_stat")
    val baseStat: Int,
    val stat: Stat
)

data class Stat(
    val name: String,
    val url: String
)

data class Types(
    val slot: Int,
    val type: Type
)

data class Type(
    val name: String,
    val url: String
)