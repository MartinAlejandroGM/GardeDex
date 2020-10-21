package com.example.pokedix.extensions

import android.widget.ImageView
import com.example.pokedix.R
import com.squareup.picasso.Picasso

fun ImageView.setImageGenerationsPicasso(gameName: String) {
    var imageUrl: String = ""
    when (gameName) {
        "red-blue" -> {
            imageUrl = "https://iili.io/30SqpR.png"
        }
        "yellow" -> {
            imageUrl = "https://iili.io/30Sfkv.png"
        }
        "gold-silver" -> {
            imageUrl = "https://iili.io/30SCIp.png"
        }
        "crystal" -> {
            imageUrl = "https://iili.io/30SV3u.png"
        }
        "ruby-sapphire" -> {
            imageUrl  = "https://iili.io/30SvG1.png"
        }
        "emerald" -> {
            imageUrl  = "https://iili.io/30Uo9j.png"
        }
        "firered-leafgreen" -> {
            imageUrl  = "https://iili.io/30UVVI.png"
        }
        "diamond-pearl" -> {
            imageUrl  = "https://iili.io/30USx2.png"
        }
        "platinum" -> {
            imageUrl  = "https://iili.io/30UZDQ.png"
        }
        "heartgold-soulsilver" -> {
            imageUrl  = "https://iili.io/30g90F.png"
        }
        "black-white" -> {
            imageUrl  = "https://iili.io/30gjLB.png"
        }
        "colosseum" -> {
            imageUrl  = "https://iili.io/30rfkb.png"
        }
        "xd" -> {
            imageUrl  = "https://iili.io/30rCTx.png"
        }
        "black-2-white-2" -> {
            imageUrl  = "https://iili.io/30rWan.png"
        }
        "x-y" -> {
            imageUrl  = "https://iili.io/306cqN.png"
        }
        "omega-ruby-alpha-sapphire" -> {
            imageUrl  = "https://iili.io/30rNj4.png"
        }
        "sun-moon" -> {
            imageUrl  = "https://iili.io/304HAJ.png"
        }
        "ultra-sun-ultra-moon" -> {
            imageUrl  = "https://iili.io/304KPI.png"
        }
        "lets-go" -> {
            imageUrl  = "https://iili.io/304aSe.png"
        }
        "sword-shield" -> {
            imageUrl  = "https://iili.io/3040Ab.png"
        }
        else -> {
            imageUrl = "https://iili.io/304jl1.jpg"
        }
    }

    Picasso.get()
        .load(imageUrl)
        .error(R.drawable.ic_launcher_background)
        .into(this)
}