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

enum class PokemonType(){
    WATER,
    FIRE,
    GRASS,
    PSYCHIC,
    BUG,
    POISON,
    NORMAL,
    FIGHTING,
    FLYING,
    GROUND,
    ROCK,
    DRAGON,
    GHOST,
    STEEL,
    ELECTRIC,
    ICE,
    DARK,
    FAIRY,
    NO
}

enum class PokedexRegions(val regId: Int){
    NATIONAL(1),
    KANTO(2),
    ORIGINAL_JOHTO(3),
    HOENN(4),
    ORIGINAL_SINNOH(5),
    EXTENDED_SINNOH(6),
    UPDATED_JOHTO(7),
    ORIGINAL_UNOVA(8),
    UPDATED_UNOVA(9),
    KALOS_CENTRAL(12),
    KALOS_COASTAL(13),
    KALOS_MOUNTAIN(14),
    UPDATED_HOENN(15),
    ORIGINAL_ALOLA(16),
    ORIGINAL_MELEMELE(17),
    ORIGINAL_AKALA(18),
    ORIGINAL_ULAULA(19),
    ORIGINAL_PONI(20),
    UPDATED_ALOLA(21)
}