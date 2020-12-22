package com.example.pokedix.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.PokemonListsRVAdapter
import com.example.pokedix.models.GamesList
import com.example.pokedix.viewmodel.PokedexViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_options_g_s.*

class DescriptionListsActivity : AppCompatActivity() {
    private lateinit var viewModel: PokedexViewModel
    private lateinit var pokeAdapter: PokemonListsRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description_lists)

        setSupportActionBar(details_activity_toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details_activity_toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        val pokedex: GamesList? = intent.getParcelableExtra("pokedex")

        viewModel = PokedexViewModel(application)
        observeGames()
        initRecyclerView()
        pokedex?.let {
            viewModel.fetchPokedex(it.url)
        }
    }

    private fun initRecyclerView() {
        poke_list_recycler.apply {
            layoutManager = GridLayoutManager(this@DescriptionListsActivity,4)
            pokeAdapter = PokemonListsRVAdapter()
            adapter = pokeAdapter
            pokeAdapter.onListClickListener = {
                val pokemonInstance = PokemonDescriptionDialog.newInstance(it)
                pokemonInstance.show(supportFragmentManager, "PokemonFragment")
                Toast.makeText(this@DescriptionListsActivity, it.name, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun observeGames() {
        viewModel.pokedexLiveData.observe(this, Observer {
            pokeAdapter.submitList(it)
        })
    }

    companion object{
        private const val ARG_POKEDEX_KEY = "pokedex"

        fun getIntent(context: Context, pokedex: GamesList): Intent {
            return Intent(context, DescriptionListsActivity::class.java).apply {
                putExtra(ARG_POKEDEX_KEY, pokedex)
            }

        }
    }
}