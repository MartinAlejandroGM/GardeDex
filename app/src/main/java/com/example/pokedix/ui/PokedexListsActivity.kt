package com.example.pokedix.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pokedix.extensions.observe
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.PokedexAdapter
import com.example.pokedix.models.GameList
import com.example.pokedix.viewmodel.PokedexViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_options_g_s.*

class PokedexListsActivity : AppCompatActivity() {
    private lateinit var viewModel: PokedexViewModel
    private lateinit var pokeAdapter: PokedexAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description_lists)

        setSupportActionBar(details_activity_toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details_activity_toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        val pokedex: GameList? = intent.getParcelableExtra(ARG_POKEDEX_KEY)

        viewModel = PokedexViewModel(application)
        observePokedex()
        initRecyclerView()
        pokedex?.let {
            viewModel.fetchPokedex(it.url)
        }
    }

    private fun initRecyclerView() {
        poke_list_recycler.apply {
            layoutManager = GridLayoutManager(this@PokedexListsActivity,4)
            pokeAdapter = PokedexAdapter()
            adapter = pokeAdapter
            pokeAdapter.onListClickListener = {
                val pokemonInstance = PokemonDescriptionDialog.newInstance(it)
                pokemonInstance.show(supportFragmentManager, "PokemonFragment")
                Toast.makeText(this@PokedexListsActivity, it.pokemonName, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun observePokedex() {
        viewModel.pokedexLiveData.observe(this, {
            pokeAdapter.submitList(it)
        }, {
        })
    }

    companion object{
        private const val NAMESPACE = "com.example.pokedix.ui"
        private const val ARG_POKEDEX_KEY = "${NAMESPACE}.pokedex"

        fun getIntent(context: Context, pokedex: GameList): Intent {
            return Intent(context, PokedexListsActivity::class.java).apply {
                putExtra(ARG_POKEDEX_KEY, pokedex)
            }

        }
    }
}