package com.example.pokedix.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedix.R
import com.example.pokedix.models.Results
import kotlinx.android.synthetic.main.poke_list_layout.view.*

class PokeRVAdapter: RecyclerView.Adapter<PokeRVAdapter.PokeViewHolder>() {
    private var pokeList = ArrayList<Results>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {
        return PokeViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.poke_list_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {
        holder.pokeBind(pokeList[position])
    }

    fun submitList(pokemonList: List<Results>, shouldClear: Boolean = false) {
        if (shouldClear) {
            pokeList.clear()
        }
        pokeList.addAll(pokemonList)
        notifyDataSetChanged()
    }

    override fun getItemCount() = pokeList.size

    inner class PokeViewHolder constructor(v: View): RecyclerView.ViewHolder(v) {
        fun pokeBind(results: Results) = itemView.run{
            poke_name.text = results.name
            poke_type.text = results.url
        }
    }
}