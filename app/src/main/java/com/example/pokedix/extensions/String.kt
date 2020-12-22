package com.example.pokedix.extensions

import com.example.pokedix.models.GameImageUrls
import java.util.*

fun String.nameFormat(): String{

    val replacedString: String = this.replace('_', ' ', false)

    val words = replacedString.split(" ").toMutableList()

    val output = StringBuilder()

    for(word in words){
        output.append(word.toLowerCase(Locale.ROOT).capitalize(Locale.ROOT).plus(" "))
    }

    return output.toString()
}

/*
    Description:
    Get the valid url to get the new json, replace the common string to only get the rest of the url
    Common URL: https://pokeapi.co/api/
    Example:
    Url: https://pokeapi.co/api/v2/pokedexes/2/
    we need only the string after the ..api/ then we replace all the text before the v2 doing that we get only v2/pokedexes/2/ and return it.
 */
fun String.toFormatURL(): String{
    return replace("https://pokeapi.co/api/","")
}

fun String.toFormatGameTypesEnum(): String{
    return this.toUpperCase(Locale.ROOT).replace('-', '_')
}

fun String.getUrlsByPokemonName(): String {
    return ""
}

fun String.getUrlsByGameName(): GameImageUrls {
    return when (this) {
        "red-blue" -> {
            GameImageUrls("https://iili.io/30SqpR.png", "https://iili.io/3MQj5l.png", "https://iili.io/3t30qN.png","https://iili.io/3jSJb1.png", "https://iili.io/3jSJb1.png")
        }
        "yellow" -> {
            GameImageUrls("https://iili.io/30Sfkv.png", "https://iili.io/3jSh1j.png", "https://iili.io/3t3csp.png","https://iili.io/3jSQpI.png","https://iili.io/3jSQpI.png")
        }
        "gold-silver" -> {
            GameImageUrls("https://iili.io/30SCIp.png", "https://iili.io/3jgSfa.png", "https://iili.io/3t3Yzv.png","https://iili.io/3jrLkQ.png","https://iili.io/3jrLkQ.png")
        }
        "crystal" -> {
            GameImageUrls("https://iili.io/30SV3u.png", "https://iili.io/3j4fjI.png", "https://iili.io/3jr2z7.png","https://iili.io/3jrLkQ.png","https://iili.io/3jrLkQ.png")
        }
        "ruby-sapphire" -> {
            GameImageUrls("https://iili.io/30SvG1.png", "https://iili.io/3jPBgs.png", "https://iili.io/344p5l.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "emerald" -> {
            GameImageUrls("https://iili.io/30Uo9j.png", "https://iili.io/34iEfn.png", "https://iili.io/344p5l.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "firered-leafgreen" -> {
            GameImageUrls("https://iili.io/30UVVI.png", "https://iili.io/3sNw8B.png", "https://iili.io/3sNDns.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "diamond-pearl" -> {
            GameImageUrls("https://iili.io/30USx2.png", "https://iili.io/3seCzX.png", "https://iili.io/3seVdQ.jpg","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "platinum" -> {
            GameImageUrls("https://iili.io/30UZDQ.png", "https://iili.io/3skuCg.png", "https://iili.io/3seVdQ.jpg","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "heartgold-soulsilver" -> {
            GameImageUrls("https://iili.io/30g90F.png", "https://iili.io/3s85ep.png", "https://iili.io/3s8t4a.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "black-white" -> {
            GameImageUrls("https://iili.io/30gjLB.png", "https://iili.io/3sUYiX.png", "https://iili.io/3sQuOg.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "colosseum" -> {
            GameImageUrls("https://iili.io/30rfkb.png", "https://iili.io/3t9QZN.png", "https://iili.io/3tJxft.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "xd" -> {
            GameImageUrls("https://iili.io/30rCTx.png", "https://iili.io/3td68u.png", "https://iili.io/3tFqYX.jpg","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "black-2-white-2" -> {
            GameImageUrls("https://iili.io/30rWan.png", "https://iili.io/3tKvRe.png", "https://iili.io/3tC0Bf.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "x-y" -> {
            GameImageUrls("https://iili.io/306cqN.png", "https://iili.io/3tAfVt.png", "https://iili.io/3tA5W7.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "omega-ruby-alpha-sapphire" -> {
            GameImageUrls("https://iili.io/30rNj4.png", "https://iili.io/3tlxBp.png", "https://iili.io/3t0jSt.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "sun-moon" -> {
            GameImageUrls("https://iili.io/304HAJ.png", "https://iili.io/3tGuVf.png", "https://iili.io/3tEChb.webp","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "ultra-sun-ultra-moon" -> {
            GameImageUrls("https://iili.io/304KPI.png", "https://iili.io/3tjy0b.png", "https://iili.io/3tNPN2.jpg","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "lets-go" -> {
            GameImageUrls("https://iili.io/304aSe.png", "https://iili.io/3tvVsI.png", "https://iili.io/3t8k3F.webp","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        "sword-shield" -> {
            GameImageUrls("https://iili.io/3040Ab.png", "https://iili.io/3tUrqN.png", "https://iili.io/3tgd7e.png","https://iili.io/34g1I9.png","https://iili.io/34r0aR.png")
        }
        else -> {
            GameImageUrls("https://iili.io/304jl1.jpg", "https://iili.io/304jl1.jpg", "https://iili.io/304jl1.jpg","https://iili.io/304jl1.jpg","https://iili.io/304jl1.jpg")
        }
    }
}