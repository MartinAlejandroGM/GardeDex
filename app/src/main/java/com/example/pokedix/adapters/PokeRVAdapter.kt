package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.models.PokedixType
import com.example.pokedix.models.Results
import kotlinx.android.synthetic.main.game_list_layout.view.*
import kotlinx.android.synthetic.main.poke_list_layout.view.*

private const val GAME_LIST_VALUE = 0
private const val OTHER_LIST_VALUE = 1
class PokeRVAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var pokeDixList = ArrayList<Results>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == OTHER_LIST_VALUE) {
            PokeViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.poke_list_layout, parent, false)
            )
        } else {
            GenerationsViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.game_list_layout, parent, false)
            )
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (pokeDixList[position].url.contains("version-group")) {
            GAME_LIST_VALUE
        } else {
            OTHER_LIST_VALUE
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GenerationsViewHolder -> {
                holder.generationsBind(pokeDixList[position])
            }
            is PokeViewHolder -> {
                holder.pokeBind(pokeDixList[position])
            }
        }
    }

    fun submitList(pokemonList: List<Results>, shouldClear: Boolean = false) {
        if (shouldClear) {
            pokeDixList.clear()
        }
        pokeDixList.addAll(pokemonList)
        notifyDataSetChanged()
    }

    override fun getItemCount() = pokeDixList.size

    inner class PokeViewHolder constructor(v: View) : RecyclerView.ViewHolder(v) {
        fun pokeBind(results: Results) = itemView.run {
            poke_name.text = results.name
            poke_type.text = results.url
        }
    }

    inner class GenerationsViewHolder constructor(v: View) : RecyclerView.ViewHolder(v){
        fun generationsBind(results: Results) = itemView.run {
            button_game.text = results.name
        }
    }
}