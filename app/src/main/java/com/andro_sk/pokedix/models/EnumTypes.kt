package com.andro_sk.pokedix.models

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

enum class PokedexRegions(regId: Int){
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

enum class Regions(region: String){
    NATIONAL("national"),
    KANTO("kanto"),
    JOHTO("johto"),
    HOENN("hoenn"),
    SINNOH("sinnoh"),
    UNOVA("unova"),
    KALOS("kalos"),
    ALOLA("alola"),
    GALAR("galar")
}