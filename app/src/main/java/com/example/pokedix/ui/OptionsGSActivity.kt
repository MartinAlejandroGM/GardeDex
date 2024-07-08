package com.example.pokedix.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pokedix.R
import com.example.pokedix.databinding.ActivityOptionsGSBinding
import com.example.pokedix.models.GameList
import com.squareup.picasso.Picasso

class OptionsGSActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOptionsGSBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionsGSBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.detailsActivityToolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.detailsActivityToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        val game: GameList? = intent.getParcelableExtra(ARG_GAME_KEY)

        game?.let {
            Picasso.get()
                .load(it.gameListUrls.startScreen)
                .error(R.drawable.ic_launcher_background)
                .into(binding.backgroundScreen)

            Picasso.get()
                .load(it.gameListUrls.pokemonImage)
                .error(R.drawable.ic_launcher_background)
                .into(binding.pokemon)
            Picasso.get()
                .load(it.gameListUrls.itemsImage)
                .error(R.drawable.ic_launcher_background)
                .into(binding.items)
            Picasso.get()
                .load(it.gameListUrls.machinesImage)
                .error(R.drawable.ic_launcher_background)
                .into(binding.machines)
        }

        binding.pokemon.setOnClickListener {
            val gameIntent = PokedexListsActivity.getIntent(this, game as GameList)
            startActivity(gameIntent)
            Toast.makeText(this, game.name, Toast.LENGTH_SHORT).show()
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