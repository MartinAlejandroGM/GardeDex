package com.example.pokedix.extensions

import android.widget.ImageView
import com.example.pokedix.R
import com.example.pokedix.models.GameImageUrls
import com.example.pokedix.models.GameTypes
import com.squareup.picasso.Picasso
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

fun String.toFormatGameTypesEnum(): String{
    return this.toUpperCase(Locale.ROOT).replace('-', '_')
}

fun String.getUrlsByGameName(): GameImageUrls {
    return when (this) {
        "red-blue" -> {
            GameImageUrls("https://iili.io/30SqpR.png", "https://iili.io/3MQj5l.png", "https://iili.io/3hbbP2.png","https://iili.io/3jSJb1.png", "https://iili.io/3jSJb1.png")
        }
        "yellow" -> {
            GameImageUrls("https://iili.io/30Sfkv.png", "https://iili.io/3jSh1j.png", "https://iili.io/3jUKT7.gif","https://iili.io/3jSQpI.png","https://iili.io/3jSQpI.png")
        }
        "gold-silver" -> {
            GameImageUrls("https://iili.io/30SCIp.png", "https://iili.io/3jgSfa.png", "https://iili.io/3jr2z7.png","https://iili.io/3jrLkQ.png","https://iili.io/3jrLkQ.png")
        }
        "crystal" -> {
            GameImageUrls("https://iili.io/30SV3u.png", "https://iili.io/3j4fjI.png", "https://iili.io/3jr2z7.png","https://iili.io/3jrLkQ.png","https://iili.io/3jrLkQ.png")
        }
        "ruby-sapphire" -> {
            GameImageUrls("https://iili.io/30SvG1.png", "https://iili.io/3jPBgs.png", "","","")
        }
        "emerald" -> {
            GameImageUrls("https://iili.io/30Uo9j.png", "", "","","")
        }
        "firered-leafgreen" -> {
            GameImageUrls("https://iili.io/30UVVI.png", "", "","","")
        }
        "diamond-pearl" -> {
            GameImageUrls("https://iili.io/30USx2.png", "", "","","")
        }
        "platinum" -> {
            GameImageUrls("https://iili.io/30UZDQ.png", "", "","","")
        }
        "heartgold-soulsilver" -> {
            GameImageUrls("https://iili.io/30g90F.png", "", "","","")
        }
        "black-white" -> {
            GameImageUrls("https://iili.io/30gjLB.png", "", "","","")
        }
        "colosseum" -> {
            GameImageUrls("https://iili.io/30rfkb.png", "", "","","")
        }
        "xd" -> {
            GameImageUrls("https://iili.io/30rCTx.png", "", "","","")
        }
        "black-2-white-2" -> {
            GameImageUrls("https://iili.io/30rWan.png", "", "","","")
        }
        "x-y" -> {
            GameImageUrls("https://iili.io/306cqN.png", "", "","","")
        }
        "omega-ruby-alpha-sapphire" -> {
            GameImageUrls("https://iili.io/30rNj4.png", "", "","","")
        }
        "sun-moon" -> {
            GameImageUrls("https://iili.io/304HAJ.png", "", "","","")
        }
        "ultra-sun-ultra-moon" -> {
            GameImageUrls("https://iili.io/304KPI.png", "", "","","")
        }
        "lets-go" -> {
            GameImageUrls("https://iili.io/304aSe.png", "", "","","")
        }
        "sword-shield" -> {
            GameImageUrls("https://iili.io/3040Ab.png", "", "","","")
        }
        else -> {
            GameImageUrls("https://iili.io/304jl1.jpg", "https://iili.io/304jl1.jpg", "https://iili.io/304jl1.jpg","https://iili.io/304jl1.jpg","https://iili.io/304jl1.jpg")
        }
    }
}