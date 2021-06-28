package com.example.pokedix.extensions

import com.example.pokedix.models.GameImageUrls
import com.example.pokedix.models.Regions
import java.util.*

fun String.nameFormat(): String {
    val replacedString: String = this.replace('_', ' ', false)
    val words = replacedString.split(" ").toMutableList()
    val output = StringBuilder()

    for (word in words) {
        output.append(word.toLowerCase(Locale.ROOT).capitalize(Locale.ROOT).plus(" "))
    }
    return output.toString()
}

fun String.getPokemonURLSpriteByNameRegion(region: Regions): String {
    return when (region) {
        Regions.KANTO -> {
            getSpritesKanto(this)
        }
        Regions.JOHTO -> {
            getSpritesJohto(this)
        }
        Regions.HOENN -> {
            getSpritesHoenn(this)
        }
        Regions.SINNOH -> {
            getSpritesSinnoh(this)
        }
        Regions.UNOVA -> {
            getSpritesKalos(this)
        }
        Regions.KALOS -> {
            getSpritesUnova(this)
        }
        Regions.ALOLA -> {
            getSpritesAlola(this)
        }
        Regions.GALAR -> {
            getSpritesGalar(this)
        }
        else -> ""
    }
}

fun getSpritesKanto(pokemonName: String): String {
    return when (pokemonName) {
        "bulbasaur" -> {
            "https://iili.io/KIStWb.png"
        }
        "ivysaur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "venusaur" -> {
            "https://iili.io/K6UunI.png"
        }
        "charmander" -> {
            "https://iili.io/KIStWb.png"
        }
        "charmeleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "charizard" -> {
            "https://iili.io/K6UunI.png"
        }
        "squirtle" -> {
            "https://iili.io/K6UunI.png"
        }
        "wartortle" -> {
            "https://iili.io/KIStWb.png"
        }
        "blastoise" -> {
            "https://iili.io/K6UvtV.png"
        }
        "caterpie" -> {
            "https://iili.io/K6UunI.png"
        }
        "metapod" -> {
            "https://iili.io/K6UunI.png"
        }
        "butterfree" -> {
            "https://iili.io/KIStWb.png"
        }
        "weedle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kakuna" -> {
            "https://iili.io/K6UunI.png"
        }
        "beedrill" -> {
            "https://iili.io/K6UunI.png"
        }
        "pidgey" -> {
            "https://iili.io/KIStWb.png"
        }
        "pidgeotto" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pidgeot" -> {
            "https://iili.io/K6UunI.png"
        }
        "rattata" -> {
            "https://iili.io/K6UunI.png"
        }
        "raticate" -> {
            "https://iili.io/KIStWb.png"
        }
        "spearow" -> {
            "https://iili.io/K6UvtV.png"
        }
        "fearow" -> {
            "https://iili.io/K6UunI.png"
        }
        "ekans" -> {
            "https://iili.io/K6UunI.png"
        }
        "arbok" -> {
            "https://iili.io/KIStWb.png"
        }
        "pikachu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "raichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandshrew" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandslash" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidoran-f" -> {
            "https://iili.io/K6UvtV.png"
        }
        "nidorina" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoqueen" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoran-m" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidorino" -> {
            "https://iili.io/K6UvtV.png"
        }
        "nidoking" -> {
            "https://iili.io/K6UunI.png"
        }
        "clefairy" -> {
            "https://iili.io/K6UunI.png"
        }
        "clefable" -> {
            "https://iili.io/KIStWb.png"
        }
        "vulpix" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ninetales" -> {
            "https://iili.io/K6UunI.png"
        }
        "jigglypuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "wigglytuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "zubat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "golbat" -> {
            "https://iili.io/K6UunI.png"
        }
        "oddish" -> {
            "https://iili.io/K6UunI.png"
        }
        "gloom" -> {
            "https://iili.io/KIStWb.png"
        }
        "vileplume" -> {
            "https://iili.io/K6UvtV.png"
        }
        "paras" -> {
            "https://iili.io/K6UunI.png"
        }
        "parasect" -> {
            "https://iili.io/K6UunI.png"
        }
        "venonat" -> {
            "https://iili.io/KIStWb.png"
        }
        "venomoth" -> {
            "https://iili.io/K6UvtV.png"
        }
        "diglett" -> {
            "https://iili.io/K6UunI.png"
        }
        "dugtrio" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowth" -> {
            "https://iili.io/KIStWb.png"
        }
        "persian" -> {
            "https://iili.io/K6UvtV.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "golduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "mankey" -> {
            "https://iili.io/KIStWb.png"
        }
        "primeape" -> {
            "https://iili.io/K6UvtV.png"
        }
        "growlithe" -> {
            "https://iili.io/K6UunI.png"
        }
        "arcanine" -> {
            "https://iili.io/K6UunI.png"
        }
        "poliwag" -> {
            "https://iili.io/KIStWb.png"
        }
        "poliwhirl" -> {
            "https://iili.io/K6UvtV.png"
        }
        "poliwrath" -> {
            "https://iili.io/K6UunI.png"
        }
        "abra" -> {
            "https://iili.io/K6UunI.png"
        }
        "kadabra" -> {
            "https://iili.io/KIStWb.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UvtV.png"
        }
        "machop" -> {
            "https://iili.io/K6UunI.png"
        }
        "machoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "machamp" -> {
            "https://iili.io/KIStWb.png"
        }
        "bellsprout" -> {
            "https://iili.io/K6UvtV.png"
        }
        "weepinbell" -> {
            "https://iili.io/K6UunI.png"
        }
        "victreebel" -> {
            "https://iili.io/K6UunI.png"
        }
        "tentacool" -> {
            "https://iili.io/KIStWb.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UvtV.png"
        }
        "geodude" -> {
            "https://iili.io/K6UunI.png"
        }
        "graveler" -> {
            "https://iili.io/K6UunI.png"
        }
        "golem" -> {
            "https://iili.io/KIStWb.png"
        }
        "ponyta" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rapidash" -> {
            "https://iili.io/K6UunI.png"
        }
        "slowpoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "slowbro" -> {
            "https://iili.io/KIStWb.png"
        }
        "magnemite" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "farfetchd" -> {
            "https://iili.io/K6UunI.png"
        }
        "doduo" -> {
            "https://iili.io/KIStWb.png"
        }
        "dodrio" -> {
            "https://iili.io/K6UvtV.png"
        }
        "seel" -> {
            "https://iili.io/K6UunI.png"
        }
        "dewgong" -> {
            "https://iili.io/K6UunI.png"
        }
        "grimer" -> {
            "https://iili.io/KIStWb.png"
        }
        "muk" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shellder" -> {
            "https://iili.io/K6UunI.png"
        }
        "cloyster" -> {
            "https://iili.io/K6UunI.png"
        }
        "gastly" -> {
            "https://iili.io/KIStWb.png"
        }
        "haunter" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gengar" -> {
            "https://iili.io/K6UunI.png"
        }
        "onix" -> {
            "https://iili.io/K6UunI.png"
        }
        "drowzee" -> {
            "https://iili.io/KIStWb.png"
        }
        "hypno" -> {
            "https://iili.io/K6UvtV.png"
        }
        "krabby" -> {
            "https://iili.io/K6UunI.png"
        }
        "kingler" -> {
            "https://iili.io/K6UunI.png"
        }
        "voltorb" -> {
            "https://iili.io/KIStWb.png"
        }
        "electrode" -> {
            "https://iili.io/K6UvtV.png"
        }
        "exeggcute" -> {
            "https://iili.io/K6UunI.png"
        }
        "exeggutor" -> {
            "https://iili.io/K6UunI.png"
        }
        "cubone" -> {
            "https://iili.io/KIStWb.png"
        }
        "marowak" -> {
            "https://iili.io/K6UvtV.png"
        }
        "hitmonlee" -> {
            "https://iili.io/K6UunI.png"
        }
        "hitmonchan" -> {
            "https://iili.io/K6UunI.png"
        }
        "lickitung" -> {
            "https://iili.io/KIStWb.png"
        }
        "koffing" -> {
            "https://iili.io/K6UvtV.png"
        }
        "weezing" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyhorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhydon" -> {
            "https://iili.io/KIStWb.png"
        }
        "chansey" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tangela" -> {
            "https://iili.io/K6UunI.png"
        }
        "kangaskhan" -> {
            "https://iili.io/K6UunI.png"
        }
        "horsea" -> {
            "https://iili.io/KIStWb.png"
        }
        "seadra" -> {
            "https://iili.io/K6UvtV.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "staryu" -> {
            "https://iili.io/KIStWb.png"
        }
        "starmie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mr-mime" -> {
            "https://iili.io/K6UunI.png"
        }
        "scyther" -> {
            "https://iili.io/K6UunI.png"
        }
        "jynx" -> {
            "https://iili.io/KIStWb.png"
        }
        "electabuzz" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magmar" -> {
            "https://iili.io/K6UunI.png"
        }
        "pinsir" -> {
            "https://iili.io/K6UunI.png"
        }
        "tauros" -> {
            "https://iili.io/KIStWb.png"
        }
        "magikarp" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UunI.png"
        }
        "lapras" -> {
            "https://iili.io/K6UunI.png"
        }
        "ditto" -> {
            "https://iili.io/KIStWb.png"
        }
        "eevee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/KIStWb.png"
        }
        "porygon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "omanyte" -> {
            "https://iili.io/K6UunI.png"
        }
        "omastar" -> {
            "https://iili.io/K6UunI.png"
        }
        "kabuto" -> {
            "https://iili.io/KIStWb.png"
        }
        "kabutops" -> {
            "https://iili.io/K6UvtV.png"
        }
        "aerodactyl" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorlax" -> {
            "https://iili.io/K6UunI.png"
        }
        "articuno" -> {
            "https://iili.io/KIStWb.png"
        }
        "zapdos" -> {
            "https://iili.io/K6UvtV.png"
        }
        "moltres" -> {
            "https://iili.io/K6UunI.png"
        }
        "dratini" -> {
            "https://iili.io/K6UunI.png"
        }
        "dragonair" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragonite" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mewtwo" -> {
            "https://iili.io/K6UunI.png"
        }
        "mew" -> {
            "https://iili.io/K6UunI.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesJohto(pokemonName: String): String {
    return when (pokemonName) {
        "chikorita" -> {
            "https://iili.io/KIStWb.png"
        }
        "bayleef" -> {
            "https://iili.io/K6UvtV.png"
        }
        "meganium" -> {
            "https://iili.io/K6UunI.png"
        }
        "cyndaquil" -> {
            "https://iili.io/KIStWb.png"
        }
        "quilava" -> {
            "https://iili.io/K6UvtV.png"
        }
        "typhlosion" -> {
            "https://iili.io/K6UunI.png"
        }
        "totodile" -> {
            "https://iili.io/K6UunI.png"
        }
        "croconaw" -> {
            "https://iili.io/KIStWb.png"
        }
        "feraligatr" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pidgey" -> {
            "https://iili.io/K6UunI.png"
        }
        "pidgeotto" -> {
            "https://iili.io/K6UunI.png"
        }
        "pidgeot" -> {
            "https://iili.io/KIStWb.png"
        }
        "spearow" -> {
            "https://iili.io/K6UvtV.png"
        }
        "fearow" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoothoot" -> {
            "https://iili.io/K6UunI.png"
        }
        "noctowl" -> {
            "https://iili.io/KIStWb.png"
        }
        "rattata" -> {
            "https://iili.io/K6UvtV.png"
        }
        "raticate" -> {
            "https://iili.io/K6UunI.png"
        }
        "sentret" -> {
            "https://iili.io/K6UunI.png"
        }
        "furret" -> {
            "https://iili.io/KIStWb.png"
        }
        "pichu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pikachu" -> {
            "https://iili.io/K6UunI.png"
        }
        "raichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "caterpie" -> {
            "https://iili.io/KIStWb.png"
        }
        "metapod" -> {
            "https://iili.io/K6UvtV.png"
        }
        "butterfree" -> {
            "https://iili.io/K6UunI.png"
        }
        "weedle" -> {
            "https://iili.io/K6UunI.png"
        }
        "kakuna" -> {
            "https://iili.io/KIStWb.png"
        }
        "beedrill" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ladyba" -> {
            "https://iili.io/K6UunI.png"
        }
        "ledian" -> {
            "https://iili.io/K6UunI.png"
        }
        "spinarak" -> {
            "https://iili.io/KIStWb.png"
        }
        "ariados" -> {
            "https://iili.io/K6UvtV.png"
        }
        "geodude" -> {
            "https://iili.io/K6UunI.png"
        }
        "graveler" -> {
            "https://iili.io/K6UunI.png"
        }
        "golem" -> {
            "https://iili.io/KIStWb.png"
        }
        "zubat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "golbat" -> {
            "https://iili.io/K6UunI.png"
        }
        "crobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "cleffa" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefairy" -> {
            "https://iili.io/K6UvtV.png"
        }
        "clefable" -> {
            "https://iili.io/K6UunI.png"
        }
        "igglybuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "jigglypuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "wigglytuff" -> {
            "https://iili.io/K6UvtV.png"
        }
        "togepi" -> {
            "https://iili.io/K6UunI.png"
        }
        "togetic" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandshrew" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandslash" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ekans" -> {
            "https://iili.io/K6UunI.png"
        }
        "arbok" -> {
            "https://iili.io/K6UunI.png"
        }
        "dunsparce" -> {
            "https://iili.io/KIStWb.png"
        }
        "mareep" -> {
            "https://iili.io/K6UvtV.png"
        }
        "flaaffy" -> {
            "https://iili.io/K6UunI.png"
        }
        "ampharos" -> {
            "https://iili.io/K6UunI.png"
        }
        "wooper" -> {
            "https://iili.io/KIStWb.png"
        }
        "quagsire" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gastly" -> {
            "https://iili.io/K6UunI.png"
        }
        "haunter" -> {
            "https://iili.io/K6UunI.png"
        }
        "gengar" -> {
            "https://iili.io/KIStWb.png"
        }
        "unown" -> {
            "https://iili.io/K6UvtV.png"
        }
        "onix" -> {
            "https://iili.io/K6UunI.png"
        }
        "steelix" -> {
            "https://iili.io/K6UunI.png"
        }
        "bellsprout" -> {
            "https://iili.io/KIStWb.png"
        }
        "weepinbell" -> {
            "https://iili.io/K6UvtV.png"
        }
        "victreebel" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoppip" -> {
            "https://iili.io/K6UunI.png"
        }
        "skiploom" -> {
            "https://iili.io/KIStWb.png"
        }
        "jumpluff" -> {
            "https://iili.io/K6UvtV.png"
        }
        "paras" -> {
            "https://iili.io/K6UunI.png"
        }
        "parasect" -> {
            "https://iili.io/K6UunI.png"
        }
        "poliwag" -> {
            "https://iili.io/KIStWb.png"
        }
        "poliwhirl" -> {
            "https://iili.io/K6UvtV.png"
        }
        "poliwrath" -> {
            "https://iili.io/K6UunI.png"
        }
        "politoed" -> {
            "https://iili.io/K6UunI.png"
        }
        "magikarp" -> {
            "https://iili.io/KIStWb.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UvtV.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "slowpoke" -> {
            "https://iili.io/KIStWb.png"
        }
        "slowbro" -> {
            "https://iili.io/K6UvtV.png"
        }
        "slowking" -> {
            "https://iili.io/K6UunI.png"
        }
        "oddish" -> {
            "https://iili.io/K6UunI.png"
        }
        "gloom" -> {
            "https://iili.io/KIStWb.png"
        }
        "vileplume" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bellossom" -> {
            "https://iili.io/K6UunI.png"
        }
        "drowzee" -> {
            "https://iili.io/K6UunI.png"
        }
        "hypno" -> {
            "https://iili.io/KIStWb.png"
        }
        "abra" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kadabra" -> {
            "https://iili.io/K6UunI.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UunI.png"
        }
        "ditto" -> {
            "https://iili.io/KIStWb.png"
        }
        "pineco" -> {
            "https://iili.io/K6UvtV.png"
        }
        "forretress" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoran-f" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidorina" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidoqueen" -> {
            "https://iili.io/K6UvtV.png"
        }
        "nidoran-m" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidorino" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoking" -> {
            "https://iili.io/KIStWb.png"
        }
        "yanma" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sunkern" -> {
            "https://iili.io/K6UunI.png"
        }
        "sunflora" -> {
            "https://iili.io/K6UunI.png"
        }
        "exeggcute" -> {
            "https://iili.io/KIStWb.png"
        }
        "exeggutor" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sudowoodo" -> {
            "https://iili.io/K6UunI.png"
        }
        "wobbuffet" -> {
            "https://iili.io/K6UunI.png"
        }
        "venonat" -> {
            "https://iili.io/KIStWb.png"
        }
        "venomoth" -> {
            "https://iili.io/K6UvtV.png"
        }
        "scyther" -> {
            "https://iili.io/K6UunI.png"
        }
        "scizor" -> {
            "https://iili.io/K6UunI.png"
        }
        "pinsir" -> {
            "https://iili.io/KIStWb.png"
        }
        "heracross" -> {
            "https://iili.io/K6UvtV.png"
        }
        "koffing" -> {
            "https://iili.io/K6UunI.png"
        }
        "weezing" -> {
            "https://iili.io/K6UunI.png"
        }
        "grimer" -> {
            "https://iili.io/KIStWb.png"
        }
        "muk" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magnemite" -> {
            "https://iili.io/K6UunI.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "voltorb" -> {
            "https://iili.io/KIStWb.png"
        }
        "electrode" -> {
            "https://iili.io/K6UvtV.png"
        }
        "aipom" -> {
            "https://iili.io/K6UunI.png"
        }
        "snubbull" -> {
            "https://iili.io/K6UunI.png"
        }
        "granbull" -> {
            "https://iili.io/KIStWb.png"
        }
        "vulpix" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ninetales" -> {
            "https://iili.io/K6UunI.png"
        }
        "growlithe" -> {
            "https://iili.io/K6UunI.png"
        }
        "arcanine" -> {
            "https://iili.io/KIStWb.png"
        }
        "stantler" -> {
            "https://iili.io/K6UvtV.png"
        }
        "marill" -> {
            "https://iili.io/K6UunI.png"
        }
        "azumarill" -> {
            "https://iili.io/K6UunI.png"
        }
        "diglett" -> {
            "https://iili.io/KIStWb.png"
        }
        "dugtrio" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mankey" -> {
            "https://iili.io/K6UunI.png"
        }
        "primeape" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowth" -> {
            "https://iili.io/KIStWb.png"
        }
        "persian" -> {
            "https://iili.io/K6UvtV.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "golduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "machop" -> {
            "https://iili.io/KIStWb.png"
        }
        "machoke" -> {
            "https://iili.io/K6UvtV.png"
        }
        "machamp" -> {
            "https://iili.io/K6UunI.png"
        }
        "tyrogue" -> {
            "https://iili.io/K6UunI.png"
        }
        "hitmonlee" -> {
            "https://iili.io/KIStWb.png"
        }
        "hitmonchan" -> {
            "https://iili.io/K6UvtV.png"
        }
        "hitmontop" -> {
            "https://iili.io/K6UunI.png"
        }
        "girafarig" -> {
            "https://iili.io/K6UunI.png"
        }
        "tauros" -> {
            "https://iili.io/KIStWb.png"
        }
        "miltank" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magby" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmar" -> {
            "https://iili.io/K6UunI.png"
        }
        "smoochum" -> {
            "https://iili.io/K6UunI.png"
        }
        "jynx" -> {
            "https://iili.io/K6UunI.png"
        }
        "elekid" -> {
            "https://iili.io/KIStWb.png"
        }
        "mr-mime" -> {
            "https://iili.io/K6UvtV.png"
        }
        "smeargle" -> {
            "https://iili.io/K6UunI.png"
        }
        "farfetchd" -> {
            "https://iili.io/K6UunI.png"
        }
        "natu" -> {
            "https://iili.io/K6UunI.png"
        }
        "xatu" -> {
            "https://iili.io/K6UunI.png"
        }
        "qwilfish" -> {
            "https://iili.io/KIStWb.png"
        }
        "tentacool" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UunI.png"
        }
        "krabby" -> {
            "https://iili.io/K6UunI.png"
        }
        "kingler" -> {
            "https://iili.io/K6UunI.png"
        }
        "shuckle" -> {
            "https://iili.io/K6UunI.png"
        }
        "staryu" -> {
            "https://iili.io/KIStWb.png"
        }
        "starmie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shellder" -> {
            "https://iili.io/K6UunI.png"
        }
        "cloyster" -> {
            "https://iili.io/K6UunI.png"
        }
        "corsola" -> {
            "https://iili.io/K6UunI.png"
        }
        "remoraid" -> {
            "https://iili.io/K6UunI.png"
        }
        "octillery" -> {
            "https://iili.io/KIStWb.png"
        }
        "chinchou" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lanturn" -> {
            "https://iili.io/K6UunI.png"
        }
        "seel" -> {
            "https://iili.io/K6UunI.png"
        }
        "dewgong" -> {
            "https://iili.io/K6UunI.png"
        }
        "lickitung" -> {
            "https://iili.io/K6UunI.png"
        }
        "tangela" -> {
            "https://iili.io/KIStWb.png"
        }
        "eevee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/K6UunI.png"
        }
        "espeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "umbreon" -> {
            "https://iili.io/KIStWb.png"
        }
        "horsea" -> {
            "https://iili.io/K6UvtV.png"
        }
        "seadra" -> {
            "https://iili.io/K6UunI.png"
        }
        "kingdra" -> {
            "https://iili.io/K6UunI.png"
        }
        "gligar" -> {
            "https://iili.io/K6UunI.png"
        }
        "delibird" -> {
            "https://iili.io/K6UunI.png"
        }
        "swinub" -> {
            "https://iili.io/KIStWb.png"
        }
        "piloswine" -> {
            "https://iili.io/K6UvtV.png"
        }
        "teddiursa" -> {
            "https://iili.io/K6UunI.png"
        }
        "ursaring" -> {
            "https://iili.io/K6UunI.png"
        }
        "phanpy" -> {
            "https://iili.io/K6UunI.png"
        }
        "donphan" -> {
            "https://iili.io/K6UunI.png"
        }
        "matine" -> {
            "https://iili.io/KIStWb.png"
        }
        "skarmory" -> {
            "https://iili.io/K6UvtV.png"
        }
        "doduo" -> {
            "https://iili.io/K6UunI.png"
        }
        "dodrio" -> {
            "https://iili.io/K6UunI.png"
        }
        "ponyta" -> {
            "https://iili.io/K6UunI.png"
        }
        "rapidash" -> {
            "https://iili.io/K6UunI.png"
        }
        "cubone" -> {
            "https://iili.io/KIStWb.png"
        }
        "marowak" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kangaskhan" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyhorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhydon" -> {
            "https://iili.io/K6UunI.png"
        }
        "murkrow" -> {
            "https://iili.io/K6UunI.png"
        }
        "houndour" -> {
            "https://iili.io/KIStWb.png"
        }
        "houndoom" -> {
            "https://iili.io/K6UvtV.png"
        }
        "slugma" -> {
            "https://iili.io/K6UunI.png"
        }
        "magcargo" -> {
            "https://iili.io/K6UunI.png"
        }
        "sneasel" -> {
            "https://iili.io/K6UunI.png"
        }
        "misdreavus" -> {
            "https://iili.io/K6UunI.png"
        }
        "porygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "porygon2" -> {
            "https://iili.io/K6UvtV.png"
        }
        "chansey" -> {
            "https://iili.io/K6UunI.png"
        }
        "blissey" -> {
            "https://iili.io/K6UunI.png"
        }
        "lapras" -> {
            "https://iili.io/K6UunI.png"
        }
        "omanyte" -> {
            "https://iili.io/K6UunI.png"
        }
        "omastar" -> {
            "https://iili.io/KIStWb.png"
        }
        "kabuto" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kabutops" -> {
            "https://iili.io/K6UunI.png"
        }
        "aerodactyl" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorlax" -> {
            "https://iili.io/K6UunI.png"
        }
        "bulbasaur" -> {
            "https://iili.io/K6UunI.png"
        }
        "ivysaur" -> {
            "https://iili.io/KIStWb.png"
        }
        "venusaur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "charmander" -> {
            "https://iili.io/K6UunI.png"
        }
        "charmeleon" -> {
            "https://iili.io/K6UunI.png"
        }
        "charizard" -> {
            "https://iili.io/K6UunI.png"
        }
        "squirtle" -> {
            "https://iili.io/K6UunI.png"
        }
        "wartortle" -> {
            "https://iili.io/KIStWb.png"
        }
        "blastoise" -> {
            "https://iili.io/K6UvtV.png"
        }
        "articuno" -> {
            "https://iili.io/K6UunI.png"
        }
        "zapdos" -> {
            "https://iili.io/K6UunI.png"
        }
        "moltres" -> {
            "https://iili.io/K6UunI.png"
        }
        "raikou" -> {
            "https://iili.io/K6UunI.png"
        }
        "entei" -> {
            "https://iili.io/KIStWb.png"
        }
        "suicune" -> {
            "https://iili.io/K6UvtV.png"
        }
        "dratini" -> {
            "https://iili.io/K6UunI.png"
        }
        "dragonair" -> {
            "https://iili.io/K6UunI.png"
        }
        "dragonite" -> {
            "https://iili.io/K6UunI.png"
        }
        "larvitar" -> {
            "https://iili.io/K6UunI.png"
        }
        "pupitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyranitar" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lugia" -> {
            "https://iili.io/K6UunI.png"
        }
        "ho-oh" -> {
            "https://iili.io/K6UunI.png"
        }
        "mewtwo" -> {
            "https://iili.io/K6UunI.png"
        }
        "mew" -> {
            "https://iili.io/K6UunI.png"
        }
        "celebi" -> {
            "https://iili.io/KIStWb.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesHoenn(pokemonName: String): String {
    return when (pokemonName) {
        "treecko" -> {
            "https://iili.io/KIStWb.png"
        }
        "grovyle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sceptile" -> {
            "https://iili.io/K6UunI.png"
        }
        "torchic" -> {
            "https://iili.io/KIStWb.png"
        }
        "combusken" -> {
            "https://iili.io/K6UvtV.png"
        }
        "blaziken" -> {
            "https://iili.io/K6UunI.png"
        }
        "mudkip" -> {
            "https://iili.io/K6UunI.png"
        }
        "marshtomp" -> {
            "https://iili.io/KIStWb.png"
        }
        "swampert" -> {
            "https://iili.io/K6UvtV.png"
        }
        "poochyena" -> {
            "https://iili.io/K6UunI.png"
        }
        "mightyena" -> {
            "https://iili.io/K6UunI.png"
        }
        "zigzagoon" -> {
            "https://iili.io/KIStWb.png"
        }
        "linoone" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wurmple" -> {
            "https://iili.io/K6UunI.png"
        }
        "silcoon" -> {
            "https://iili.io/K6UunI.png"
        }
        "beautifly" -> {
            "https://iili.io/KIStWb.png"
        }
        "cascoon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "dustox" -> {
            "https://iili.io/K6UunI.png"
        }
        "lotad" -> {
            "https://iili.io/K6UunI.png"
        }
        "lombre" -> {
            "https://iili.io/KIStWb.png"
        }
        "ludicolo" -> {
            "https://iili.io/K6UvtV.png"
        }
        "seedot" -> {
            "https://iili.io/K6UunI.png"
        }
        "nuzleaf" -> {
            "https://iili.io/K6UunI.png"
        }
        "shiftry" -> {
            "https://iili.io/KIStWb.png"
        }
        "taillow" -> {
            "https://iili.io/K6UvtV.png"
        }
        "swellow" -> {
            "https://iili.io/K6UunI.png"
        }
        "wingull" -> {
            "https://iili.io/K6UunI.png"
        }
        "pelipper" -> {
            "https://iili.io/KIStWb.png"
        }
        "ralts" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kirlia" -> {
            "https://iili.io/K6UunI.png"
        }
        "gardevoir" -> {
            "https://iili.io/K6UunI.png"
        }
        "surskit" -> {
            "https://iili.io/KIStWb.png"
        }
        "masquerain" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shroomish" -> {
            "https://iili.io/K6UunI.png"
        }
        "breloom" -> {
            "https://iili.io/K6UunI.png"
        }
        "slakoth" -> {
            "https://iili.io/KIStWb.png"
        }
        "vigoroth" -> {
            "https://iili.io/K6UvtV.png"
        }
        "slaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "abra" -> {
            "https://iili.io/K6UunI.png"
        }
        "kadabra" -> {
            "https://iili.io/KIStWb.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UvtV.png"
        }
        "nincada" -> {
            "https://iili.io/K6UunI.png"
        }
        "ninjask" -> {
            "https://iili.io/K6UunI.png"
        }
        "shedinja" -> {
            "https://iili.io/KIStWb.png"
        }
        "whishmur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "loudred" -> {
            "https://iili.io/K6UunI.png"
        }
        "exploud" -> {
            "https://iili.io/K6UunI.png"
        }
        "makuhita" -> {
            "https://iili.io/KIStWb.png"
        }
        "hariyama" -> {
            "https://iili.io/K6UvtV.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "magikarp" -> {
            "https://iili.io/KIStWb.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UvtV.png"
        }
        "azurill" -> {
            "https://iili.io/K6UunI.png"
        }
        "marill" -> {
            "https://iili.io/K6UunI.png"
        }
        "azumarill" -> {
            "https://iili.io/KIStWb.png"
        }
        "geodude" -> {
            "https://iili.io/K6UvtV.png"
        }
        "graveler" -> {
            "https://iili.io/K6UunI.png"
        }
        "golem" -> {
            "https://iili.io/K6UunI.png"
        }
        "nosepass" -> {
            "https://iili.io/KIStWb.png"
        }
        "skitty" -> {
            "https://iili.io/K6UvtV.png"
        }
        "delcatty" -> {
            "https://iili.io/K6UunI.png"
        }
        "zubat" -> {
            "https://iili.io/K6UunI.png"
        }
        "golbat" -> {
            "https://iili.io/KIStWb.png"
        }
        "crobat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tentacool" -> {
            "https://iili.io/K6UunI.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UunI.png"
        }
        "sableye" -> {
            "https://iili.io/KIStWb.png"
        }
        "mawile" -> {
            "https://iili.io/K6UvtV.png"
        }
        "aron" -> {
            "https://iili.io/K6UunI.png"
        }
        "lairon" -> {
            "https://iili.io/K6UunI.png"
        }
        "aggron" -> {
            "https://iili.io/KIStWb.png"
        }
        "machop" -> {
            "https://iili.io/K6UvtV.png"
        }
        "machoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "machamp" -> {
            "https://iili.io/K6UunI.png"
        }
        "meditite" -> {
            "https://iili.io/KIStWb.png"
        }
        "medicham" -> {
            "https://iili.io/K6UvtV.png"
        }
        "electrike" -> {
            "https://iili.io/K6UunI.png"
        }
        "manectric" -> {
            "https://iili.io/K6UunI.png"
        }
        "plusle" -> {
            "https://iili.io/KIStWb.png"
        }
        "minum" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magnemite" -> {
            "https://iili.io/K6UunI.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "voltorb" -> {
            "https://iili.io/KIStWb.png"
        }
        "electrode" -> {
            "https://iili.io/K6UvtV.png"
        }
        "volbeat" -> {
            "https://iili.io/K6UunI.png"
        }
        "illumise" -> {
            "https://iili.io/K6UunI.png"
        }
        "oddish" -> {
            "https://iili.io/KIStWb.png"
        }
        "gloom" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vileplume" -> {
            "https://iili.io/K6UunI.png"
        }
        "bellossom" -> {
            "https://iili.io/K6UunI.png"
        }
        "doduo" -> {
            "https://iili.io/KIStWb.png"
        }
        "dodrio" -> {
            "https://iili.io/K6UvtV.png"
        }
        "roselia" -> {
            "https://iili.io/K6UunI.png"
        }
        "gulpin" -> {
            "https://iili.io/K6UunI.png"
        }
        "swalot" -> {
            "https://iili.io/KIStWb.png"
        }
        "carvanha" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sharpedo" -> {
            "https://iili.io/K6UunI.png"
        }
        "wailmer" -> {
            "https://iili.io/K6UunI.png"
        }
        "wailord" -> {
            "https://iili.io/KIStWb.png"
        }
        "numel" -> {
            "https://iili.io/K6UvtV.png"
        }
        "camerupt" -> {
            "https://iili.io/K6UunI.png"
        }
        "slugma" -> {
            "https://iili.io/K6UunI.png"
        }
        "magcargo" -> {
            "https://iili.io/KIStWb.png"
        }
        "torkoal" -> {
            "https://iili.io/K6UvtV.png"
        }
        "grimer" -> {
            "https://iili.io/K6UunI.png"
        }
        "muk" -> {
            "https://iili.io/K6UunI.png"
        }
        "koffing" -> {
            "https://iili.io/KIStWb.png"
        }
        "weezing" -> {
            "https://iili.io/K6UvtV.png"
        }
        "spoink" -> {
            "https://iili.io/K6UunI.png"
        }
        "grumpig" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandshrew" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandslash" -> {
            "https://iili.io/K6UvtV.png"
        }
        "spinda" -> {
            "https://iili.io/K6UunI.png"
        }
        "skarmory" -> {
            "https://iili.io/K6UunI.png"
        }
        "trapinch" -> {
            "https://iili.io/KIStWb.png"
        }
        "vibrava" -> {
            "https://iili.io/K6UvtV.png"
        }
        "flygon" -> {
            "https://iili.io/K6UunI.png"
        }
        "cacnea" -> {
            "https://iili.io/K6UunI.png"
        }
        "cacturne" -> {
            "https://iili.io/KIStWb.png"
        }
        "swablu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "altaria" -> {
            "https://iili.io/K6UunI.png"
        }
        "zangoose" -> {
            "https://iili.io/K6UunI.png"
        }
        "seviper" -> {
            "https://iili.io/KIStWb.png"
        }
        "lunatone" -> {
            "https://iili.io/K6UvtV.png"
        }
        "solrock" -> {
            "https://iili.io/K6UunI.png"
        }
        "barboach" -> {
            "https://iili.io/K6UunI.png"
        }
        "whiscash" -> {
            "https://iili.io/KIStWb.png"
        }
        "corphish" -> {
            "https://iili.io/K6UvtV.png"
        }
        "crawdaunt" -> {
            "https://iili.io/K6UunI.png"
        }
        "baltoy" -> {
            "https://iili.io/K6UunI.png"
        }
        "claydol" -> {
            "https://iili.io/KIStWb.png"
        }
        "lileep" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cradily" -> {
            "https://iili.io/K6UunI.png"
        }
        "anorith" -> {
            "https://iili.io/K6UunI.png"
        }
        "armaldo" -> {
            "https://iili.io/KIStWb.png"
        }
        "igglybuff" -> {
            "https://iili.io/K6UvtV.png"
        }
        "jigglypuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "wigglytuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "feebas" -> {
            "https://iili.io/KIStWb.png"
        }
        "milotic" -> {
            "https://iili.io/K6UvtV.png"
        }
        "castform" -> {
            "https://iili.io/K6UunI.png"
        }
        "staryu" -> {
            "https://iili.io/K6UunI.png"
        }
        "starmie" -> {
            "https://iili.io/KIStWb.png"
        }
        "kecleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shuppet" -> {
            "https://iili.io/K6UunI.png"
        }
        "banette" -> {
            "https://iili.io/K6UunI.png"
        }
        "duskull" -> {
            "https://iili.io/KIStWb.png"
        }
        "dusclops" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tropius" -> {
            "https://iili.io/K6UunI.png"
        }
        "chimecho" -> {
            "https://iili.io/K6UunI.png"
        }
        "absol" -> {
            "https://iili.io/K6UunI.png"
        }
        "vulpix" -> {
            "https://iili.io/K6UunI.png"
        }
        "ninetales" -> {
            "https://iili.io/KIStWb.png"
        }
        "pichu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pikachu" -> {
            "https://iili.io/K6UunI.png"
        }
        "raichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "golduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "wynaut" -> {
            "https://iili.io/KIStWb.png"
        }
        "wobbuffet" -> {
            "https://iili.io/K6UvtV.png"
        }
        "natu" -> {
            "https://iili.io/K6UunI.png"
        }
        "xatu" -> {
            "https://iili.io/K6UunI.png"
        }
        "girafarig" -> {
            "https://iili.io/K6UunI.png"
        }
        "phanpy" -> {
            "https://iili.io/K6UunI.png"
        }
        "donphan" -> {
            "https://iili.io/KIStWb.png"
        }
        "pinsir" -> {
            "https://iili.io/K6UvtV.png"
        }
        "heracross" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyhorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhydon" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorut" -> {
            "https://iili.io/K6UunI.png"
        }
        "glalie" -> {
            "https://iili.io/KIStWb.png"
        }
        "spheal" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sealeo" -> {
            "https://iili.io/K6UunI.png"
        }
        "walrein" -> {
            "https://iili.io/K6UunI.png"
        }
        "clamperl" -> {
            "https://iili.io/K6UunI.png"
        }
        "huntail" -> {
            "https://iili.io/K6UunI.png"
        }
        "gorebyss" -> {
            "https://iili.io/KIStWb.png"
        }
        "relicanth" -> {
            "https://iili.io/K6UvtV.png"
        }
        "corsola" -> {
            "https://iili.io/K6UunI.png"
        }
        "chinchou" -> {
            "https://iili.io/K6UunI.png"
        }
        "lanturn" -> {
            "https://iili.io/K6UunI.png"
        }
        "luvdisc" -> {
            "https://iili.io/K6UunI.png"
        }
        "horsea" -> {
            "https://iili.io/KIStWb.png"
        }
        "seadra" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kingdra" -> {
            "https://iili.io/K6UunI.png"
        }
        "bagon" -> {
            "https://iili.io/K6UunI.png"
        }
        "shelgon" -> {
            "https://iili.io/K6UunI.png"
        }
        "salamence" -> {
            "https://iili.io/K6UunI.png"
        }
        "beldum" -> {
            "https://iili.io/KIStWb.png"
        }
        "metang" -> {
            "https://iili.io/K6UvtV.png"
        }
        "metagross" -> {
            "https://iili.io/K6UunI.png"
        }
        "regirock" -> {
            "https://iili.io/K6UunI.png"
        }
        "regice" -> {
            "https://iili.io/K6UunI.png"
        }
        "registeel" -> {
            "https://iili.io/K6UunI.png"
        }
        "latias" -> {
            "https://iili.io/KIStWb.png"
        }
        "latios" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kyogre" -> {
            "https://iili.io/K6UunI.png"
        }
        "groudon" -> {
            "https://iili.io/K6UunI.png"
        }
        "rayquaza" -> {
            "https://iili.io/K6UunI.png"
        }
        "jirachi" -> {
            "https://iili.io/K6UunI.png"
        }
        "deoxys" -> {
            "https://iili.io/KIStWb.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesSinnoh(pokemonName: String): String {
    return when (pokemonName) {
        "turtwig" -> {
            "https://iili.io/KIStWb.png"
        }
        "grotle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "torterra" -> {
            "https://iili.io/K6UunI.png"
        }
        "chimchar" -> {
            "https://iili.io/KIStWb.png"
        }
        "monferno" -> {
            "https://iili.io/K6UvtV.png"
        }
        "infernape" -> {
            "https://iili.io/K6UunI.png"
        }
        "piplup" -> {
            "https://iili.io/K6UunI.png"
        }
        "prinplup" -> {
            "https://iili.io/KIStWb.png"
        }
        "empoleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "starly" -> {
            "https://iili.io/K6UunI.png"
        }
        "staravia" -> {
            "https://iili.io/K6UunI.png"
        }
        "staraptor" -> {
            "https://iili.io/KIStWb.png"
        }
        "bidoof" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bibarel" -> {
            "https://iili.io/K6UunI.png"
        }
        "kricketot" -> {
            "https://iili.io/K6UunI.png"
        }
        "kricketune" -> {
            "https://iili.io/KIStWb.png"
        }
        "shinx" -> {
            "https://iili.io/K6UvtV.png"
        }
        "luxio" -> {
            "https://iili.io/K6UunI.png"
        }
        "luxray" -> {
            "https://iili.io/K6UunI.png"
        }
        "abra" -> {
            "https://iili.io/KIStWb.png"
        }
        "kadabra" -> {
            "https://iili.io/K6UvtV.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UunI.png"
        }
        "magikarp" -> {
            "https://iili.io/K6UunI.png"
        }
        "gyarados" -> {
            "https://iili.io/KIStWb.png"
        }
        "budew" -> {
            "https://iili.io/K6UvtV.png"
        }
        "roselia" -> {
            "https://iili.io/K6UunI.png"
        }
        "roserade" -> {
            "https://iili.io/K6UunI.png"
        }
        "zubat" -> {
            "https://iili.io/KIStWb.png"
        }
        "golbat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "crobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "geodude" -> {
            "https://iili.io/K6UunI.png"
        }
        "graveler" -> {
            "https://iili.io/KIStWb.png"
        }
        "golem" -> {
            "https://iili.io/K6UvtV.png"
        }
        "onix" -> {
            "https://iili.io/K6UunI.png"
        }
        "steelix" -> {
            "https://iili.io/K6UunI.png"
        }
        "cranidos" -> {
            "https://iili.io/KIStWb.png"
        }
        "rampardos" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shieldon" -> {
            "https://iili.io/K6UunI.png"
        }
        "bastiodon" -> {
            "https://iili.io/K6UunI.png"
        }
        "machop" -> {
            "https://iili.io/KIStWb.png"
        }
        "machoke" -> {
            "https://iili.io/K6UvtV.png"
        }
        "machamp" -> {
            "https://iili.io/K6UunI.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "golduck" -> {
            "https://iili.io/KIStWb.png"
        }
        "burmy" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wormadam" -> {
            "https://iili.io/K6UunI.png"
        }
        "mothim" -> {
            "https://iili.io/K6UunI.png"
        }
        "wurmple" -> {
            "https://iili.io/KIStWb.png"
        }
        "silcoon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "beautifly" -> {
            "https://iili.io/K6UunI.png"
        }
        "cascoon" -> {
            "https://iili.io/K6UunI.png"
        }
        "dustox" -> {
            "https://iili.io/KIStWb.png"
        }
        "combee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vespiquen" -> {
            "https://iili.io/K6UunI.png"
        }
        "pachirisu" -> {
            "https://iili.io/K6UunI.png"
        }
        "buizel" -> {
            "https://iili.io/KIStWb.png"
        }
        "floatzel" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cherubi" -> {
            "https://iili.io/K6UunI.png"
        }
        "cherrim" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellos" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastrodon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "heracross" -> {
            "https://iili.io/K6UunI.png"
        }
        "aipom" -> {
            "https://iili.io/K6UunI.png"
        }
        "ambipom" -> {
            "https://iili.io/KIStWb.png"
        }
        "drifloon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "drifblim" -> {
            "https://iili.io/K6UunI.png"
        }
        "buneary" -> {
            "https://iili.io/K6UunI.png"
        }
        "lopunny" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastly" -> {
            "https://iili.io/K6UvtV.png"
        }
        "haunter" -> {
            "https://iili.io/K6UunI.png"
        }
        "gengar" -> {
            "https://iili.io/K6UunI.png"
        }
        "misdreavus" -> {
            "https://iili.io/KIStWb.png"
        }
        "mismagius" -> {
            "https://iili.io/K6UvtV.png"
        }
        "murkrow" -> {
            "https://iili.io/K6UunI.png"
        }
        "honchkrow" -> {
            "https://iili.io/K6UunI.png"
        }
        "glameow" -> {
            "https://iili.io/KIStWb.png"
        }
        "purugly" -> {
            "https://iili.io/K6UvtV.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "barboach" -> {
            "https://iili.io/KIStWb.png"
        }
        "whiscash" -> {
            "https://iili.io/K6UvtV.png"
        }
        "chingling" -> {
            "https://iili.io/K6UunI.png"
        }
        "chimecho" -> {
            "https://iili.io/K6UunI.png"
        }
        "stunky" -> {
            "https://iili.io/KIStWb.png"
        }
        "skuntank" -> {
            "https://iili.io/K6UvtV.png"
        }
        "meditite" -> {
            "https://iili.io/K6UunI.png"
        }
        "medicham" -> {
            "https://iili.io/K6UunI.png"
        }
        "bronzor" -> {
            "https://iili.io/KIStWb.png"
        }
        "bronzong" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ponyta" -> {
            "https://iili.io/K6UunI.png"
        }
        "rapidash" -> {
            "https://iili.io/K6UunI.png"
        }
        "bonsly" -> {
            "https://iili.io/KIStWb.png"
        }
        "sudowoodo" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mime-jr" -> {
            "https://iili.io/K6UunI.png"
        }
        "mr-mime" -> {
            "https://iili.io/K6UunI.png"
        }
        "happiny" -> {
            "https://iili.io/KIStWb.png"
        }
        "chansey" -> {
            "https://iili.io/K6UvtV.png"
        }
        "blissey" -> {
            "https://iili.io/K6UunI.png"
        }
        "cleffa" -> {
            "https://iili.io/K6UunI.png"
        }
        "clefairy" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefable" -> {
            "https://iili.io/K6UvtV.png"
        }
        "chatot" -> {
            "https://iili.io/K6UunI.png"
        }
        "pichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "pikachu" -> {
            "https://iili.io/KIStWb.png"
        }
        "raichu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "hoothoot" -> {
            "https://iili.io/K6UunI.png"
        }
        "noctowl" -> {
            "https://iili.io/K6UunI.png"
        }
        "spiritomb" -> {
            "https://iili.io/KIStWb.png"
        }
        "gible" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gabite" -> {
            "https://iili.io/K6UunI.png"
        }
        "garchomp" -> {
            "https://iili.io/K6UunI.png"
        }
        "munchlax" -> {
            "https://iili.io/KIStWb.png"
        }
        "snorlax" -> {
            "https://iili.io/K6UvtV.png"
        }
        "unown" -> {
            "https://iili.io/K6UunI.png"
        }
        "riolu" -> {
            "https://iili.io/K6UunI.png"
        }
        "lucario" -> {
            "https://iili.io/KIStWb.png"
        }
        "wooper" -> {
            "https://iili.io/K6UvtV.png"
        }
        "quagsire" -> {
            "https://iili.io/K6UunI.png"
        }
        "wingull" -> {
            "https://iili.io/K6UunI.png"
        }
        "pelipper" -> {
            "https://iili.io/KIStWb.png"
        }
        "girafarig" -> {
            "https://iili.io/K6UvtV.png"
        }
        "hippopotas" -> {
            "https://iili.io/K6UunI.png"
        }
        "hippowdon" -> {
            "https://iili.io/K6UunI.png"
        }
        "azurill" -> {
            "https://iili.io/KIStWb.png"
        }
        "marill" -> {
            "https://iili.io/K6UvtV.png"
        }
        "azumarill" -> {
            "https://iili.io/K6UunI.png"
        }
        "skorupi" -> {
            "https://iili.io/K6UunI.png"
        }
        "drapion" -> {
            "https://iili.io/KIStWb.png"
        }
        "croagunk" -> {
            "https://iili.io/K6UvtV.png"
        }
        "toxicroak" -> {
            "https://iili.io/K6UunI.png"
        }
        "carnivine" -> {
            "https://iili.io/K6UunI.png"
        }
        "remoraid" -> {
            "https://iili.io/KIStWb.png"
        }
        "octillery" -> {
            "https://iili.io/K6UvtV.png"
        }
        "finneon" -> {
            "https://iili.io/K6UunI.png"
        }
        "lumineon" -> {
            "https://iili.io/K6UunI.png"
        }
        "tentacool" -> {
            "https://iili.io/KIStWb.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UvtV.png"
        }
        "feebas" -> {
            "https://iili.io/K6UunI.png"
        }
        "milotic" -> {
            "https://iili.io/K6UunI.png"
        }
        "mantyke" -> {
            "https://iili.io/KIStWb.png"
        }
        "mantine" -> {
            "https://iili.io/K6UvtV.png"
        }
        "snover" -> {
            "https://iili.io/K6UunI.png"
        }
        "abomasnow" -> {
            "https://iili.io/K6UunI.png"
        }
        "sneasel" -> {
            "https://iili.io/KIStWb.png"
        }
        "weavile" -> {
            "https://iili.io/K6UvtV.png"
        }
        "uxie" -> {
            "https://iili.io/K6UunI.png"
        }
        "mesprit" -> {
            "https://iili.io/K6UunI.png"
        }
        "azelf" -> {
            "https://iili.io/KIStWb.png"
        }
        "dialga" -> {
            "https://iili.io/K6UvtV.png"
        }
        "palkia" -> {
            "https://iili.io/K6UunI.png"
        }
        "manaphy" -> {
            "https://iili.io/K6UunI.png"
        }
        "rotom" -> {
            "https://iili.io/K6UunI.png"
        }
        "gligar" -> {
            "https://iili.io/K6UunI.png"
        }
        "gliscor" -> {
            "https://iili.io/KIStWb.png"
        }
        "nosepass" -> {
            "https://iili.io/K6UvtV.png"
        }
        "probopass" -> {
            "https://iili.io/K6UunI.png"
        }
        "ralts" -> {
            "https://iili.io/K6UunI.png"
        }
        "kirlia" -> {
            "https://iili.io/K6UunI.png"
        }
        "gardevoir" -> {
            "https://iili.io/K6UunI.png"
        }
        "gallade" -> {
            "https://iili.io/KIStWb.png"
        }
        "lickitung" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lickilicky" -> {
            "https://iili.io/K6UunI.png"
        }
        "eevee" -> {
            "https://iili.io/K6UunI.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/KIStWb.png"
        }
        "espeon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "umbreon" -> {
            "https://iili.io/K6UunI.png"
        }
        "leafeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "glaceon" -> {
            "https://iili.io/K6UunI.png"
        }
        "swablu" -> {
            "https://iili.io/K6UunI.png"
        }
        "altaria" -> {
            "https://iili.io/KIStWb.png"
        }
        "togepi" -> {
            "https://iili.io/K6UvtV.png"
        }
        "togetic" -> {
            "https://iili.io/K6UunI.png"
        }
        "togekiss" -> {
            "https://iili.io/K6UunI.png"
        }
        "houndour" -> {
            "https://iili.io/K6UunI.png"
        }
        "houndoom" -> {
            "https://iili.io/K6UunI.png"
        }
        "magnemite" -> {
            "https://iili.io/KIStWb.png"
        }
        "magneton" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magnezone" -> {
            "https://iili.io/K6UunI.png"
        }
        "tangela" -> {
            "https://iili.io/K6UunI.png"
        }
        "tangrowth" -> {
            "https://iili.io/K6UunI.png"
        }
        "yanma" -> {
            "https://iili.io/K6UunI.png"
        }
        "yanmega" -> {
            "https://iili.io/KIStWb.png"
        }
        "tropius" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rhyhorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhydon" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyperior" -> {
            "https://iili.io/K6UunI.png"
        }
        "duskull" -> {
            "https://iili.io/K6UunI.png"
        }
        "dusclops" -> {
            "https://iili.io/KIStWb.png"
        }
        "dusknoir" -> {
            "https://iili.io/K6UvtV.png"
        }
        "porygon" -> {
            "https://iili.io/K6UunI.png"
        }
        "porygon2" -> {
            "https://iili.io/K6UunI.png"
        }
        "porygon-z" -> {
            "https://iili.io/K6UunI.png"
        }
        "scyther" -> {
            "https://iili.io/K6UunI.png"
        }
        "scizor" -> {
            "https://iili.io/KIStWb.png"
        }
        "elekid" -> {
            "https://iili.io/K6UvtV.png"
        }
        "electabuzz" -> {
            "https://iili.io/K6UunI.png"
        }
        "electivire" -> {
            "https://iili.io/K6UunI.png"
        }
        "magby" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmar" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmortar" -> {
            "https://iili.io/KIStWb.png"
        }
        "swinub" -> {
            "https://iili.io/K6UunI.png"
        }
        "piloswine" -> {
            "https://iili.io/KIStWb.png"
        }
        "mamoswine" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "glalie" -> {
            "https://iili.io/K6UunI.png"
        }
        "froslass" -> {
            "https://iili.io/KIStWb.png"
        }
        "absol" -> {
            "https://iili.io/K6UunI.png"
        }
        "giratina" -> {
            "https://iili.io/KIStWb.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesUnova(pokemonName: String): String {
    return when (pokemonName) {
        "victini" -> {
            "https://iili.io/KIStWb.png"
        }
        "snivy" -> {
            "https://iili.io/K6UvtV.png"
        }
        "servine" -> {
            "https://iili.io/K6UunI.png"
        }
        "serperior" -> {
            "https://iili.io/KIStWb.png"
        }
        "tepig" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pignite" -> {
            "https://iili.io/K6UunI.png"
        }
        "emboar" -> {
            "https://iili.io/K6UunI.png"
        }
        "oshawott" -> {
            "https://iili.io/KIStWb.png"
        }
        "dewott" -> {
            "https://iili.io/K6UvtV.png"
        }
        "samurott" -> {
            "https://iili.io/K6UunI.png"
        }
        "patrat" -> {
            "https://iili.io/K6UunI.png"
        }
        "watchog" -> {
            "https://iili.io/KIStWb.png"
        }
        "purrloin" -> {
            "https://iili.io/K6UvtV.png"
        }
        "liepard" -> {
            "https://iili.io/K6UunI.png"
        }
        "pidove" -> {
            "https://iili.io/K6UunI.png"
        }
        "tranquill" -> {
            "https://iili.io/KIStWb.png"
        }
        "unfezant" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sewaddle" -> {
            "https://iili.io/K6UunI.png"
        }
        "swadloon" -> {
            "https://iili.io/K6UunI.png"
        }
        "leavanny" -> {
            "https://iili.io/KIStWb.png"
        }
        "sunkern" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sunflora" -> {
            "https://iili.io/K6UunI.png"
        }
        "lillipup" -> {
            "https://iili.io/K6UunI.png"
        }
        "herdier" -> {
            "https://iili.io/KIStWb.png"
        }
        "stoutland" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mareep" -> {
            "https://iili.io/K6UunI.png"
        }
        "flaaffy" -> {
            "https://iili.io/K6UunI.png"
        }
        "ampharos" -> {
            "https://iili.io/KIStWb.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UvtV.png"
        }
        "golduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "azurill" -> {
            "https://iili.io/K6UunI.png"
        }
        "marill" -> {
            "https://iili.io/KIStWb.png"
        }
        "azumarill" -> {
            "https://iili.io/K6UvtV.png"
        }
        "riolu" -> {
            "https://iili.io/K6UunI.png"
        }
        "lucario" -> {
            "https://iili.io/K6UunI.png"
        }
        "dunsparce" -> {
            "https://iili.io/KIStWb.png"
        }
        "audino" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pansage" -> {
            "https://iili.io/K6UunI.png"
        }
        "simisage" -> {
            "https://iili.io/K6UunI.png"
        }
        "pansear" -> {
            "https://iili.io/KIStWb.png"
        }
        "simisear" -> {
            "https://iili.io/K6UvtV.png"
        }
        "panpour" -> {
            "https://iili.io/K6UunI.png"
        }
        "simipour" -> {
            "https://iili.io/K6UunI.png"
        }
        "venipede" -> {
            "https://iili.io/KIStWb.png"
        }
        "whirlipede" -> {
            "https://iili.io/K6UvtV.png"
        }
        "scolipede" -> {
            "https://iili.io/K6UunI.png"
        }
        "koffing" -> {
            "https://iili.io/K6UunI.png"
        }
        "weezing" -> {
            "https://iili.io/KIStWb.png"
        }
        "magnemite" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "magnezone" -> {
            "https://iili.io/K6UunI.png"
        }
        "growlithe" -> {
            "https://iili.io/KIStWb.png"
        }
        "arcanine" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magby" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmar" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmortar" -> {
            "https://iili.io/KIStWb.png"
        }
        "elekid" -> {
            "https://iili.io/K6UvtV.png"
        }
        "electabuzz" -> {
            "https://iili.io/K6UunI.png"
        }
        "electivire" -> {
            "https://iili.io/K6UunI.png"
        }
        "rattata" -> {
            "https://iili.io/KIStWb.png"
        }
        "raticate" -> {
            "https://iili.io/K6UvtV.png"
        }
        "zubat" -> {
            "https://iili.io/K6UunI.png"
        }
        "golbat" -> {
            "https://iili.io/K6UunI.png"
        }
        "crobat" -> {
            "https://iili.io/KIStWb.png"
        }
        "grimer" -> {
            "https://iili.io/K6UvtV.png"
        }
        "muk" -> {
            "https://iili.io/K6UunI.png"
        }
        "woobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "swoobat" -> {
            "https://iili.io/KIStWb.png"
        }
        "roggenrola" -> {
            "https://iili.io/K6UvtV.png"
        }
        "boldore" -> {
            "https://iili.io/K6UunI.png"
        }
        "gigalith" -> {
            "https://iili.io/K6UunI.png"
        }
        "onix" -> {
            "https://iili.io/KIStWb.png"
        }
        "steelix" -> {
            "https://iili.io/K6UvtV.png"
        }
        "timburr" -> {
            "https://iili.io/K6UunI.png"
        }
        "gurdurr" -> {
            "https://iili.io/K6UunI.png"
        }
        "conkeldurr" -> {
            "https://iili.io/KIStWb.png"
        }
        "drilbur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "excadrill" -> {
            "https://iili.io/K6UunI.png"
        }
        "skitty" -> {
            "https://iili.io/K6UunI.png"
        }
        "delcatty" -> {
            "https://iili.io/KIStWb.png"
        }
        "buneary" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lopunny" -> {
            "https://iili.io/K6UunI.png"
        }
        "cottonee" -> {
            "https://iili.io/K6UunI.png"
        }
        "whimsicott" -> {
            "https://iili.io/KIStWb.png"
        }
        "petilit" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lilligant" -> {
            "https://iili.io/K6UunI.png"
        }
        "munna" -> {
            "https://iili.io/K6UunI.png"
        }
        "musharna" -> {
            "https://iili.io/KIStWb.png"
        }
        "cleffa" -> {
            "https://iili.io/K6UvtV.png"
        }
        "clefairy" -> {
            "https://iili.io/K6UunI.png"
        }
        "clefable" -> {
            "https://iili.io/K6UunI.png"
        }
        "eevee" -> {
            "https://iili.io/KIStWb.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/K6UunI.png"
        }
        "espeon" -> {
            "https://iili.io/KIStWb.png"
        }
        "umbreon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "leafeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "glaceon" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandile" -> {
            "https://iili.io/KIStWb.png"
        }
        "krokorok" -> {
            "https://iili.io/K6UvtV.png"
        }
        "krookodile" -> {
            "https://iili.io/K6UunI.png"
        }
        "darumaka" -> {
            "https://iili.io/K6UunI.png"
        }
        "darmanitan" -> {
            "https://iili.io/KIStWb.png"
        }
        "basculin" -> {
            "https://iili.io/K6UvtV.png"
        }
        "trubbish" -> {
            "https://iili.io/K6UunI.png"
        }
        "garbodor" -> {
            "https://iili.io/K6UunI.png"
        }
        "minccino" -> {
            "https://iili.io/KIStWb.png"
        }
        "cinccino" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rufflet" -> {
            "https://iili.io/K6UunI.png"
        }
        "braviary" -> {
            "https://iili.io/K6UunI.png"
        }
        "vullaby" -> {
            "https://iili.io/KIStWb.png"
        }
        "mandibuzz" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sandshrew" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandslash" -> {
            "https://iili.io/K6UunI.png"
        }
        "dwebble" -> {
            "https://iili.io/KIStWb.png"
        }
        "crustle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "scraggy" -> {
            "https://iili.io/K6UunI.png"
        }
        "scrafty" -> {
            "https://iili.io/K6UunI.png"
        }
        "maractus" -> {
            "https://iili.io/KIStWb.png"
        }
        "sigilyph" -> {
            "https://iili.io/K6UvtV.png"
        }
        "trapinch" -> {
            "https://iili.io/K6UunI.png"
        }
        "vibrava" -> {
            "https://iili.io/K6UunI.png"
        }
        "flygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "yamask" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cofagrigus" -> {
            "https://iili.io/K6UunI.png"
        }
        "tirtouga" -> {
            "https://iili.io/K6UunI.png"
        }
        "carracosta" -> {
            "https://iili.io/KIStWb.png"
        }
        "archen" -> {
            "https://iili.io/K6UvtV.png"
        }
        "archeops" -> {
            "https://iili.io/K6UunI.png"
        }
        "klink" -> {
            "https://iili.io/K6UunI.png"
        }
        "klang" -> {
            "https://iili.io/KIStWb.png"
        }
        "klinklang" -> {
            "https://iili.io/K6UvtV.png"
        }
        "budew" -> {
            "https://iili.io/K6UunI.png"
        }
        "roselia" -> {
            "https://iili.io/K6UunI.png"
        }
        "roserade" -> {
            "https://iili.io/KIStWb.png"
        }
        "gothita" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gothorita" -> {
            "https://iili.io/K6UunI.png"
        }
        "gothitelle" -> {
            "https://iili.io/K6UunI.png"
        }
        "solosis" -> {
            "https://iili.io/KIStWb.png"
        }
        "duosion" -> {
            "https://iili.io/K6UvtV.png"
        }
        "reuniclus" -> {
            "https://iili.io/K6UunI.png"
        }
        "combee" -> {
            "https://iili.io/K6UunI.png"
        }
        "vespiquen" -> {
            "https://iili.io/KIStWb.png"
        }
        "emolga" -> {
            "https://iili.io/K6UvtV.png"
        }
        "heracross" -> {
            "https://iili.io/K6UunI.png"
        }
        "pinsir" -> {
            "https://iili.io/K6UunI.png"
        }
        "blitzle" -> {
            "https://iili.io/KIStWb.png"
        }
        "zebstrika" -> {
            "https://iili.io/K6UvtV.png"
        }
        "buizel" -> {
            "https://iili.io/K6UunI.png"
        }
        "floatzel" -> {
            "https://iili.io/K6UunI.png"
        }
        "zorua" -> {
            "https://iili.io/K6UunI.png"
        }
        "zoroark" -> {
            "https://iili.io/K6UunI.png"
        }
        "ducklett" -> {
            "https://iili.io/KIStWb.png"
        }
        "swanna" -> {
            "https://iili.io/K6UvtV.png"
        }
        "karrablast" -> {
            "https://iili.io/K6UunI.png"
        }
        "escavalier" -> {
            "https://iili.io/K6UunI.png"
        }
        "shelmet" -> {
            "https://iili.io/K6UunI.png"
        }
        "accelgor" -> {
            "https://iili.io/K6UunI.png"
        }
        "deerling" -> {
            "https://iili.io/KIStWb.png"
        }
        "sawsbuck" -> {
            "https://iili.io/K6UvtV.png"
        }
        "foongus" -> {
            "https://iili.io/K6UunI.png"
        }
        "amoonguss" -> {
            "https://iili.io/K6UunI.png"
        }
        "castform" -> {
            "https://iili.io/K6UunI.png"
        }
        "nosepass" -> {
            "https://iili.io/K6UunI.png"
        }
        "probopass" -> {
            "https://iili.io/KIStWb.png"
        }
        "aron" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lairon" -> {
            "https://iili.io/K6UunI.png"
        }
        "aggron" -> {
            "https://iili.io/K6UunI.png"
        }
        "baltoy" -> {
            "https://iili.io/K6UunI.png"
        }
        "claydol" -> {
            "https://iili.io/K6UunI.png"
        }
        "larvesta" -> {
            "https://iili.io/KIStWb.png"
        }
        "volcarona" -> {
            "https://iili.io/K6UvtV.png"
        }
        "joltik" -> {
            "https://iili.io/K6UunI.png"
        }
        "galvantula" -> {
            "https://iili.io/K6UunI.png"
        }
        "ferroseed" -> {
            "https://iili.io/K6UunI.png"
        }
        "ferrothorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "tynamo" -> {
            "https://iili.io/KIStWb.png"
        }
        "eelektrik" -> {
            "https://iili.io/K6UvtV.png"
        }
        "eelektross" -> {
            "https://iili.io/K6UunI.png"
        }
        "frillish" -> {
            "https://iili.io/K6UunI.png"
        }
        "jellicent" -> {
            "https://iili.io/K6UunI.png"
        }
        "alomomola" -> {
            "https://iili.io/K6UunI.png"
        }
        "axew" -> {
            "https://iili.io/KIStWb.png"
        }
        "fraxure" -> {
            "https://iili.io/K6UvtV.png"
        }
        "haxorus" -> {
            "https://iili.io/K6UunI.png"
        }
        "zangoose" -> {
            "https://iili.io/K6UunI.png"
        }
        "seviper" -> {
            "https://iili.io/K6UunI.png"
        }
        "elgyem" -> {
            "https://iili.io/K6UunI.png"
        }
        "beheeyem" -> {
            "https://iili.io/KIStWb.png"
        }
        "litwick" -> {
            "https://iili.io/K6UvtV.png"
        }
        "lampent" -> {
            "https://iili.io/K6UunI.png"
        }
        "chandelure" -> {
            "https://iili.io/K6UunI.png"
        }
        "heatmore" -> {
            "https://iili.io/K6UunI.png"
        }
        "durant" -> {
            "https://iili.io/K6UunI.png"
        }
        "cubchoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "beartic" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cryogonal" -> {
            "https://iili.io/K6UunI.png"
        }
        "tornadus" -> {
            "https://iili.io/K6UunI.png"
        }
        "thundurus" -> {
            "https://iili.io/K6UunI.png"
        }
        "landorus" -> {
            "https://iili.io/K6UunI.png"
        }
        "skorupi" -> {
            "https://iili.io/KIStWb.png"
        }
        "drapion" -> {
            "https://iili.io/K6UunI.png"
        }
        "skarmory" -> {
            "https://iili.io/KIStWb.png"
        }
        "numel" -> {
            "https://iili.io/K6UunI.png"
        }
        "camerupt" -> {
            "https://iili.io/KIStWb.png"
        }
        "spoink" -> {
            "https://iili.io/K6UunI.png"
        }
        "grumpig" -> {
            "https://iili.io/KIStWb.png"
        }
        "drifloon" -> {
            "https://iili.io/K6UunI.png"
        }
        "drifblim" -> {
            "https://iili.io/KIStWb.png"
        }
        "shuppet" -> {
            "https://iili.io/KIStWb.png"
        }
        "banette" -> {
            "https://iili.io/K6UunI.png"
        }
        "wingull" -> {
            "https://iili.io/KIStWb.png"
        }
        "pelipper" -> {
            "https://iili.io/KIStWb.png"
        }
        "lunatone" -> {
            "https://iili.io/K6UunI.png"
        }
        "solrock" -> {
            "https://iili.io/KIStWb.png"
        }
        "absol" -> {
            "https://iili.io/KIStWb.png"
        }
        "tangela" -> {
            "https://iili.io/K6UunI.png"
        }
        "tangrowth" -> {
            "https://iili.io/KIStWb.png"
        }
        "mienfoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "mienshao" -> {
            "https://iili.io/K6UunI.png"
        }
        "gligar" -> {
            "https://iili.io/KIStWb.png"
        }
        "gliscor" -> {
            "https://iili.io/KIStWb.png"
        }
        "pawniard" -> {
            "https://iili.io/K6UunI.png"
        }
        "bisharp" -> {
            "https://iili.io/KIStWb.png"
        }
        "cobalion" -> {
            "https://iili.io/KIStWb.png"
        }
        "terrakion" -> {
            "https://iili.io/K6UunI.png"
        }
        "virizion" -> {
            "https://iili.io/KIStWb.png"
        }
        "tympole" -> {
            "https://iili.io/KIStWb.png"
        }
        "palpitoad" -> {
            "https://iili.io/K6UunI.png"
        }
        "seismitoad" -> {
            "https://iili.io/KIStWb.png"
        }
        "stunfisk" -> {
            "https://iili.io/KIStWb.png"
        }
        "shuckle" -> {
            "https://iili.io/K6UunI.png"
        }
        "mantyke" -> {
            "https://iili.io/KIStWb.png"
        }
        "mantine" -> {
            "https://iili.io/KIStWb.png"
        }
        "remoraid" -> {
            "https://iili.io/K6UunI.png"
        }
        "octillery" -> {
            "https://iili.io/KIStWb.png"
        }
        "corsola" -> {
            "https://iili.io/KIStWb.png"
        }
        "staryu" -> {
            "https://iili.io/K6UunI.png"
        }
        "starmie" -> {
            "https://iili.io/KIStWb.png"
        }
        "wailmer" -> {
            "https://iili.io/KIStWb.png"
        }
        "wailord" -> {
            "https://iili.io/K6UunI.png"
        }
        "lapras" -> {
            "https://iili.io/KIStWb.png"
        }
        "spheal" -> {
            "https://iili.io/KIStWb.png"
        }
        "sealeo" -> {
            "https://iili.io/K6UunI.png"
        }
        "walrein" -> {
            "https://iili.io/KIStWb.png"
        }
        "swablu" -> {
            "https://iili.io/KIStWb.png"
        }
        "altaria" -> {
            "https://iili.io/K6UunI.png"
        }
        "vulpix" -> {
            "https://iili.io/KIStWb.png"
        }
        "ninetales" -> {
            "https://iili.io/KIStWb.png"
        }
        "bronzor" -> {
            "https://iili.io/K6UunI.png"
        }
        "bronzong" -> {
            "https://iili.io/KIStWb.png"
        }
        "sneasel" -> {
            "https://iili.io/KIStWb.png"
        }
        "weavile" -> {
            "https://iili.io/K6UunI.png"
        }
        "delibird" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanillite" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanillish" -> {
            "https://iili.io/K6UunI.png"
        }
        "vanilluxe" -> {
            "https://iili.io/KIStWb.png"
        }
        "swinub" -> {
            "https://iili.io/KIStWb.png"
        }
        "piloswine" -> {
            "https://iili.io/K6UunI.png"
        }
        "mamoswine" -> {
            "https://iili.io/KIStWb.png"
        }
        "ditto" -> {
            "https://iili.io/KIStWb.png"
        }
        "beldum" -> {
            "https://iili.io/K6UunI.png"
        }
        "metang" -> {
            "https://iili.io/KIStWb.png"
        }
        "metagross" -> {
            "https://iili.io/KIStWb.png"
        }
        "seel" -> {
            "https://iili.io/K6UunI.png"
        }
        "dewgong" -> {
            "https://iili.io/KIStWb.png"
        }
        "throh" -> {
            "https://iili.io/KIStWb.png"
        }
        "sawk" -> {
            "https://iili.io/K6UunI.png"
        }
        "bouffalant" -> {
            "https://iili.io/KIStWb.png"
        }
        "druddigon" -> {
            "https://iili.io/KIStWb.png"
        }
        "golett" -> {
            "https://iili.io/K6UunI.png"
        }
        "golurk" -> {
            "https://iili.io/KIStWb.png"
        }
        "deino" -> {
            "https://iili.io/KIStWb.png"
        }
        "zweilous" -> {
            "https://iili.io/K6UunI.png"
        }
        "hydreigon" -> {
            "https://iili.io/KIStWb.png"
        }
        "slakoth" -> {
            "https://iili.io/KIStWb.png"
        }
        "vigoroth" -> {
            "https://iili.io/K6UunI.png"
        }
        "slaking" -> {
            "https://iili.io/KIStWb.png"
        }
        "corphish" -> {
            "https://iili.io/KIStWb.png"
        }
        "crawdaunt" -> {
            "https://iili.io/K6UunI.png"
        }
        "igglybuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "jigglypuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "wigglytuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "lickitung" -> {
            "https://iili.io/KIStWb.png"
        }
        "lickilicky" -> {
            "https://iili.io/KIStWb.png"
        }
        "yanma" -> {
            "https://iili.io/K6UunI.png"
        }
        "yanmega" -> {
            "https://iili.io/KIStWb.png"
        }
        "tropius" -> {
            "https://iili.io/KIStWb.png"
        }
        "carnivine" -> {
            "https://iili.io/K6UunI.png"
        }
        "croagunk" -> {
            "https://iili.io/KIStWb.png"
        }
        "toxicroak" -> {
            "https://iili.io/KIStWb.png"
        }
        "larvitar" -> {
            "https://iili.io/K6UunI.png"
        }
        "pupitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyranitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "reshiram" -> {
            "https://iili.io/K6UunI.png"
        }
        "zekrom" -> {
            "https://iili.io/KIStWb.png"
        }
        "kyurem" -> {
            "https://iili.io/KIStWb.png"
        }
        "keldeo" -> {
            "https://iili.io/K6UunI.png"
        }
        "meloetta" -> {
            "https://iili.io/KIStWb.png"
        }
        "genesect" -> {
            "https://iili.io/KIStWb.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesKalos(pokemonName: String): String {
    return when (pokemonName) {
        "chespin" -> {
            "https://iili.io/KIStWb.png"
        }
        "quilladin" -> {
            "https://iili.io/K6UvtV.png"
        }
        "chesnaught" -> {
            "https://iili.io/K6UunI.png"
        }
        "fennekin" -> {
            "https://iili.io/KIStWb.png"
        }
        "braixen" -> {
            "https://iili.io/K6UvtV.png"
        }
        "delphox" -> {
            "https://iili.io/K6UunI.png"
        }
        "froakie" -> {
            "https://iili.io/K6UunI.png"
        }
        "frogadier" -> {
            "https://iili.io/KIStWb.png"
        }
        "greninja" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bunnelby" -> {
            "https://iili.io/K6UunI.png"
        }
        "diggersby" -> {
            "https://iili.io/K6UunI.png"
        }
        "zigzagoon" -> {
            "https://iili.io/KIStWb.png"
        }
        "linoone" -> {
            "https://iili.io/K6UvtV.png"
        }
        "fletchling" -> {
            "https://iili.io/K6UunI.png"
        }
        "fletchinder" -> {
            "https://iili.io/K6UunI.png"
        }
        "talonflame" -> {
            "https://iili.io/KIStWb.png"
        }
        "pidgey" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pidgeotto" -> {
            "https://iili.io/K6UunI.png"
        }
        "pidgeot" -> {
            "https://iili.io/K6UunI.png"
        }
        "scatterbug" -> {
            "https://iili.io/KIStWb.png"
        }
        "spewpa" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vivillon" -> {
            "https://iili.io/K6UunI.png"
        }
        "caterpie" -> {
            "https://iili.io/K6UunI.png"
        }
        "metapod" -> {
            "https://iili.io/KIStWb.png"
        }
        "butterfree" -> {
            "https://iili.io/K6UvtV.png"
        }
        "weedle" -> {
            "https://iili.io/K6UunI.png"
        }
        "kakuna" -> {
            "https://iili.io/K6UunI.png"
        }
        "beedrill" -> {
            "https://iili.io/KIStWb.png"
        }
        "pansage" -> {
            "https://iili.io/K6UvtV.png"
        }
        "simisage" -> {
            "https://iili.io/K6UunI.png"
        }
        "pansear" -> {
            "https://iili.io/K6UunI.png"
        }
        "simisear" -> {
            "https://iili.io/KIStWb.png"
        }
        "panpour" -> {
            "https://iili.io/K6UvtV.png"
        }
        "simipour" -> {
            "https://iili.io/K6UunI.png"
        }
        "pichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "pikachu" -> {
            "https://iili.io/KIStWb.png"
        }
        "raichu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bidoof" -> {
            "https://iili.io/K6UunI.png"
        }
        "bibarel" -> {
            "https://iili.io/K6UunI.png"
        }
        "dunsparce" -> {
            "https://iili.io/KIStWb.png"
        }
        "azurill" -> {
            "https://iili.io/K6UvtV.png"
        }
        "marill" -> {
            "https://iili.io/K6UunI.png"
        }
        "azumarill" -> {
            "https://iili.io/K6UunI.png"
        }
        "burmy" -> {
            "https://iili.io/KIStWb.png"
        }
        "wormadam" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mothim" -> {
            "https://iili.io/K6UunI.png"
        }
        "surskit" -> {
            "https://iili.io/K6UunI.png"
        }
        "masquerain" -> {
            "https://iili.io/KIStWb.png"
        }
        "magikarp" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UunI.png"
        }
        "corpish" -> {
            "https://iili.io/K6UunI.png"
        }
        "crawdaunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UvtV.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "carvanha" -> {
            "https://iili.io/K6UunI.png"
        }
        "sharpedo" -> {
            "https://iili.io/KIStWb.png"
        }
        "litleo" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pyroar" -> {
            "https://iili.io/K6UunI.png"
        }
        "psyduck" -> {
            "https://iili.io/K6UunI.png"
        }
        "golduck" -> {
            "https://iili.io/KIStWb.png"
        }
        "farfetchd" -> {
            "https://iili.io/K6UvtV.png"
        }
        "riolu" -> {
            "https://iili.io/K6UunI.png"
        }
        "lucario" -> {
            "https://iili.io/K6UunI.png"
        }
        "ralts" -> {
            "https://iili.io/KIStWb.png"
        }
        "kirlia" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gardevoir" -> {
            "https://iili.io/K6UunI.png"
        }
        "gallade" -> {
            "https://iili.io/K6UunI.png"
        }
        "flabebe" -> {
            "https://iili.io/KIStWb.png"
        }
        "floette" -> {
            "https://iili.io/K6UvtV.png"
        }
        "florges" -> {
            "https://iili.io/K6UunI.png"
        }
        "budew" -> {
            "https://iili.io/K6UunI.png"
        }
        "roselia" -> {
            "https://iili.io/KIStWb.png"
        }
        "roserade" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ledyba" -> {
            "https://iili.io/K6UunI.png"
        }
        "ledian" -> {
            "https://iili.io/K6UunI.png"
        }
        "combee" -> {
            "https://iili.io/KIStWb.png"
        }
        "vespiquen" -> {
            "https://iili.io/K6UvtV.png"
        }
        "skitty" -> {
            "https://iili.io/K6UunI.png"
        }
        "delcatty" -> {
            "https://iili.io/KIStWb.png"
        }
        "bulbasaur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ivysaur" -> {
            "https://iili.io/K6UunI.png"
        }
        "venusaur" -> {
            "https://iili.io/K6UunI.png"
        }
        "charmander" -> {
            "https://iili.io/KIStWb.png"
        }
        "charmeleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "charizard" -> {
            "https://iili.io/K6UunI.png"
        }
        "squirtle" -> {
            "https://iili.io/K6UunI.png"
        }
        "wartortle" -> {
            "https://iili.io/KIStWb.png"
        }
        "blastoise" -> {
            "https://iili.io/K6UvtV.png"
        }
        "skiddo" -> {
            "https://iili.io/K6UunI.png"
        }
        "gogoat" -> {
            "https://iili.io/K6UunI.png"
        }
        "pancham" -> {
            "https://iili.io/KIStWb.png"
        }
        "pangoro" -> {
            "https://iili.io/K6UvtV.png"
        }
        "furfrou" -> {
            "https://iili.io/K6UunI.png"
        }
        "doduo" -> {
            "https://iili.io/K6UunI.png"
        }
        "dodrio" -> {
            "https://iili.io/KIStWb.png"
        }
        "plusle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "minum" -> {
            "https://iili.io/K6UunI.png"
        }
        "gulpin" -> {
            "https://iili.io/K6UunI.png"
        }
        "swalot" -> {
            "https://iili.io/KIStWb.png"
        }
        "scraggy" -> {
            "https://iili.io/K6UvtV.png"
        }
        "scrafty" -> {
            "https://iili.io/K6UunI.png"
        }
        "abra" -> {
            "https://iili.io/K6UunI.png"
        }
        "kadabra" -> {
            "https://iili.io/KIStWb.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UvtV.png"
        }
        "oddish" -> {
            "https://iili.io/K6UunI.png"
        }
        "gloom" -> {
            "https://iili.io/K6UunI.png"
        }
        "vileplume" -> {
            "https://iili.io/KIStWb.png"
        }
        "bellossom" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sentret" -> {
            "https://iili.io/K6UunI.png"
        }
        "furret" -> {
            "https://iili.io/K6UunI.png"
        }
        "nincada" -> {
            "https://iili.io/KIStWb.png"
        }
        "ninjask" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shedinja" -> {
            "https://iili.io/K6UunI.png"
        }
        "espurr" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowstic" -> {
            "https://iili.io/KIStWb.png"
        }
        "kecleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "honedge" -> {
            "https://iili.io/K6UunI.png"
        }
        "doublade" -> {
            "https://iili.io/K6UunI.png"
        }
        "aegislash" -> {
            "https://iili.io/KIStWb.png"
        }
        "venipede" -> {
            "https://iili.io/K6UvtV.png"
        }
        "whirlipede" -> {
            "https://iili.io/K6UunI.png"
        }
        "scolipede" -> {
            "https://iili.io/K6UunI.png"
        }
        "audino" -> {
            "https://iili.io/KIStWb.png"
        }
        "smeargle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "croagunk" -> {
            "https://iili.io/K6UunI.png"
        }
        "toxicroak" -> {
            "https://iili.io/K6UunI.png"
        }
        "ducklett" -> {
            "https://iili.io/KIStWb.png"
        }
        "swanna" -> {
            "https://iili.io/K6UvtV.png"
        }
        "spritzee" -> {
            "https://iili.io/K6UunI.png"
        }
        "armoatisse" -> {
            "https://iili.io/K6UunI.png"
        }
        "swirlix" -> {
            "https://iili.io/KIStWb.png"
        }
        "slurpuff" -> {
            "https://iili.io/K6UvtV.png"
        }
        "volbeat" -> {
            "https://iili.io/K6UunI.png"
        }
        "illumise" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoppip" -> {
            "https://iili.io/KIStWb.png"
        }
        "skiploom" -> {
            "https://iili.io/K6UvtV.png"
        }
        "jumpluff" -> {
            "https://iili.io/K6UunI.png"
        }
        "munchlax" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorlax" -> {
            "https://iili.io/KIStWb.png"
        }
        "whismur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "loudred" -> {
            "https://iili.io/K6UunI.png"
        }
        "exploud" -> {
            "https://iili.io/K6UunI.png"
        }
        "meditite" -> {
            "https://iili.io/KIStWb.png"
        }
        "medicham" -> {
            "https://iili.io/K6UvtV.png"
        }
        "zubat" -> {
            "https://iili.io/K6UunI.png"
        }
        "golbat" -> {
            "https://iili.io/K6UunI.png"
        }
        "crobat" -> {
            "https://iili.io/KIStWb.png"
        }
        "axew" -> {
            "https://iili.io/K6UvtV.png"
        }
        "fraxure" -> {
            "https://iili.io/K6UunI.png"
        }
        "haxorus" -> {
            "https://iili.io/K6UunI.png"
        }
        "diancie" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoopa" -> {
            "https://iili.io/K6UunI.png"
        }
        "volcanion" -> {
            "https://iili.io/KIStWb.png"
        }
        "drifloon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "drifblim" -> {
            "https://iili.io/K6UunI.png"
        }
        "mienfoo" -> {
            "https://iili.io/K6UunI.png"
        }
        "mienshao" -> {
            "https://iili.io/K6UunI.png"
        }
        "zangoose" -> {
            "https://iili.io/K6UunI.png"
        }
        "seviper" -> {
            "https://iili.io/KIStWb.png"
        }
        "spoink" -> {
            "https://iili.io/K6UvtV.png"
        }
        "grumpig" -> {
            "https://iili.io/K6UunI.png"
        }
        "absol" -> {
            "https://iili.io/K6UunI.png"
        }
        "inkay" -> {
            "https://iili.io/K6UunI.png"
        }
        "malamar" -> {
            "https://iili.io/K6UunI.png"
        }
        "lunatone" -> {
            "https://iili.io/KIStWb.png"
        }
        "solrock" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bagon" -> {
            "https://iili.io/K6UunI.png"
        }
        "shelgon" -> {
            "https://iili.io/K6UunI.png"
        }
        "salamance" -> {
            "https://iili.io/K6UunI.png"
        }
        "wingull" -> {
            "https://iili.io/K6UunI.png"
        }
        "pelipper" -> {
            "https://iili.io/KIStWb.png"
        }
        "taillow" -> {
            "https://iili.io/K6UvtV.png"
        }
        "swellow" -> {
            "https://iili.io/K6UunI.png"
        }
        "binacle" -> {
            "https://iili.io/K6UunI.png"
        }
        "barbaracle" -> {
            "https://iili.io/K6UunI.png"
        }
        "dwebble" -> {
            "https://iili.io/K6UunI.png"
        }
        "crustle" -> {
            "https://iili.io/KIStWb.png"
        }
        "tentacool" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UunI.png"
        }
        "wailmer" -> {
            "https://iili.io/K6UunI.png"
        }
        "wailord" -> {
            "https://iili.io/K6UunI.png"
        }
        "luvdisc" -> {
            "https://iili.io/K6UunI.png"
        }
        "skrelp" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragalge" -> {
            "https://iili.io/K6UvtV.png"
        }
        "clauncher" -> {
            "https://iili.io/K6UunI.png"
        }
        "clawitzer" -> {
            "https://iili.io/K6UunI.png"
        }
        "staryu" -> {
            "https://iili.io/K6UunI.png"
        }
        "starmie" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellder" -> {
            "https://iili.io/KIStWb.png"
        }
        "cloyster" -> {
            "https://iili.io/K6UvtV.png"
        }
        "qwilfish" -> {
            "https://iili.io/K6UunI.png"
        }
        "horsea" -> {
            "https://iili.io/K6UunI.png"
        }
        "seadra" -> {
            "https://iili.io/K6UunI.png"
        }
        "kingdra" -> {
            "https://iili.io/K6UunI.png"
        }
        "relicanth" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandile" -> {
            "https://iili.io/K6UvtV.png"
        }
        "krokorok" -> {
            "https://iili.io/K6UunI.png"
        }
        "krookodile" -> {
            "https://iili.io/K6UunI.png"
        }
        "helioptile" -> {
            "https://iili.io/K6UunI.png"
        }
        "heliolisk" -> {
            "https://iili.io/K6UunI.png"
        }
        "hippopotas" -> {
            "https://iili.io/KIStWb.png"
        }
        "hippowdon" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyhorn" -> {
            "https://iili.io/KIStWb.png"
        }
        "rhydon" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyperior" -> {
            "https://iili.io/KIStWb.png"
        }
        "onix" -> {
            "https://iili.io/K6UunI.png"
        }
        "steelix" -> {
            "https://iili.io/KIStWb.png"
        }
        "woobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "swoobat" -> {
            "https://iili.io/KIStWb.png"
        }
        "machop" -> {
            "https://iili.io/KIStWb.png"
        }
        "machoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "machamp" -> {
            "https://iili.io/KIStWb.png"
        }
        "cubone" -> {
            "https://iili.io/KIStWb.png"
        }
        "marowak" -> {
            "https://iili.io/K6UunI.png"
        }
        "kangaskhan" -> {
            "https://iili.io/KIStWb.png"
        }
        "mawile" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyrunt" -> {
            "https://iili.io/K6UunI.png"
        }
        "tyrantrum" -> {
            "https://iili.io/KIStWb.png"
        }
        "amaura" -> {
            "https://iili.io/KIStWb.png"
        }
        "aurorus" -> {
            "https://iili.io/K6UunI.png"
        }
        "aerodactyl" -> {
            "https://iili.io/KIStWb.png"
        }
        "ferroseed" -> {
            "https://iili.io/KIStWb.png"
        }
        "ferrothorn" -> {
            "https://iili.io/K6UunI.png"
        }
        "snubbull" -> {
            "https://iili.io/KIStWb.png"
        }
        "granbull" -> {
            "https://iili.io/KIStWb.png"
        }
        "electrike" -> {
            "https://iili.io/K6UunI.png"
        }
        "manectric" -> {
            "https://iili.io/KIStWb.png"
        }
        "houndour" -> {
            "https://iili.io/KIStWb.png"
        }
        "houndoom" -> {
            "https://iili.io/K6UunI.png"
        }
        "eevee" -> {
            "https://iili.io/KIStWb.png"
        }
        "vaporeon" -> {
            "https://iili.io/KIStWb.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/KIStWb.png"
        }
        "espeon" -> {
            "https://iili.io/KIStWb.png"
        }
        "umbreon" -> {
            "https://iili.io/K6UunI.png"
        }
        "lafeon" -> {
            "https://iili.io/KIStWb.png"
        }
        "glaceon" -> {
            "https://iili.io/KIStWb.png"
        }
        "sylveon" -> {
            "https://iili.io/K6UunI.png"
        }
        "emolga" -> {
            "https://iili.io/KIStWb.png"
        }
        "yanma" -> {
            "https://iili.io/KIStWb.png"
        }
        "yanmega" -> {
            "https://iili.io/K6UunI.png"
        }
        "hawlucha" -> {
            "https://iili.io/KIStWb.png"
        }
        "sigilyph" -> {
            "https://iili.io/KIStWb.png"
        }
        "golett" -> {
            "https://iili.io/K6UunI.png"
        }
        "golurk" -> {
            "https://iili.io/KIStWb.png"
        }
        "nosepass" -> {
            "https://iili.io/KIStWb.png"
        }
        "probopass" -> {
            "https://iili.io/K6UunI.png"
        }
        "makuhita" -> {
            "https://iili.io/KIStWb.png"
        }
        "hariyama" -> {
            "https://iili.io/KIStWb.png"
        }
        "throh" -> {
            "https://iili.io/K6UunI.png"
        }
        "sawk" -> {
            "https://iili.io/KIStWb.png"
        }
        "starly" -> {
            "https://iili.io/KIStWb.png"
        }
        "staravia" -> {
            "https://iili.io/K6UunI.png"
        }
        "staraptor" -> {
            "https://iili.io/KIStWb.png"
        }
        "stunky" -> {
            "https://iili.io/KIStWb.png"
        }
        "skuntank" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoran-f" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidorina" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidoqueen" -> {
            "https://iili.io/K6UunI.png"
        }
        "nidoran-m" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidorino" -> {
            "https://iili.io/KIStWb.png"
        }
        "nidoking" -> {
            "https://iili.io/K6UunI.png"
        }
        "dedenne" -> {
            "https://iili.io/KIStWb.png"
        }
        "chingling" -> {
            "https://iili.io/KIStWb.png"
        }
        "chimecho" -> {
            "https://iili.io/K6UunI.png"
        }
        "mime-jr" -> {
            "https://iili.io/KIStWb.png"
        }
        "mr-mime" -> {
            "https://iili.io/KIStWb.png"
        }
        "solosis" -> {
            "https://iili.io/K6UunI.png"
        }
        "duosion" -> {
            "https://iili.io/KIStWb.png"
        }
        "reuniclus" -> {
            "https://iili.io/KIStWb.png"
        }
        "wynaut" -> {
            "https://iili.io/K6UunI.png"
        }
        "wobbuffet" -> {
            "https://iili.io/KIStWb.png"
        }
        "roggenrola" -> {
            "https://iili.io/KIStWb.png"
        }
        "boldore" -> {
            "https://iili.io/K6UunI.png"
        }
        "gigalith" -> {
            "https://iili.io/KIStWb.png"
        }
        "sableye" -> {
            "https://iili.io/KIStWb.png"
        }
        "carbink" -> {
            "https://iili.io/K6UunI.png"
        }
        "tauros" -> {
            "https://iili.io/KIStWb.png"
        }
        "miltank" -> {
            "https://iili.io/KIStWb.png"
        }
        "mareep" -> {
            "https://iili.io/K6UunI.png"
        }
        "flaaffy" -> {
            "https://iili.io/KIStWb.png"
        }
        "ampharos" -> {
            "https://iili.io/KIStWb.png"
        }
        "pinsir" -> {
            "https://iili.io/K6UunI.png"
        }
        "heracross" -> {
            "https://iili.io/KIStWb.png"
        }
        "pachirisu" -> {
            "https://iili.io/KIStWb.png"
        }
        "slowpoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "slowbro" -> {
            "https://iili.io/KIStWb.png"
        }
        "slowking" -> {
            "https://iili.io/KIStWb.png"
        }
        "exeggcute" -> {
            "https://iili.io/K6UunI.png"
        }
        "exeggutor" -> {
            "https://iili.io/KIStWb.png"
        }
        "chatot" -> {
            "https://iili.io/KIStWb.png"
        }
        "mantyke" -> {
            "https://iili.io/K6UunI.png"
        }
        "mantine" -> {
            "https://iili.io/KIStWb.png"
        }
        "clamperl" -> {
            "https://iili.io/KIStWb.png"
        }
        "huntail" -> {
            "https://iili.io/K6UunI.png"
        }
        "gorebyss" -> {
            "https://iili.io/KIStWb.png"
        }
        "remoraid" -> {
            "https://iili.io/KIStWb.png"
        }
        "octillery" -> {
            "https://iili.io/K6UunI.png"
        }
        "corsola" -> {
            "https://iili.io/KIStWb.png"
        }
        "chinchou" -> {
            "https://iili.io/KIStWb.png"
        }
        "lanturn" -> {
            "https://iili.io/K6UunI.png"
        }
        "alomomola" -> {
            "https://iili.io/KIStWb.png"
        }
        "lapras" -> {
            "https://iili.io/KIStWb.png"
        }
        "articuno" -> {
            "https://iili.io/K6UunI.png"
        }
        "zapdos" -> {
            "https://iili.io/KIStWb.png"
        }
        "moltres" -> {
            "https://iili.io/KIStWb.png"
        }
        "diglett" -> {
            "https://iili.io/K6UunI.png"
        }
        "dugtrio" -> {
            "https://iili.io/KIStWb.png"
        }
        "trapinch" -> {
            "https://iili.io/KIStWb.png"
        }
        "vibrava" -> {
            "https://iili.io/K6UunI.png"
        }
        "flygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "gible" -> {
            "https://iili.io/KIStWb.png"
        }
        "gabite" -> {
            "https://iili.io/K6UunI.png"
        }
        "garchomp" -> {
            "https://iili.io/KIStWb.png"
        }
        "geodude" -> {
            "https://iili.io/KIStWb.png"
        }
        "graveler" -> {
            "https://iili.io/K6UunI.png"
        }
        "golem" -> {
            "https://iili.io/KIStWb.png"
        }
        "slugma" -> {
            "https://iili.io/KIStWb.png"
        }
        "magcargo" -> {
            "https://iili.io/K6UunI.png"
        }
        "shuckle" -> {
            "https://iili.io/KIStWb.png"
        }
        "skorupi" -> {
            "https://iili.io/KIStWb.png"
        }
        "drapion" -> {
            "https://iili.io/K6UunI.png"
        }
        "wooper" -> {
            "https://iili.io/KIStWb.png"
        }
        "quagsire" -> {
            "https://iili.io/KIStWb.png"
        }
        "goomy" -> {
            "https://iili.io/K6UunI.png"
        }
        "sliggoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "goodra" -> {
            "https://iili.io/KIStWb.png"
        }
        "karrablast" -> {
            "https://iili.io/K6UunI.png"
        }
        "escavalier" -> {
            "https://iili.io/KIStWb.png"
        }
        "shelmet" -> {
            "https://iili.io/KIStWb.png"
        }
        "accelgor" -> {
            "https://iili.io/K6UunI.png"
        }
        "bellsprout" -> {
            "https://iili.io/KIStWb.png"
        }
        "weepinbell" -> {
            "https://iili.io/KIStWb.png"
        }
        "victreebel" -> {
            "https://iili.io/K6UunI.png"
        }
        "carnivine" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastly" -> {
            "https://iili.io/KIStWb.png"
        }
        "haunter" -> {
            "https://iili.io/K6UunI.png"
        }
        "gengar" -> {
            "https://iili.io/KIStWb.png"
        }
        "poliwag" -> {
            "https://iili.io/KIStWb.png"
        }
        "poliwhirl" -> {
            "https://iili.io/K6UunI.png"
        }
        "poliwrath" -> {
            "https://iili.io/KIStWb.png"
        }
        "politoed" -> {
            "https://iili.io/KIStWb.png"
        }
        "ekans" -> {
            "https://iili.io/K6UunI.png"
        }
        "arbok" -> {
            "https://iili.io/KIStWb.png"
        }
        "stunfisk" -> {
            "https://iili.io/KIStWb.png"
        }
        "barboach" -> {
            "https://iili.io/K6UunI.png"
        }
        "whiscash" -> {
            "https://iili.io/KIStWb.png"
        }
        "purrloin" -> {
            "https://iili.io/KIStWb.png"
        }
        "liepard" -> {
            "https://iili.io/K6UunI.png"
        }
        "poochyena" -> {
            "https://iili.io/KIStWb.png"
        }
        "mightyena" -> {
            "https://iili.io/KIStWb.png"
        }
        "patrat" -> {
            "https://iili.io/K6UunI.png"
        }
        "watchog" -> {
            "https://iili.io/KIStWb.png"
        }
        "pawniard" -> {
            "https://iili.io/KIStWb.png"
        }
        "bisharp" -> {
            "https://iili.io/K6UunI.png"
        }
        "klefki" -> {
            "https://iili.io/KIStWb.png"
        }
        "murkrow" -> {
            "https://iili.io/KIStWb.png"
        }
        "honchkrow" -> {
            "https://iili.io/K6UunI.png"
        }
        "foongus" -> {
            "https://iili.io/KIStWb.png"
        }
        "amoonguss" -> {
            "https://iili.io/KIStWb.png"
        }
        "lotad" -> {
            "https://iili.io/K6UunI.png"
        }
        "lombre" -> {
            "https://iili.io/KIStWb.png"
        }
        "ludicolo" -> {
            "https://iili.io/KIStWb.png"
        }
        "buizel" -> {
            "https://iili.io/K6UunI.png"
        }
        "floatzel" -> {
            "https://iili.io/KIStWb.png"
        }
        "basculin" -> {
            "https://iili.io/KIStWb.png"
        }
        "phantump" -> {
            "https://iili.io/K6UunI.png"
        }
        "trevenant" -> {
            "https://iili.io/KIStWb.png"
        }
        "pumpkaboo" -> {
            "https://iili.io/KIStWb.png"
        }
        "gourgeist" -> {
            "https://iili.io/K6UunI.png"
        }
        "litwick" -> {
            "https://iili.io/KIStWb.png"
        }
        "lampent" -> {
            "https://iili.io/KIStWb.png"
        }
        "chandelure" -> {
            "https://iili.io/K6UunI.png"
        }
        "rotom" -> {
            "https://iili.io/KIStWb.png"
        }
        "magnemite" -> {
            "https://iili.io/KIStWb.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "magnezone" -> {
            "https://iili.io/KIStWb.png"
        }
        "voltorb" -> {
            "https://iili.io/KIStWb.png"
        }
        "electrode" -> {
            "https://iili.io/K6UunI.png"
        }
        "trubbish" -> {
            "https://iili.io/KIStWb.png"
        }
        "garbodor" -> {
            "https://iili.io/KIStWb.png"
        }
        "swinub" -> {
            "https://iili.io/K6UunI.png"
        }
        "piloswine" -> {
            "https://iili.io/KIStWb.png"
        }
        "mamoswine" -> {
            "https://iili.io/KIStWb.png"
        }
        "bergmite" -> {
            "https://iili.io/K6UunI.png"
        }
        "avalugg" -> {
            "https://iili.io/KIStWb.png"
        }
        "cubchoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "beartic" -> {
            "https://iili.io/K6UunI.png"
        }
        "smoochum" -> {
            "https://iili.io/KIStWb.png"
        }
        "jynx" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanillite" -> {
            "https://iili.io/K6UunI.png"
        }
        "vanillish" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanilluxe" -> {
            "https://iili.io/KIStWb.png"
        }
        "snover" -> {
            "https://iili.io/K6UunI.png"
        }
        "abomasnow" -> {
            "https://iili.io/KIStWb.png"
        }
        "delibird" -> {
            "https://iili.io/KIStWb.png"
        }
        "sneasel" -> {
            "https://iili.io/K6UunI.png"
        }
        "weavile" -> {
            "https://iili.io/KIStWb.png"
        }
        "timburr" -> {
            "https://iili.io/KIStWb.png"
        }
        "gurdurr" -> {
            "https://iili.io/K6UunI.png"
        }
        "conkeldurr" -> {
            "https://iili.io/KIStWb.png"
        }
        "torkoal" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandshrew" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandslash" -> {
            "https://iili.io/KIStWb.png"
        }
        "aaron" -> {
            "https://iili.io/KIStWb.png"
        }
        "lairon" -> {
            "https://iili.io/K6UunI.png"
        }
        "aggron" -> {
            "https://iili.io/KIStWb.png"
        }
        "larvitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "pupitar" -> {
            "https://iili.io/K6UunI.png"
        }
        "tyranitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "heatmor" -> {
            "https://iili.io/KIStWb.png"
        }
        "durant" -> {
            "https://iili.io/K6UunI.png"
        }
        "spinarak" -> {
            "https://iili.io/KIStWb.png"
        }
        "ariados" -> {
            "https://iili.io/KIStWb.png"
        }
        "spearow" -> {
            "https://iili.io/K6UunI.png"
        }
        "fearow" -> {
            "https://iili.io/KIStWb.png"
        }
        "cryogonal" -> {
            "https://iili.io/KIStWb.png"
        }
        "skarmory" -> {
            "https://iili.io/K6UunI.png"
        }
        "noibat" -> {
            "https://iili.io/KIStWb.png"
        }
        "noivern" -> {
            "https://iili.io/KIStWb.png"
        }
        "gligar" -> {
            "https://iili.io/K6UunI.png"
        }
        "gliscor" -> {
            "https://iili.io/KIStWb.png"
        }
        "hoothoot" -> {
            "https://iili.io/KIStWb.png"
        }
        "noctowl" -> {
            "https://iili.io/K6UunI.png"
        }
        "igglybuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "jigglypuff" -> {
            "https://iili.io/KIStWb.png"
        }
        "wigglytuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "shuppet" -> {
            "https://iili.io/KIStWb.png"
        }
        "banette" -> {
            "https://iili.io/KIStWb.png"
        }
        "zorua" -> {
            "https://iili.io/K6UunI.png"
        }
        "zoroark" -> {
            "https://iili.io/KIStWb.png"
        }
        "gothita" -> {
            "https://iili.io/KIStWb.png"
        }
        "gothorita" -> {
            "https://iili.io/K6UunI.png"
        }
        "gothitelle" -> {
            "https://iili.io/KIStWb.png"
        }
        "bonsly" -> {
            "https://iili.io/KIStWb.png"
        }
        "sudowoodo" -> {
            "https://iili.io/K6UunI.png"
        }
        "spinda" -> {
            "https://iili.io/KIStWb.png"
        }
        "teddiursa" -> {
            "https://iili.io/KIStWb.png"
        }
        "ursaring" -> {
            "https://iili.io/K6UunI.png"
        }
        "lickitung" -> {
            "https://iili.io/KIStWb.png"
        }
        "lickilicky" -> {
            "https://iili.io/KIStWb.png"
        }
        "scyther" -> {
            "https://iili.io/K6UunI.png"
        }
        "scizor" -> {
            "https://iili.io/KIStWb.png"
        }
        "ditto" -> {
            "https://iili.io/KIStWb.png"
        }
        "swablu" -> {
            "https://iili.io/K6UunI.png"
        }
        "altaria" -> {
            "https://iili.io/KIStWb.png"
        }
        "druddigon" -> {
            "https://iili.io/KIStWb.png"
        }
        "deino" -> {
            "https://iili.io/K6UunI.png"
        }
        "zweilous" -> {
            "https://iili.io/KIStWb.png"
        }
        "hydreigon" -> {
            "https://iili.io/KIStWb.png"
        }
        "dratini" -> {
            "https://iili.io/K6UunI.png"
        }
        "dragonair" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragonite" -> {
            "https://iili.io/KIStWb.png"
        }
        "xerneas" -> {
            "https://iili.io/K6UunI.png"
        }
        "yveltar" -> {
            "https://iili.io/KIStWb.png"
        }
        "zygarde" -> {
            "https://iili.io/KIStWb.png"
        }
        "mewtwo" -> {
            "https://iili.io/KIStWb.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesAlola(pokemonName: String): String {
    return when (pokemonName) {
        "rowlet" -> {
            "https://iili.io/KIStWb.png"
        }
        "dartrix" -> {
            "https://iili.io/K6UvtV.png"
        }
        "decidueye" -> {
            "https://iili.io/K6UunI.png"
        }
        "litten" -> {
            "https://iili.io/KIStWb.png"
        }
        "torracat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "incineroar" -> {
            "https://iili.io/K6UunI.png"
        }
        "popplio" -> {
            "https://iili.io/K6UunI.png"
        }
        "brionne" -> {
            "https://iili.io/KIStWb.png"
        }
        "primarina" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pikipek" -> {
            "https://iili.io/K6UunI.png"
        }
        "trumbeak" -> {
            "https://iili.io/K6UunI.png"
        }
        "toucannon" -> {
            "https://iili.io/KIStWb.png"
        }
        "yungoos" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gumshoos" -> {
            "https://iili.io/K6UunI.png"
        }
        "rattata" -> {
            "https://iili.io/K6UunI.png"
        }
        "raticate" -> {
            "https://iili.io/KIStWb.png"
        }
        "caterpie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "metapod" -> {
            "https://iili.io/K6UunI.png"
        }
        "butterfree" -> {
            "https://iili.io/K6UunI.png"
        }
        "ledyba" -> {
            "https://iili.io/KIStWb.png"
        }
        "ledian" -> {
            "https://iili.io/K6UvtV.png"
        }
        "spinarak" -> {
            "https://iili.io/K6UunI.png"
        }
        "ariados" -> {
            "https://iili.io/K6UunI.png"
        }
        "buneary" -> {
            "https://iili.io/KIStWb.png"
        }
        "lopunny" -> {
            "https://iili.io/K6UvtV.png"
        }
        "inkay" -> {
            "https://iili.io/K6UunI.png"
        }
        "malamar" -> {
            "https://iili.io/K6UunI.png"
        }
        "zorua" -> {
            "https://iili.io/KIStWb.png"
        }
        "zoroark" -> {
            "https://iili.io/K6UvtV.png"
        }
        "furfrou" -> {
            "https://iili.io/K6UunI.png"
        }
        "pichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "pikachu" -> {
            "https://iili.io/KIStWb.png"
        }
        "raichu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "grubbin" -> {
            "https://iili.io/K6UunI.png"
        }
        "charjabug" -> {
            "https://iili.io/K6UunI.png"
        }
        "vikavolt" -> {
            "https://iili.io/KIStWb.png"
        }
        "bonsly" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sudowoodo" -> {
            "https://iili.io/K6UunI.png"
        }
        "happiny" -> {
            "https://iili.io/K6UunI.png"
        }
        "chansey" -> {
            "https://iili.io/KIStWb.png"
        }
        "blissey" -> {
            "https://iili.io/K6UvtV.png"
        }
        "munchlax" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorlax" -> {
            "https://iili.io/K6UunI.png"
        }
        "slowpoke" -> {
            "https://iili.io/KIStWb.png"
        }
        "slowbro" -> {
            "https://iili.io/K6UvtV.png"
        }
        "slowking" -> {
            "https://iili.io/K6UunI.png"
        }
        "wingull" -> {
            "https://iili.io/K6UunI.png"
        }
        "pelipper" -> {
            "https://iili.io/KIStWb.png"
        }
        "abra" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kadabra" -> {
            "https://iili.io/K6UunI.png"
        }
        "alakazam" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowth" -> {
            "https://iili.io/KIStWb.png"
        }
        "persian" -> {
            "https://iili.io/K6UvtV.png"
        }
        "magnemite" -> {
            "https://iili.io/K6UunI.png"
        }
        "magneton" -> {
            "https://iili.io/K6UunI.png"
        }
        "magnezone" -> {
            "https://iili.io/KIStWb.png"
        }
        "grimer" -> {
            "https://iili.io/K6UvtV.png"
        }
        "muk" -> {
            "https://iili.io/K6UunI.png"
        }
        "mime-jr" -> {
            "https://iili.io/K6UunI.png"
        }
        "mr-mime" -> {
            "https://iili.io/KIStWb.png"
        }
        "ekans" -> {
            "https://iili.io/K6UvtV.png"
        }
        "arbok" -> {
            "https://iili.io/K6UunI.png"
        }
        "dunsparce" -> {
            "https://iili.io/K6UunI.png"
        }
        "growlithe" -> {
            "https://iili.io/KIStWb.png"
        }
        "arcanine" -> {
            "https://iili.io/K6UvtV.png"
        }
        "drowzee" -> {
            "https://iili.io/K6UunI.png"
        }
        "hypno" -> {
            "https://iili.io/K6UunI.png"
        }
        "makuhita" -> {
            "https://iili.io/KIStWb.png"
        }
        "hariyama" -> {
            "https://iili.io/K6UvtV.png"
        }
        "smeargle" -> {
            "https://iili.io/K6UunI.png"
        }
        "crabrawler" -> {
            "https://iili.io/K6UunI.png"
        }
        "crabominable" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastly" -> {
            "https://iili.io/K6UvtV.png"
        }
        "haunter" -> {
            "https://iili.io/K6UunI.png"
        }
        "gengar" -> {
            "https://iili.io/K6UunI.png"
        }
        "drifloon" -> {
            "https://iili.io/KIStWb.png"
        }
        "drifblim" -> {
            "https://iili.io/K6UvtV.png"
        }
        "murkrow" -> {
            "https://iili.io/K6UunI.png"
        }
        "honchkrow" -> {
            "https://iili.io/KIStWb.png"
        }
        "zubat" -> {
            "https://iili.io/K6UvtV.png"
        }
        "golbat" -> {
            "https://iili.io/K6UunI.png"
        }
        "crobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "noibat" -> {
            "https://iili.io/KIStWb.png"
        }
        "noivern" -> {
            "https://iili.io/K6UvtV.png"
        }
        "diglett" -> {
            "https://iili.io/K6UunI.png"
        }
        "dugtrio" -> {
            "https://iili.io/K6UunI.png"
        }
        "spearow" -> {
            "https://iili.io/KIStWb.png"
        }
        "fearow" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rufflet" -> {
            "https://iili.io/K6UunI.png"
        }
        "braviary" -> {
            "https://iili.io/K6UunI.png"
        }
        "vullaby" -> {
            "https://iili.io/KIStWb.png"
        }
        "mandibuzz" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mankey" -> {
            "https://iili.io/K6UunI.png"
        }
        "primeape" -> {
            "https://iili.io/K6UunI.png"
        }
        "delibird" -> {
            "https://iili.io/KIStWb.png"
        }
        "hawlucha" -> {
            "https://iili.io/K6UvtV.png"
        }
        "oricorio" -> {
            "https://iili.io/K6UunI.png"
        }
        "cutiefly" -> {
            "https://iili.io/K6UunI.png"
        }
        "ribombee" -> {
            "https://iili.io/KIStWb.png"
        }
        "flabebe" -> {
            "https://iili.io/K6UvtV.png"
        }
        "floette" -> {
            "https://iili.io/K6UunI.png"
        }
        "florges" -> {
            "https://iili.io/K6UunI.png"
        }
        "petilil" -> {
            "https://iili.io/KIStWb.png"
        }
        "lilligant" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cottonee" -> {
            "https://iili.io/K6UunI.png"
        }
        "whimsicott" -> {
            "https://iili.io/K6UunI.png"
        }
        "psyduck" -> {
            "https://iili.io/KIStWb.png"
        }
        "golduck" -> {
            "https://iili.io/K6UvtV.png"
        }
        "smoochum" -> {
            "https://iili.io/K6UunI.png"
        }
        "jynx" -> {
            "https://iili.io/K6UunI.png"
        }
        "magikarp" -> {
            "https://iili.io/KIStWb.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UvtV.png"
        }
        "barboach" -> {
            "https://iili.io/K6UunI.png"
        }
        "whiscash" -> {
            "https://iili.io/K6UunI.png"
        }
        "seel" -> {
            "https://iili.io/KIStWb.png"
        }
        "dewgong" -> {
            "https://iili.io/K6UvtV.png"
        }
        "machop" -> {
            "https://iili.io/K6UunI.png"
        }
        "machoke" -> {
            "https://iili.io/K6UunI.png"
        }
        "machamp" -> {
            "https://iili.io/KIStWb.png"
        }
        "roggenrola" -> {
            "https://iili.io/K6UvtV.png"
        }
        "boldore" -> {
            "https://iili.io/K6UunI.png"
        }
        "gigalith" -> {
            "https://iili.io/K6UunI.png"
        }
        "carbink" -> {
            "https://iili.io/KIStWb.png"
        }
        "sableye" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mawile" -> {
            "https://iili.io/K6UunI.png"
        }
        "rockruff" -> {
            "https://iili.io/K6UunI.png"
        }
        "lycanroc" -> {
            "https://iili.io/KIStWb.png"
        }
        "spinda" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tentacool" -> {
            "https://iili.io/K6UunI.png"
        }
        "tentacruel" -> {
            "https://iili.io/K6UunI.png"
        }
        "finneon" -> {
            "https://iili.io/KIStWb.png"
        }
        "lumineon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wishiwashi" -> {
            "https://iili.io/K6UunI.png"
        }
        "luvdisc" -> {
            "https://iili.io/K6UunI.png"
        }
        "corsola" -> {
            "https://iili.io/KIStWb.png"
        }
        "mareanie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "toxapex" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellder" -> {
            "https://iili.io/K6UunI.png"
        }
        "cloyster" -> {
            "https://iili.io/KIStWb.png"
        }
        "clamperl" -> {
            "https://iili.io/K6UvtV.png"
        }
        "huntail" -> {
            "https://iili.io/K6UunI.png"
        }
        "gorebyss" -> {
            "https://iili.io/K6UunI.png"
        }
        "remoraid" -> {
            "https://iili.io/KIStWb.png"
        }
        "octyllery" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mantyke" -> {
            "https://iili.io/K6UunI.png"
        }
        "mantine" -> {
            "https://iili.io/K6UunI.png"
        }
        "bagon" -> {
            "https://iili.io/KIStWb.png"
        }
        "shelgon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "salamance" -> {
            "https://iili.io/K6UunI.png"
        }
        "lillipup" -> {
            "https://iili.io/K6UunI.png"
        }
        "herdier" -> {
            "https://iili.io/K6UunI.png"
        }
        "stoutland" -> {
            "https://iili.io/K6UunI.png"
        }
        "eevee" -> {
            "https://iili.io/KIStWb.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/K6UunI.png"
        }
        "espeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "umbreon" -> {
            "https://iili.io/K6UunI.png"
        }
        "leafeon" -> {
            "https://iili.io/KIStWb.png"
        }
        "glaceon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "sylveon" -> {
            "https://iili.io/K6UunI.png"
        }
        "mareep" -> {
            "https://iili.io/K6UunI.png"
        }
        "flaafy" -> {
            "https://iili.io/K6UunI.png"
        }
        "ampharos" -> {
            "https://iili.io/K6UunI.png"
        }
        "mudbray" -> {
            "https://iili.io/KIStWb.png"
        }
        "mudsdale" -> {
            "https://iili.io/K6UvtV.png"
        }
        "igglybuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "jigglypuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "wigglytuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "tauros" -> {
            "https://iili.io/K6UunI.png"
        }
        "miltank" -> {
            "https://iili.io/KIStWb.png"
        }
        "surskit" -> {
            "https://iili.io/K6UvtV.png"
        }
        "masquerain" -> {
            "https://iili.io/K6UunI.png"
        }
        "dewpider" -> {
            "https://iili.io/K6UunI.png"
        }
        "araquanid" -> {
            "https://iili.io/K6UunI.png"
        }
        "fomantis" -> {
            "https://iili.io/K6UunI.png"
        }
        "lurantis" -> {
            "https://iili.io/KIStWb.png"
        }
        "morelull" -> {
            "https://iili.io/K6UvtV.png"
        }
        "shiinotic" -> {
            "https://iili.io/K6UunI.png"
        }
        "paras" -> {
            "https://iili.io/K6UunI.png"
        }
        "parasect" -> {
            "https://iili.io/K6UunI.png"
        }
        "poliwag" -> {
            "https://iili.io/K6UunI.png"
        }
        "poliwhirl" -> {
            "https://iili.io/KIStWb.png"
        }
        "poliwrath" -> {
            "https://iili.io/K6UvtV.png"
        }
        "politoed" -> {
            "https://iili.io/K6UunI.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/K6UunI.png"
        }
        "basculin" -> {
            "https://iili.io/K6UunI.png"
        }
        "feebas" -> {
            "https://iili.io/KIStWb.png"
        }
        "milotic" -> {
            "https://iili.io/K6UvtV.png"
        }
        "alomomola" -> {
            "https://iili.io/K6UunI.png"
        }
        "fletchling" -> {
            "https://iili.io/K6UunI.png"
        }
        "fletchinder" -> {
            "https://iili.io/K6UunI.png"
        }
        "talonflame" -> {
            "https://iili.io/K6UunI.png"
        }
        "salandit" -> {
            "https://iili.io/KIStWb.png"
        }
        "salazzle" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cubone" -> {
            "https://iili.io/K6UunI.png"
        }
        "marowak" -> {
            "https://iili.io/K6UunI.png"
        }
        "kangaskhan" -> {
            "https://iili.io/K6UunI.png"
        }
        "magby" -> {
            "https://iili.io/K6UunI.png"
        }
        "magmar" -> {
            "https://iili.io/KIStWb.png"
        }
        "magmortar" -> {
            "https://iili.io/K6UunI.png"
        }
        "larvesta" -> {
            "https://iili.io/KIStWb.png"
        }
        "volcarona" -> {
            "https://iili.io/K6UunI.png"
        }
        "stufful" -> {
            "https://iili.io/KIStWb.png"
        }
        "bewear" -> {
            "https://iili.io/K6UunI.png"
        }
        "bounsweet" -> {
            "https://iili.io/KIStWb.png"
        }
        "steenee" -> {
            "https://iili.io/K6UunI.png"
        }
        "tsareena" -> {
            "https://iili.io/KIStWb.png"
        }
        "comfey" -> {
            "https://iili.io/KIStWb.png"
        }
        "pinsir" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoothoot" -> {
            "https://iili.io/KIStWb.png"
        }
        "noctowl" -> {
            "https://iili.io/KIStWb.png"
        }
        "kecleon" -> {
            "https://iili.io/K6UunI.png"
        }
        "oranguru" -> {
            "https://iili.io/KIStWb.png"
        }
        "pessimian" -> {
            "https://iili.io/KIStWb.png"
        }
        "goomy" -> {
            "https://iili.io/K6UunI.png"
        }
        "sliggoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "goodra" -> {
            "https://iili.io/KIStWb.png"
        }
        "castform" -> {
            "https://iili.io/K6UunI.png"
        }
        "wimpod" -> {
            "https://iili.io/KIStWb.png"
        }
        "golisopod" -> {
            "https://iili.io/KIStWb.png"
        }
        "staryu" -> {
            "https://iili.io/K6UunI.png"
        }
        "starmie" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandygast" -> {
            "https://iili.io/KIStWb.png"
        }
        "palossand" -> {
            "https://iili.io/K6UunI.png"
        }
        "omanyte" -> {
            "https://iili.io/KIStWb.png"
        }
        "omastar" -> {
            "https://iili.io/KIStWb.png"
        }
        "kabuto" -> {
            "https://iili.io/K6UunI.png"
        }
        "kabutops" -> {
            "https://iili.io/KIStWb.png"
        }
        "lileep" -> {
            "https://iili.io/KIStWb.png"
        }
        "cradily" -> {
            "https://iili.io/K6UunI.png"
        }
        "anorith" -> {
            "https://iili.io/KIStWb.png"
        }
        "armaldo" -> {
            "https://iili.io/KIStWb.png"
        }
        "cranidos" -> {
            "https://iili.io/K6UunI.png"
        }
        "rampardos" -> {
            "https://iili.io/KIStWb.png"
        }
        "shieldon" -> {
            "https://iili.io/KIStWb.png"
        }
        "bastiodon" -> {
            "https://iili.io/K6UunI.png"
        }
        "archen" -> {
            "https://iili.io/KIStWb.png"
        }
        "archeops" -> {
            "https://iili.io/KIStWb.png"
        }
        "tirtouga" -> {
            "https://iili.io/K6UunI.png"
        }
        "carracosta" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyrunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyrantrum" -> {
            "https://iili.io/K6UunI.png"
        }
        "amaura" -> {
            "https://iili.io/KIStWb.png"
        }
        "aurorus" -> {
            "https://iili.io/KIStWb.png"
        }
        "larvitar" -> {
            "https://iili.io/K6UunI.png"
        }
        "pupitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyranitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "phantump" -> {
            "https://iili.io/K6UunI.png"
        }
        "trevenant" -> {
            "https://iili.io/KIStWb.png"
        }
        "natu" -> {
            "https://iili.io/KIStWb.png"
        }
        "xatu" -> {
            "https://iili.io/K6UunI.png"
        }
        "nosepass" -> {
            "https://iili.io/KIStWb.png"
        }
        "probopass" -> {
            "https://iili.io/KIStWb.png"
        }
        "pyukumuku" -> {
            "https://iili.io/K6UunI.png"
        }
        "chinchou" -> {
            "https://iili.io/KIStWb.png"
        }
        "lanturn" -> {
            "https://iili.io/KIStWb.png"
        }
        "typenull" -> {
            "https://iili.io/K6UunI.png"
        }
        "silvally" -> {
            "https://iili.io/KIStWb.png"
        }
        "poipole" -> {
            "https://iili.io/KIStWb.png"
        }
        "naganadel" -> {
            "https://iili.io/K6UunI.png"
        }
        "zygarde" -> {
            "https://iili.io/KIStWb.png"
        }
        "trubbish" -> {
            "https://iili.io/KIStWb.png"
        }
        "garbodor" -> {
            "https://iili.io/K6UunI.png"
        }
        "minccino" -> {
            "https://iili.io/KIStWb.png"
        }
        "cinccino" -> {
            "https://iili.io/KIStWb.png"
        }
        "pineco" -> {
            "https://iili.io/K6UunI.png"
        }
        "forretress" -> {
            "https://iili.io/KIStWb.png"
        }
        "skarmory" -> {
            "https://iili.io/KIStWb.png"
        }
        "ditto" -> {
            "https://iili.io/K6UunI.png"
        }
        "cleffa" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefairy" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefable" -> {
            "https://iili.io/K6UunI.png"
        }
        "elgyem" -> {
            "https://iili.io/KIStWb.png"
        }
        "beheeyem" -> {
            "https://iili.io/KIStWb.png"
        }
        "minior" -> {
            "https://iili.io/K6UunI.png"
        }
        "beldum" -> {
            "https://iili.io/KIStWb.png"
        }
        "metang" -> {
            "https://iili.io/KIStWb.png"
        }
        "metagross" -> {
            "https://iili.io/K6UunI.png"
        }
        "porygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "porygon2" -> {
            "https://iili.io/KIStWb.png"
        }
        "porygon-z" -> {
            "https://iili.io/K6UunI.png"
        }
        "pancham" -> {
            "https://iili.io/KIStWb.png"
        }
        "pangoro" -> {
            "https://iili.io/KIStWb.png"
        }
        "komala" -> {
            "https://iili.io/K6UunI.png"
        }
        "torkoal" -> {
            "https://iili.io/KIStWb.png"
        }
        "turtonator" -> {
            "https://iili.io/KIStWb.png"
        }
        "houndour" -> {
            "https://iili.io/K6UunI.png"
        }
        "houndoom" -> {
            "https://iili.io/KIStWb.png"
        }
        "dedenne" -> {
            "https://iili.io/KIStWb.png"
        }
        "togedemaru" -> {
            "https://iili.io/K6UunI.png"
        }
        "electrike" -> {
            "https://iili.io/KIStWb.png"
        }
        "manectric" -> {
            "https://iili.io/KIStWb.png"
        }
        "elekid" -> {
            "https://iili.io/K6UunI.png"
        }
        "electabuzz" -> {
            "https://iili.io/KIStWb.png"
        }
        "electivire" -> {
            "https://iili.io/KIStWb.png"
        }
        "geodude" -> {
            "https://iili.io/K6UunI.png"
        }
        "graveler" -> {
            "https://iili.io/KIStWb.png"
        }
        "golem" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandile" -> {
            "https://iili.io/K6UunI.png"
        }
        "krokorok" -> {
            "https://iili.io/KIStWb.png"
        }
        "krookodile" -> {
            "https://iili.io/KIStWb.png"
        }
        "trapinch" -> {
            "https://iili.io/K6UunI.png"
        }
        "vibrava" -> {
            "https://iili.io/KIStWb.png"
        }
        "flygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "gible" -> {
            "https://iili.io/K6UunI.png"
        }
        "gabite" -> {
            "https://iili.io/KIStWb.png"
        }
        "garchomp" -> {
            "https://iili.io/KIStWb.png"
        }
        "baltoy" -> {
            "https://iili.io/K6UunI.png"
        }
        "claydol" -> {
            "https://iili.io/KIStWb.png"
        }
        "golett" -> {
            "https://iili.io/KIStWb.png"
        }
        "golurk" -> {
            "https://iili.io/K6UunI.png"
        }
        "klefki" -> {
            "https://iili.io/KIStWb.png"
        }
        "mimikyu" -> {
            "https://iili.io/KIStWb.png"
        }
        "shuppet" -> {
            "https://iili.io/K6UunI.png"
        }
        "banette" -> {
            "https://iili.io/KIStWb.png"
        }
        "frillish" -> {
            "https://iili.io/KIStWb.png"
        }
        "jellicent" -> {
            "https://iili.io/K6UunI.png"
        }
        "bruxish" -> {
            "https://iili.io/KIStWb.png"
        }
        "drampa" -> {
            "https://iili.io/KIStWb.png"
        }
        "absol" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "glalie" -> {
            "https://iili.io/KIStWb.png"
        }
        "froslass" -> {
            "https://iili.io/K6UunI.png"
        }
        "sneasel" -> {
            "https://iili.io/KIStWb.png"
        }
        "weavile" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandshrew" -> {
            "https://iili.io/K6UunI.png"
        }
        "sandslash" -> {
            "https://iili.io/KIStWb.png"
        }
        "vulpix" -> {
            "https://iili.io/KIStWb.png"
        }
        "ninetales" -> {
            "https://iili.io/K6UunI.png"
        }
        "vanillite" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanillish" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanilluxe" -> {
            "https://iili.io/K6UunI.png"
        }
        "scraggy" -> {
            "https://iili.io/KIStWb.png"
        }
        "scrafty" -> {
            "https://iili.io/KIStWb.png"
        }
        "pawniard" -> {
            "https://iili.io/K6UunI.png"
        }
        "bisharp" -> {
            "https://iili.io/KIStWb.png"
        }
        "snubbull" -> {
            "https://iili.io/KIStWb.png"
        }
        "granbull" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellos" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastrodon" -> {
            "https://iili.io/KIStWb.png"
        }
        "relicanth" -> {
            "https://iili.io/K6UunI.png"
        }
        "dhelmise" -> {
            "https://iili.io/KIStWb.png"
        }
        "carvanha" -> {
            "https://iili.io/KIStWb.png"
        }
        "sharpedo" -> {
            "https://iili.io/K6UunI.png"
        }
        "skrelp" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragalge" -> {
            "https://iili.io/KIStWb.png"
        }
        "clauncher" -> {
            "https://iili.io/K6UunI.png"
        }
        "clawitzer" -> {
            "https://iili.io/KIStWb.png"
        }
        "wailmer" -> {
            "https://iili.io/KIStWb.png"
        }
        "wailord" -> {
            "https://iili.io/K6UunI.png"
        }
        "lapras" -> {
            "https://iili.io/KIStWb.png"
        }
        "tropius" -> {
            "https://iili.io/KIStWb.png"
        }
        "exeggcute" -> {
            "https://iili.io/K6UunI.png"
        }
        "exeggutor" -> {
            "https://iili.io/KIStWb.png"
        }
        "corphish" -> {
            "https://iili.io/KIStWb.png"
        }
        "crawdaunt" -> {
            "https://iili.io/K6UunI.png"
        }
        "mienfoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "mienshao" -> {
            "https://iili.io/KIStWb.png"
        }
        "jangmo-o" -> {
            "https://iili.io/K6UunI.png"
        }
        "hakamo-o" -> {
            "https://iili.io/KIStWb.png"
        }
        "kommo-o" -> {
            "https://iili.io/KIStWb.png"
        }
        "emolga" -> {
            "https://iili.io/K6UunI.png"
        }
        "scyther" -> {
            "https://iili.io/KIStWb.png"
        }
        "scizor" -> {
            "https://iili.io/KIStWb.png"
        }
        "heracross" -> {
            "https://iili.io/K6UunI.png"
        }
        "aipom" -> {
            "https://iili.io/KIStWb.png"
        }
        "ambipom" -> {
            "https://iili.io/KIStWb.png"
        }
        "litleo" -> {
            "https://iili.io/K6UunI.png"
        }
        "pyroar" -> {
            "https://iili.io/KIStWb.png"
        }
        "misdreavus" -> {
            "https://iili.io/KIStWb.png"
        }
        "mismagius" -> {
            "https://iili.io/K6UunI.png"
        }
        "druddigon" -> {
            "https://iili.io/KIStWb.png"
        }
        "lickitung" -> {
            "https://iili.io/KIStWb.png"
        }
        "lickilicky" -> {
            "https://iili.io/K6UunI.png"
        }
        "riolu" -> {
            "https://iili.io/KIStWb.png"
        }
        "lucario" -> {
            "https://iili.io/KIStWb.png"
        }
        "dratini" -> {
            "https://iili.io/K6UunI.png"
        }
        "dragonair" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragonite" -> {
            "https://iili.io/KIStWb.png"
        }
        "aerodactyle" -> {
            "https://iili.io/K6UunI.png"
        }
        "tapu-koko" -> {
            "https://iili.io/KIStWb.png"
        }
        "tapu-lele" -> {
            "https://iili.io/KIStWb.png"
        }
        "tapu-bulu" -> {
            "https://iili.io/K6UunI.png"
        }
        "tapu-fini" -> {
            "https://iili.io/KIStWb.png"
        }
        "cosmog" -> {
            "https://iili.io/KIStWb.png"
        }
        "cosmoem" -> {
            "https://iili.io/K6UunI.png"
        }
        "solgaleo" -> {
            "https://iili.io/KIStWb.png"
        }
        "lunala" -> {
            "https://iili.io/KIStWb.png"
        }
        "stakataka" -> {
            "https://iili.io/K6UunI.png"
        }
        "blacephalon" -> {
            "https://iili.io/KIStWb.png"
        }
        "nihilego" -> {
            "https://iili.io/KIStWb.png"
        }
        "buzzwole" -> {
            "https://iili.io/K6UunI.png"
        }
        "pheromosa" -> {
            "https://iili.io/KIStWb.png"
        }
        "xurkitree" -> {
            "https://iili.io/KIStWb.png"
        }
        "celesteela" -> {
            "https://iili.io/K6UunI.png"
        }
        "kartana" -> {
            "https://iili.io/KIStWb.png"
        }
        "guzzlord" -> {
            "https://iili.io/KIStWb.png"
        }
        "necrozma" -> {
            "https://iili.io/K6UunI.png"
        }
        "magearna" -> {
            "https://iili.io/KIStWb.png"
        }
        "marshadow" -> {
            "https://iili.io/KIStWb.png"
        }
        "zeraora" -> {
            "https://iili.io/K6UunI.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

fun getSpritesGalar(pokemonName: String): String {
    return when (pokemonName) {
        "grookey" -> {
            "https://iili.io/KIStWb.png"
        }
        "thwackey" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rillaboom" -> {
            "https://iili.io/K6UunI.png"
        }
        "scorbunny" -> {
            "https://iili.io/KIStWb.png"
        }
        "raboot" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cinderace" -> {
            "https://iili.io/K6UunI.png"
        }
        "sobble" -> {
            "https://iili.io/K6UunI.png"
        }
        "drizzile" -> {
            "https://iili.io/KIStWb.png"
        }
        "inteleon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "blipbug" -> {
            "https://iili.io/K6UunI.png"
        }
        "dottler" -> {
            "https://iili.io/K6UunI.png"
        }
        "orbeetle" -> {
            "https://iili.io/KIStWb.png"
        }
        "caterpie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "metapod" -> {
            "https://iili.io/K6UunI.png"
        }
        "butterfree" -> {
            "https://iili.io/K6UunI.png"
        }
        "grubbin" -> {
            "https://iili.io/KIStWb.png"
        }
        "charjabug" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vikavolt" -> {
            "https://iili.io/K6UunI.png"
        }
        "hoothoot" -> {
            "https://iili.io/K6UunI.png"
        }
        "noctowl" -> {
            "https://iili.io/KIStWb.png"
        }
        "rookidee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "corvisquire" -> {
            "https://iili.io/K6UunI.png"
        }
        "corviknight" -> {
            "https://iili.io/K6UunI.png"
        }
        "skwovet" -> {
            "https://iili.io/KIStWb.png"
        }
        "greedent" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pidove" -> {
            "https://iili.io/K6UunI.png"
        }
        "tranquill" -> {
            "https://iili.io/K6UunI.png"
        }
        "unfezant" -> {
            "https://iili.io/KIStWb.png"
        }
        "nickit" -> {
            "https://iili.io/K6UvtV.png"
        }
        "thievul" -> {
            "https://iili.io/K6UunI.png"
        }
        "zigzagoon" -> {
            "https://iili.io/K6UunI.png"
        }
        "linoone" -> {
            "https://iili.io/KIStWb.png"
        }
        "obstagoon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wooloo" -> {
            "https://iili.io/K6UunI.png"
        }
        "dubwool" -> {
            "https://iili.io/K6UunI.png"
        }
        "lotad" -> {
            "https://iili.io/KIStWb.png"
        }
        "lombre" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ludicolo" -> {
            "https://iili.io/K6UunI.png"
        }
        "seedot" -> {
            "https://iili.io/K6UunI.png"
        }
        "nuzleaf" -> {
            "https://iili.io/KIStWb.png"
        }
        "shiftry" -> {
            "https://iili.io/K6UvtV.png"
        }
        "chewtle" -> {
            "https://iili.io/K6UunI.png"
        }
        "drednaw" -> {
            "https://iili.io/K6UunI.png"
        }
        "purrloin" -> {
            "https://iili.io/KIStWb.png"
        }
        "liepard" -> {
            "https://iili.io/K6UvtV.png"
        }
        "yamper" -> {
            "https://iili.io/K6UunI.png"
        }
        "boltund" -> {
            "https://iili.io/K6UunI.png"
        }
        "bunnelby" -> {
            "https://iili.io/KIStWb.png"
        }
        "diggersby" -> {
            "https://iili.io/K6UvtV.png"
        }
        "minccino" -> {
            "https://iili.io/K6UunI.png"
        }
        "cinccino" -> {
            "https://iili.io/K6UunI.png"
        }
        "bounsweet" -> {
            "https://iili.io/KIStWb.png"
        }
        "steenee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "tsareena" -> {
            "https://iili.io/K6UunI.png"
        }
        "oddish" -> {
            "https://iili.io/K6UunI.png"
        }
        "gloom" -> {
            "https://iili.io/KIStWb.png"
        }
        "vileplume" -> {
            "https://iili.io/K6UvtV.png"
        }
        "bellossom" -> {
            "https://iili.io/K6UunI.png"
        }
        "budew" -> {
            "https://iili.io/K6UunI.png"
        }
        "roselia" -> {
            "https://iili.io/KIStWb.png"
        }
        "roserade" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wingull" -> {
            "https://iili.io/K6UunI.png"
        }
        "pelipper" -> {
            "https://iili.io/K6UunI.png"
        }
        "joltik" -> {
            "https://iili.io/KIStWb.png"
        }
        "galvantula" -> {
            "https://iili.io/K6UvtV.png"
        }
        "electrike" -> {
            "https://iili.io/K6UunI.png"
        }
        "manectric" -> {
            "https://iili.io/K6UunI.png"
        }
        "vulpix" -> {
            "https://iili.io/KIStWb.png"
        }
        "ninetales" -> {
            "https://iili.io/K6UvtV.png"
        }
        "growlithe" -> {
            "https://iili.io/K6UunI.png"
        }
        "arcanine" -> {
            "https://iili.io/K6UunI.png"
        }
        "vanillite" -> {
            "https://iili.io/KIStWb.png"
        }
        "vanillish" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vanilluxe" -> {
            "https://iili.io/K6UunI.png"
        }
        "swinub" -> {
            "https://iili.io/K6UunI.png"
        }
        "piloswine" -> {
            "https://iili.io/KIStWb.png"
        }
        "mamoswine" -> {
            "https://iili.io/K6UvtV.png"
        }
        "delibird" -> {
            "https://iili.io/K6UunI.png"
        }
        "snorunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "glalie" -> {
            "https://iili.io/K6UvtV.png"
        }
        "froslass" -> {
            "https://iili.io/K6UunI.png"
        }
        "baltoy" -> {
            "https://iili.io/K6UunI.png"
        }
        "claydol" -> {
            "https://iili.io/KIStWb.png"
        }
        "mudbray" -> {
            "https://iili.io/K6UvtV.png"
        }
        "mudsdale" -> {
            "https://iili.io/K6UunI.png"
        }
        "dwebble" -> {
            "https://iili.io/K6UunI.png"
        }
        "crustle" -> {
            "https://iili.io/KIStWb.png"
        }
        "golett" -> {
            "https://iili.io/K6UvtV.png"
        }
        "golurk" -> {
            "https://iili.io/K6UunI.png"
        }
        "munna" -> {
            "https://iili.io/K6UunI.png"
        }
        "musharna" -> {
            "https://iili.io/KIStWb.png"
        }
        "natu" -> {
            "https://iili.io/K6UvtV.png"
        }
        "xatu" -> {
            "https://iili.io/K6UunI.png"
        }
        "stufful" -> {
            "https://iili.io/K6UunI.png"
        }
        "bewear" -> {
            "https://iili.io/KIStWb.png"
        }
        "snover" -> {
            "https://iili.io/K6UvtV.png"
        }
        "abomasnow" -> {
            "https://iili.io/K6UunI.png"
        }
        "krabby" -> {
            "https://iili.io/K6UunI.png"
        }
        "kingler" -> {
            "https://iili.io/KIStWb.png"
        }
        "wooper" -> {
            "https://iili.io/K6UvtV.png"
        }
        "quagsire" -> {
            "https://iili.io/K6UunI.png"
        }
        "corphish" -> {
            "https://iili.io/K6UunI.png"
        }
        "crawdaunt" -> {
            "https://iili.io/KIStWb.png"
        }
        "nincada" -> {
            "https://iili.io/K6UvtV.png"
        }
        "ninjask" -> {
            "https://iili.io/K6UunI.png"
        }
        "shedinja" -> {
            "https://iili.io/K6UunI.png"
        }
        "tyrogue" -> {
            "https://iili.io/KIStWb.png"
        }
        "hitmonlee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "hitmonchan" -> {
            "https://iili.io/K6UunI.png"
        }
        "hitmontop" -> {
            "https://iili.io/K6UunI.png"
        }
        "panchamp" -> {
            "https://iili.io/KIStWb.png"
        }
        "pangoro" -> {
            "https://iili.io/K6UvtV.png"
        }
        "klink" -> {
            "https://iili.io/K6UunI.png"
        }
        "klang" -> {
            "https://iili.io/K6UunI.png"
        }
        "klinklang" -> {
            "https://iili.io/KIStWb.png"
        }
        "combee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vespiquen" -> {
            "https://iili.io/K6UunI.png"
        }
        "bronzor" -> {
            "https://iili.io/K6UunI.png"
        }
        "bronzong" -> {
            "https://iili.io/KIStWb.png"
        }
        "ralts" -> {
            "https://iili.io/K6UvtV.png"
        }
        "kirlia" -> {
            "https://iili.io/K6UunI.png"
        }
        "gardevoir" -> {
            "https://iili.io/K6UunI.png"
        }
        "gallade" -> {
            "https://iili.io/KIStWb.png"
        }
        "drifloon" -> {
            "https://iili.io/K6UvtV.png"
        }
        "drifblim" -> {
            "https://iili.io/K6UunI.png"
        }
        "gossifleur" -> {
            "https://iili.io/K6UunI.png"
        }
        "eldegoss" -> {
            "https://iili.io/KIStWb.png"
        }
        "cherubi" -> {
            "https://iili.io/K6UvtV.png"
        }
        "cherrim" -> {
            "https://iili.io/K6UunI.png"
        }
        "stunky" -> {
            "https://iili.io/K6UunI.png"
        }
        "skuntank" -> {
            "https://iili.io/KIStWb.png"
        }
        "tympole" -> {
            "https://iili.io/K6UvtV.png"
        }
        "palpitoad" -> {
            "https://iili.io/K6UunI.png"
        }
        "seismitoad" -> {
            "https://iili.io/K6UunI.png"
        }
        "duskull" -> {
            "https://iili.io/KIStWb.png"
        }
        "dusclops" -> {
            "https://iili.io/K6UvtV.png"
        }
        "dusknoir" -> {
            "https://iili.io/K6UunI.png"
        }
        "machop" -> {
            "https://iili.io/K6UunI.png"
        }
        "machoke" -> {
            "https://iili.io/KIStWb.png"
        }
        "machamp" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gastly" -> {
            "https://iili.io/K6UunI.png"
        }
        "haunter" -> {
            "https://iili.io/K6UunI.png"
        }
        "gengar" -> {
            "https://iili.io/KIStWb.png"
        }
        "magikarp" -> {
            "https://iili.io/K6UvtV.png"
        }
        "gyarados" -> {
            "https://iili.io/K6UunI.png"
        }
        "goldeen" -> {
            "https://iili.io/K6UunI.png"
        }
        "seaking" -> {
            "https://iili.io/KIStWb.png"
        }
        "remoraid" -> {
            "https://iili.io/K6UvtV.png"
        }
        "octillery" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellder" -> {
            "https://iili.io/K6UunI.png"
        }
        "cloyster" -> {
            "https://iili.io/K6UunI.png"
        }
        "feebas" -> {
            "https://iili.io/K6UunI.png"
        }
        "milotic" -> {
            "https://iili.io/KIStWb.png"
        }
        "basculin" -> {
            "https://iili.io/K6UvtV.png"
        }
        "wishiwashi" -> {
            "https://iili.io/K6UunI.png"
        }
        "pyukumuku" -> {
            "https://iili.io/K6UunI.png"
        }
        "trubbish" -> {
            "https://iili.io/K6UunI.png"
        }
        "garbodor" -> {
            "https://iili.io/K6UunI.png"
        }
        "sizzlipede" -> {
            "https://iili.io/KIStWb.png"
        }
        "centiskorch" -> {
            "https://iili.io/K6UvtV.png"
        }
        "rolycoly" -> {
            "https://iili.io/K6UunI.png"
        }
        "carkol" -> {
            "https://iili.io/K6UunI.png"
        }
        "coalossal" -> {
            "https://iili.io/K6UunI.png"
        }
        "diglett" -> {
            "https://iili.io/K6UunI.png"
        }
        "dugtrio" -> {
            "https://iili.io/KIStWb.png"
        }
        "drilbur" -> {
            "https://iili.io/K6UvtV.png"
        }
        "excadrill" -> {
            "https://iili.io/K6UunI.png"
        }
        "roggenrola" -> {
            "https://iili.io/K6UunI.png"
        }
        "boldore" -> {
            "https://iili.io/K6UunI.png"
        }
        "gigalith" -> {
            "https://iili.io/K6UunI.png"
        }
        "timburr" -> {
            "https://iili.io/KIStWb.png"
        }
        "gurdurr" -> {
            "https://iili.io/K6UvtV.png"
        }
        "conkeldurr" -> {
            "https://iili.io/K6UunI.png"
        }
        "woobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "swoobat" -> {
            "https://iili.io/K6UunI.png"
        }
        "noibat" -> {
            "https://iili.io/K6UunI.png"
        }
        "noivern" -> {
            "https://iili.io/KIStWb.png"
        }
        "onix" -> {
            "https://iili.io/K6UvtV.png"
        }
        "steelix" -> {
            "https://iili.io/K6UunI.png"
        }
        "arrokuda" -> {
            "https://iili.io/K6UunI.png"
        }
        "berraskewda" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowth" -> {
            "https://iili.io/K6UunI.png"
        }
        "perrserker" -> {
            "https://iili.io/KIStWb.png"
        }
        "persian" -> {
            "https://iili.io/K6UvtV.png"
        }
        "milcery" -> {
            "https://iili.io/K6UunI.png"
        }
        "alcremie" -> {
            "https://iili.io/K6UunI.png"
        }
        "cutiefly" -> {
            "https://iili.io/K6UunI.png"
        }
        "ribombee" -> {
            "https://iili.io/K6UunI.png"
        }
        "ferroseed" -> {
            "https://iili.io/KIStWb.png"
        }
        "ferrthorn" -> {
            "https://iili.io/K6UvtV.png"
        }
        "pumpkaboo" -> {
            "https://iili.io/K6UunI.png"
        }
        "gourgeist" -> {
            "https://iili.io/K6UunI.png"
        }
        "pichu" -> {
            "https://iili.io/K6UunI.png"
        }
        "pikachu" -> {
            "https://iili.io/K6UunI.png"
        }
        "raichu" -> {
            "https://iili.io/KIStWb.png"
        }
        "eevee" -> {
            "https://iili.io/K6UvtV.png"
        }
        "vaporeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "jolteon" -> {
            "https://iili.io/K6UunI.png"
        }
        "flareon" -> {
            "https://iili.io/K6UunI.png"
        }
        "espeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "umbreon" -> {
            "https://iili.io/KIStWb.png"
        }
        "leafeon" -> {
            "https://iili.io/K6UunI.png"
        }
        "glaceon" -> {
            "https://iili.io/KIStWb.png"
        }
        "sylveon" -> {
            "https://iili.io/K6UunI.png"
        }
        "applin" -> {
            "https://iili.io/KIStWb.png"
        }
        "flapple" -> {
            "https://iili.io/K6UunI.png"
        }
        "appletun" -> {
            "https://iili.io/KIStWb.png"
        }
        "espurr" -> {
            "https://iili.io/K6UunI.png"
        }
        "meowstic" -> {
            "https://iili.io/KIStWb.png"
        }
        "swirlix" -> {
            "https://iili.io/KIStWb.png"
        }
        "slurpuff" -> {
            "https://iili.io/K6UunI.png"
        }
        "spritzee" -> {
            "https://iili.io/KIStWb.png"
        }
        "aromatisse" -> {
            "https://iili.io/KIStWb.png"
        }
        "dewpider" -> {
            "https://iili.io/K6UunI.png"
        }
        "araquanid" -> {
            "https://iili.io/KIStWb.png"
        }
        "wynaut" -> {
            "https://iili.io/KIStWb.png"
        }
        "wobbuffet" -> {
            "https://iili.io/K6UunI.png"
        }
        "farfetchd" -> {
            "https://iili.io/KIStWb.png"
        }
        "sirfetchd" -> {
            "https://iili.io/KIStWb.png"
        }
        "chinchou" -> {
            "https://iili.io/K6UunI.png"
        }
        "lanturn" -> {
            "https://iili.io/KIStWb.png"
        }
        "croagunk" -> {
            "https://iili.io/KIStWb.png"
        }
        "toxicroak" -> {
            "https://iili.io/K6UunI.png"
        }
        "scraggy" -> {
            "https://iili.io/KIStWb.png"
        }
        "scrafty" -> {
            "https://iili.io/KIStWb.png"
        }
        "stunfisk" -> {
            "https://iili.io/K6UunI.png"
        }
        "shuckle" -> {
            "https://iili.io/KIStWb.png"
        }
        "barboach" -> {
            "https://iili.io/KIStWb.png"
        }
        "whiscash" -> {
            "https://iili.io/K6UunI.png"
        }
        "shellos" -> {
            "https://iili.io/KIStWb.png"
        }
        "gastrodon" -> {
            "https://iili.io/KIStWb.png"
        }
        "wimpod" -> {
            "https://iili.io/K6UunI.png"
        }
        "golisopod" -> {
            "https://iili.io/KIStWb.png"
        }
        "binacle" -> {
            "https://iili.io/KIStWb.png"
        }
        "barbaracle" -> {
            "https://iili.io/K6UunI.png"
        }
        "corsola" -> {
            "https://iili.io/KIStWb.png"
        }
        "cursola" -> {
            "https://iili.io/KIStWb.png"
        }
        "impidimp" -> {
            "https://iili.io/K6UunI.png"
        }
        "morgrem" -> {
            "https://iili.io/KIStWb.png"
        }
        "grimmsnarl" -> {
            "https://iili.io/KIStWb.png"
        }
        "hatenna" -> {
            "https://iili.io/K6UunI.png"
        }
        "hattrem" -> {
            "https://iili.io/KIStWb.png"
        }
        "hatterene" -> {
            "https://iili.io/KIStWb.png"
        }
        "salandit" -> {
            "https://iili.io/K6UunI.png"
        }
        "salazzle" -> {
            "https://iili.io/KIStWb.png"
        }
        "pawniard" -> {
            "https://iili.io/KIStWb.png"
        }
        "bisharp" -> {
            "https://iili.io/K6UunI.png"
        }
        "throh" -> {
            "https://iili.io/KIStWb.png"
        }
        "sawk" -> {
            "https://iili.io/KIStWb.png"
        }
        "koffing" -> {
            "https://iili.io/K6UunI.png"
        }
        "weezing" -> {
            "https://iili.io/KIStWb.png"
        }
        "bonsly" -> {
            "https://iili.io/KIStWb.png"
        }
        "sudowoodo" -> {
            "https://iili.io/K6UunI.png"
        }
        "cleffa" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefairy" -> {
            "https://iili.io/KIStWb.png"
        }
        "clefable" -> {
            "https://iili.io/K6UunI.png"
        }
        "togepi" -> {
            "https://iili.io/KIStWb.png"
        }
        "togetic" -> {
            "https://iili.io/KIStWb.png"
        }
        "togekiss" -> {
            "https://iili.io/K6UunI.png"
        }
        "munchlax" -> {
            "https://iili.io/KIStWb.png"
        }
        "snorlax" -> {
            "https://iili.io/KIStWb.png"
        }
        "cottonee" -> {
            "https://iili.io/K6UunI.png"
        }
        "whimsicott" -> {
            "https://iili.io/KIStWb.png"
        }
        "rhyhorn" -> {
            "https://iili.io/KIStWb.png"
        }
        "rhydon" -> {
            "https://iili.io/K6UunI.png"
        }
        "rhyperior" -> {
            "https://iili.io/KIStWb.png"
        }
        "gothita" -> {
            "https://iili.io/KIStWb.png"
        }
        "gothorita" -> {
            "https://iili.io/K6UunI.png"
        }
        "gothitelle" -> {
            "https://iili.io/KIStWb.png"
        }
        "solosis" -> {
            "https://iili.io/KIStWb.png"
        }
        "duosion" -> {
            "https://iili.io/K6UunI.png"
        }
        "reuniclus" -> {
            "https://iili.io/KIStWb.png"
        }
        "karrablast" -> {
            "https://iili.io/KIStWb.png"
        }
        "escavalier" -> {
            "https://iili.io/K6UunI.png"
        }
        "shelmet" -> {
            "https://iili.io/KIStWb.png"
        }
        "accelgor" -> {
            "https://iili.io/KIStWb.png"
        }
        "elgyem" -> {
            "https://iili.io/K6UunI.png"
        }
        "beheeyem" -> {
            "https://iili.io/KIStWb.png"
        }
        "cubchoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "beartic" -> {
            "https://iili.io/K6UunI.png"
        }
        "rufflet" -> {
            "https://iili.io/KIStWb.png"
        }
        "braviary" -> {
            "https://iili.io/KIStWb.png"
        }
        "vullaby" -> {
            "https://iili.io/K6UunI.png"
        }
        "mandibuzz" -> {
            "https://iili.io/KIStWb.png"
        }
        "skorupi" -> {
            "https://iili.io/KIStWb.png"
        }
        "drapion" -> {
            "https://iili.io/K6UunI.png"
        }
        "litwick" -> {
            "https://iili.io/KIStWb.png"
        }
        "lampent" -> {
            "https://iili.io/KIStWb.png"
        }
        "chandelure" -> {
            "https://iili.io/K6UunI.png"
        }
        "inkay" -> {
            "https://iili.io/KIStWb.png"
        }
        "malamar" -> {
            "https://iili.io/KIStWb.png"
        }
        "sneasel" -> {
            "https://iili.io/K6UunI.png"
        }
        "weavile" -> {
            "https://iili.io/KIStWb.png"
        }
        "sableye" -> {
            "https://iili.io/KIStWb.png"
        }
        "mawile" -> {
            "https://iili.io/K6UunI.png"
        }
        "maractus" -> {
            "https://iili.io/KIStWb.png"
        }
        "sigilyph" -> {
            "https://iili.io/KIStWb.png"
        }
        "riolu" -> {
            "https://iili.io/K6UunI.png"
        }
        "lucario" -> {
            "https://iili.io/KIStWb.png"
        }
        "torkoal" -> {
            "https://iili.io/KIStWb.png"
        }
        "mimikyu" -> {
            "https://iili.io/K6UunI.png"
        }
        "cufant" -> {
            "https://iili.io/KIStWb.png"
        }
        "copperajah" -> {
            "https://iili.io/KIStWb.png"
        }
        "qwilfish" -> {
            "https://iili.io/K6UunI.png"
        }
        "frillish" -> {
            "https://iili.io/KIStWb.png"
        }
        "jellicent" -> {
            "https://iili.io/KIStWb.png"
        }
        "mareanie" -> {
            "https://iili.io/K6UunI.png"
        }
        "toxapex" -> {
            "https://iili.io/KIStWb.png"
        }
        "cramorant" -> {
            "https://iili.io/KIStWb.png"
        }
        "toxel" -> {
            "https://iili.io/K6UunI.png"
        }
        "toxtricity" -> {
            "https://iili.io/KIStWb.png"
        }
        "silicobra" -> {
            "https://iili.io/KIStWb.png"
        }
        "sandaconda" -> {
            "https://iili.io/K6UunI.png"
        }
        "hippopotas" -> {
            "https://iili.io/KIStWb.png"
        }
        "hippowdon" -> {
            "https://iili.io/KIStWb.png"
        }
        "durant" -> {
            "https://iili.io/K6UunI.png"
        }
        "heatmor" -> {
            "https://iili.io/KIStWb.png"
        }
        "helioptile" -> {
            "https://iili.io/KIStWb.png"
        }
        "heliolisk" -> {
            "https://iili.io/K6UunI.png"
        }
        "hawlucha" -> {
            "https://iili.io/KIStWb.png"
        }
        "trapinch" -> {
            "https://iili.io/KIStWb.png"
        }
        "vibrava" -> {
            "https://iili.io/K6UunI.png"
        }
        "flygon" -> {
            "https://iili.io/KIStWb.png"
        }
        "axew" -> {
            "https://iili.io/KIStWb.png"
        }
        "fraxure" -> {
            "https://iili.io/K6UunI.png"
        }
        "haxorus" -> {
            "https://iili.io/KIStWb.png"
        }
        "yamask" -> {
            "https://iili.io/KIStWb.png"
        }
        "runerigus" -> {
            "https://iili.io/K6UunI.png"
        }
        "cofagrigus" -> {
            "https://iili.io/KIStWb.png"
        }
        "honedge" -> {
            "https://iili.io/KIStWb.png"
        }
        "doublade" -> {
            "https://iili.io/K6UunI.png"
        }
        "aegislash" -> {
            "https://iili.io/KIStWb.png"
        }
        "ponyta" -> {
            "https://iili.io/KIStWb.png"
        }
        "rapidash" -> {
            "https://iili.io/K6UunI.png"
        }
        "sinistea" -> {
            "https://iili.io/KIStWb.png"
        }
        "polteageist" -> {
            "https://iili.io/KIStWb.png"
        }
        "indeedee" -> {
            "https://iili.io/K6UunI.png"
        }
        "phantump" -> {
            "https://iili.io/KIStWb.png"
        }
        "trevenant" -> {
            "https://iili.io/KIStWb.png"
        }
        "morelull" -> {
            "https://iili.io/K6UunI.png"
        }
        "shiinotic" -> {
            "https://iili.io/KIStWb.png"
        }
        "oranguru" -> {
            "https://iili.io/KIStWb.png"
        }
        "passimian" -> {
            "https://iili.io/K6UunI.png"
        }
        "morpeko" -> {
            "https://iili.io/KIStWb.png"
        }
        "falinks" -> {
            "https://iili.io/KIStWb.png"
        }
        "drampa" -> {
            "https://iili.io/K6UunI.png"
        }
        "turtonator" -> {
            "https://iili.io/KIStWb.png"
        }
        "togedemaru" -> {
            "https://iili.io/KIStWb.png"
        }
        "snom" -> {
            "https://iili.io/K6UunI.png"
        }
        "frosmoth" -> {
            "https://iili.io/KIStWb.png"
        }
        "clobbopus" -> {
            "https://iili.io/KIStWb.png"
        }
        "grapploct" -> {
            "https://iili.io/K6UunI.png"
        }
        "pincurchin" -> {
            "https://iili.io/KIStWb.png"
        }
        "mantyke" -> {
            "https://iili.io/KIStWb.png"
        }
        "mantine" -> {
            "https://iili.io/K6UunI.png"
        }
        "wailmer" -> {
            "https://iili.io/KIStWb.png"
        }
        "wailord" -> {
            "https://iili.io/KIStWb.png"
        }
        "bergmite" -> {
            "https://iili.io/K6UunI.png"
        }
        "avalugg" -> {
            "https://iili.io/KIStWb.png"
        }
        "dhelmise" -> {
            "https://iili.io/KIStWb.png"
        }
        "lapras" -> {
            "https://iili.io/K6UunI.png"
        }
        "lunatone" -> {
            "https://iili.io/KIStWb.png"
        }
        "solrock" -> {
            "https://iili.io/KIStWb.png"
        }
        "mime-jr" -> {
            "https://iili.io/K6UunI.png"
        }
        "mr-mime" -> {
            "https://iili.io/KIStWb.png"
        }
        "mr-rime" -> {
            "https://iili.io/KIStWb.png"
        }
        "darumaka" -> {
            "https://iili.io/K6UunI.png"
        }
        "darmanitan" -> {
            "https://iili.io/KIStWb.png"
        }
        "stonjourner" -> {
            "https://iili.io/KIStWb.png"
        }
        "eiscue" -> {
            "https://iili.io/K6UunI.png"
        }
        "duraludon" -> {
            "https://iili.io/KIStWb.png"
        }
        "rotom" -> {
            "https://iili.io/KIStWb.png"
        }
        "ditto" -> {
            "https://iili.io/K6UunI.png"
        }
        "dracozolt" -> {
            "https://iili.io/KIStWb.png"
        }
        "arctozolt" -> {
            "https://iili.io/KIStWb.png"
        }
        "dracovish" -> {
            "https://iili.io/K6UunI.png"
        }
        "arctovish" -> {
            "https://iili.io/KIStWb.png"
        }
        "charmander" -> {
            "https://iili.io/KIStWb.png"
        }
        "charmeleon" -> {
            "https://iili.io/K6UunI.png"
        }
        "charizard" -> {
            "https://iili.io/KIStWb.png"
        }
        "typenull" -> {
            "https://iili.io/KIStWb.png"
        }
        "silvally" -> {
            "https://iili.io/K6UunI.png"
        }
        "larvitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "pupitar" -> {
            "https://iili.io/KIStWb.png"
        }
        "tyranitar" -> {
            "https://iili.io/K6UunI.png"
        }
        "deino" -> {
            "https://iili.io/KIStWb.png"
        }
        "zweilous" -> {
            "https://iili.io/KIStWb.png"
        }
        "hydreigon" -> {
            "https://iili.io/K6UunI.png"
        }
        "goomy" -> {
            "https://iili.io/KIStWb.png"
        }
        "sliggoo" -> {
            "https://iili.io/KIStWb.png"
        }
        "goodra" -> {
            "https://iili.io/K6UunI.png"
        }
        "jangmo-o" -> {
            "https://iili.io/KIStWb.png"
        }
        "hakamo-o" -> {
            "https://iili.io/KIStWb.png"
        }
        "kommo-o" -> {
            "https://iili.io/K6UunI.png"
        }
        "dreepy" -> {
            "https://iili.io/KIStWb.png"
        }
        "drakloak" -> {
            "https://iili.io/KIStWb.png"
        }
        "dragapult" -> {
            "https://iili.io/K6UunI.png"
        }
        "zacian" -> {
            "https://iili.io/KIStWb.png"
        }
        "zamazenta" -> {
            "https://iili.io/KIStWb.png"
        }
        "eternatus" -> {
            "https://iili.io/K6UunI.png"
        }
        else -> {
            "https://iili.io/KIStWb.png"
        }
    }
}

/*
    Description:
    Get the valid url to get the new json, replace the common string to only get the rest of the url
    Common URL: https://pokeapi.co/api/
    Example:
    Url: https://pokeapi.co/api/v2/pokedexes/2/
    we need only the string after the ..api/ then we replace all the text before the v2 doing that we get only v2/pokedexes/2/ and return it.
 */
fun String.toFormatURL(): String {
    return replace("https://pokeapi.co/api/", "")
}

/*
 Transform simple string to a valid format from types enum
*/
fun String.toValidFormatTypesEnum(): String {
    return this.toUpperCase(Locale.ROOT).replace('-', '_')
}

/*
This function get the images from te urls by game name
*/
fun String.getUrlsByGameName(): GameImageUrls {
    return when (this) {
        "red-blue" -> {
            GameImageUrls(
                "https://iili.io/30SqpR.png",
                "https://iili.io/3MQj5l.png",
                "https://iili.io/3t30qN.png",
                "https://iili.io/3jSJb1.png",
                "https://iili.io/3jSJb1.png"
            )
        }
        "yellow" -> {
            GameImageUrls(
                "https://iili.io/30Sfkv.png",
                "https://iili.io/3jSh1j.png",
                "https://iili.io/3t3csp.png",
                "https://iili.io/3jSQpI.png",
                "https://iili.io/3jSQpI.png"
            )
        }
        "gold-silver" -> {
            GameImageUrls(
                "https://iili.io/30SCIp.png",
                "https://iili.io/3jgSfa.png",
                "https://iili.io/3t3Yzv.png",
                "https://iili.io/3jrLkQ.png",
                "https://iili.io/3jrLkQ.png"
            )
        }
        "crystal" -> {
            GameImageUrls(
                "https://iili.io/30SV3u.png",
                "https://iili.io/3j4fjI.png",
                "https://iili.io/3jr2z7.png",
                "https://iili.io/3jrLkQ.png",
                "https://iili.io/3jrLkQ.png"
            )
        }
        "ruby-sapphire" -> {
            GameImageUrls(
                "https://iili.io/30SvG1.png",
                "https://iili.io/3jPBgs.png",
                "https://iili.io/344p5l.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "emerald" -> {
            GameImageUrls(
                "https://iili.io/30Uo9j.png",
                "https://iili.io/34iEfn.png",
                "https://iili.io/344p5l.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "firered-leafgreen" -> {
            GameImageUrls(
                "https://iili.io/30UVVI.png",
                "https://iili.io/3sNw8B.png",
                "https://iili.io/3sNDns.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "diamond-pearl" -> {
            GameImageUrls(
                "https://iili.io/30USx2.png",
                "https://iili.io/3seCzX.png",
                "https://iili.io/3seVdQ.jpg",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "platinum" -> {
            GameImageUrls(
                "https://iili.io/30UZDQ.png",
                "https://iili.io/3skuCg.png",
                "https://iili.io/3seVdQ.jpg",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "heartgold-soulsilver" -> {
            GameImageUrls(
                "https://iili.io/30g90F.png",
                "https://iili.io/3s85ep.png",
                "https://iili.io/3s8t4a.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "black-white" -> {
            GameImageUrls(
                "https://iili.io/30gjLB.png",
                "https://iili.io/3sUYiX.png",
                "https://iili.io/3sQuOg.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "colosseum" -> {
            GameImageUrls(
                "https://iili.io/30rfkb.png",
                "https://iili.io/3t9QZN.png",
                "https://iili.io/3tJxft.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "xd" -> {
            GameImageUrls(
                "https://iili.io/30rCTx.png",
                "https://iili.io/3td68u.png",
                "https://iili.io/3tFqYX.jpg",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "black-2-white-2" -> {
            GameImageUrls(
                "https://iili.io/30rWan.png",
                "https://iili.io/3tKvRe.png",
                "https://iili.io/3tC0Bf.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "x-y" -> {
            GameImageUrls(
                "https://iili.io/306cqN.png",
                "https://iili.io/3tAfVt.png",
                "https://iili.io/3tA5W7.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "omega-ruby-alpha-sapphire" -> {
            GameImageUrls(
                "https://iili.io/30rNj4.png",
                "https://iili.io/3tlxBp.png",
                "https://iili.io/3t0jSt.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "sun-moon" -> {
            GameImageUrls(
                "https://iili.io/304HAJ.png",
                "https://iili.io/3tGuVf.png",
                "https://iili.io/3tEChb.webp",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "ultra-sun-ultra-moon" -> {
            GameImageUrls(
                "https://iili.io/304KPI.png",
                "https://iili.io/3tjy0b.png",
                "https://iili.io/3tNPN2.jpg",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "lets-go" -> {
            GameImageUrls(
                "https://iili.io/304aSe.png",
                "https://iili.io/3tvVsI.png",
                "https://iili.io/3t8k3F.webp",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        "sword-shield" -> {
            GameImageUrls(
                "https://iili.io/3040Ab.png",
                "https://iili.io/3tUrqN.png",
                "https://iili.io/3tgd7e.png",
                "https://iili.io/34g1I9.png",
                "https://iili.io/34r0aR.png"
            )
        }
        else -> {
            GameImageUrls(
                "https://iili.io/304jl1.jpg",
                "https://iili.io/304jl1.jpg",
                "https://iili.io/304jl1.jpg",
                "https://iili.io/304jl1.jpg",
                "https://iili.io/304jl1.jpg"
            )
        }
    }
}