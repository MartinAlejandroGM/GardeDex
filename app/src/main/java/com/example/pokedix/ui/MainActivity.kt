package com.example.pokedix.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedix.extensions.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedix.R
import com.example.pokedix.adapters.GameAdapter
import com.example.pokedix.databinding.ActivityMainBinding
import com.example.pokedix.viewmodel.GamesListViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: GamesListViewModel
    private lateinit var pokeAdapter: GameAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = GamesListViewModel(application)
        observeGames()
        initRecyclerView()
        viewModel.fetchGame()

        binding.mainActivityToolbar.setTitle(R.string.app_name)
        setSupportActionBar(binding.mainActivityToolbar)
    }

    private fun initRecyclerView() {
        binding.pokeListRecycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            pokeAdapter = GameAdapter()
            adapter = pokeAdapter
            pokeAdapter.onPokeDixClickListener = {
                val gameIntent = OptionsGSActivity.getIntent(this@MainActivity, it)
                startActivity(gameIntent)
            }
        }
    }

    private fun observeGames() {
        viewModel.gameLiveData.observe(this, { games ->
            pokeAdapter.submitList(games)
        }, {
        })
    }
}