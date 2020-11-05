package com.example.pokedix.models

enum class GameTypes(game: String) {
    RED_BLUE("red-blue"),
    YELLOW("yellow"),
    GOLD_SILVER("gold-silver"),
    CRYSTAL("crystal"),
    RUBY_SAPPHIRE("ruby-sapphire"),
    EMERALD("emerald"),
    FIRERED_LEAFGREEN("firered-leafgreen"),
    DIAMOND_PEARL("diamond-pearl"),
    PLATINUM("platinum"),
    HEARTGOLD_SOULSILVER("heartgold-soulsilver"),
    BLACK_WHITE("black-white"),
    COLOSSEUM("colosseum"),
    XD("xd"),
    BLACK_2_WHITE_2("black-2-white-2"),
    X_Y("x-y"),
    OMEGA_RUBY_ALPHA_SAPPHIRE("omega-ruby-alpha-sapphire"),
    SUN_MOON("sun-moon"),
    ULTRA_SUN_ULTRA_MOON("ultra-sun-ultra-moon"),
    LETS_GO("lets-go"),
    SWORD_SHIELD("sword-shield"),
    NOTHING_SELECTED("ERROR")
}

enum class PokeDixTypes {
    POKEMON,
    OBJECTS,
    TMS,
    GENERATIONS
}