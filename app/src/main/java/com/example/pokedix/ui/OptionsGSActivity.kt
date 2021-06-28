package com.example.pokedix.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pokedix.R
import com.example.pokedix.models.GameList
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

        val game: GameList? = intent.getParcelableExtra(ARG_GAME_KEY)

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
                .load(it.gameListUrls.itemsImage)
                .error(R.drawable.ic_launcher_background)
                .into(items)
            Picasso.get()
                .load(it.gameListUrls.machinesImage)
                .error(R.drawable.ic_launcher_background)
                .into(machines)
        }

        pokemon.setOnClickListener {
            val gameIntent = PokedexListsActivity.getIntent(this, game as GameList)
            startActivity(gameIntent)
            Toast.makeText(this, game.game.name, Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        private const val NAMESPACE = "com.example.pokedix.ui"
        private const val ARG_GAME_KEY = "${NAMESPACE}.game"

        fun getIntent(context: Context, game: GameList): Intent {
            return Intent(context, OptionsGSActivity::class.java).apply {
                putExtra(ARG_GAME_KEY, game)
            }

        }
    }
}