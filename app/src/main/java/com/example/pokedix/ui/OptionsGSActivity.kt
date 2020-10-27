package com.example.pokedix.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokedix.R
import com.example.pokedix.extensions.setImageGenerationsPicasso
import com.example.pokedix.models.GameListResponse
import com.example.pokedix.models.GamesList
import com.example.pokedix.models.Results
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_options_g_s.*

class OptionsGSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_g_s)

        setSupportActionBar(details_activity_toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details_activity_toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        val game: GamesList? = intent.getParcelableExtra("game")

        game?.let {
            Picasso.get()
                .load(it.gameListUrls.gameStartScreen)
                .error(R.drawable.ic_launcher_background)
                .into(background_screen)

            Picasso.get()
                .load(it.gameListUrls.pokemonImage)
                .error(R.drawable.ic_launcher_background)
                .into(pokemon)
            Picasso.get()
                .load(game.gameListUrls.itemsImage)
                .error(R.drawable.ic_launcher_background)
                .into(items)
            Picasso.get()
                .load(game.gameListUrls.machinesImage)
                .error(R.drawable.ic_launcher_background)
                .into(machines)
        }
    }

    companion object{
        private const val ARG_game_KEY = "game"

        fun getIntent(context: Context, game: GamesList): Intent {
            return Intent(context, OptionsGSActivity::class.java).apply {
                putExtra(ARG_game_KEY, game)
            }

        }
    }
}