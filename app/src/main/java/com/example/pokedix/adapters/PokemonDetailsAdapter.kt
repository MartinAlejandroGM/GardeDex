package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.models.PokemonDetails
import kotlinx.android.synthetic.main.description_layout.view.*
import kotlinx.android.synthetic.main.stats_layout.view.*

class PokemonDetailsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var pokemonD: PokemonDetails
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            POKEMON_DESCRIPTION -> {
                DescriptionViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.description_layout, parent, false)
                )
            }
            POKEMON_AREA -> {
                AreaViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.area_layout, parent, false)
                )
            }
            else -> {
                StatsViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.stats_layout, parent, false)
                )
            }
        }
    }

    fun submitPokemonDetails(pokemonDetails: PokemonDetails) {
        pokemonD = pokemonDetails

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DescriptionViewHolder -> {
                holder.detailsBind(pokemonD)
            }
            is AreaViewHolder -> {
                holder.areaBind(pokemonD)
            }
            is StatsViewHolder -> {
                holder.statsBind(pokemonD)
            }
        }
    }

    override fun getItemCount() = 3

    override fun getItemViewType(position: Int) = position

    inner class DescriptionViewHolder constructor(v: View) : RecyclerView.ViewHolder(v) {
        fun detailsBind(pokemon: PokemonDetails) = itemView.run {
            description.text = pokemon.pokeDescription
        }
    }

    inner class AreaViewHolder constructor(v: View) : RecyclerView.ViewHolder(v) {
        fun areaBind(pokemon: PokemonDetails) = itemView.run {

        }
    }

    inner class StatsViewHolder constructor(v: View) : RecyclerView.ViewHolder(v) {
        fun statsBind(pokemon: PokemonDetails) = itemView.run {
            hp.text = pokemon.baseStats.hp.toString()
            atk.text = pokemon.baseStats.atk.toString()
            def.text = pokemon.baseStats.def.toString()
            sa.text = pokemon.baseStats.sa.toString()
            sd.text = pokemon.baseStats.sd.toString()
            sp.text = pokemon.baseStats.sp.toString()
        }
    }

    companion object {
        private const val POKEMON_DESCRIPTION = 0
        private const val POKEMON_AREA = 1
    }
}