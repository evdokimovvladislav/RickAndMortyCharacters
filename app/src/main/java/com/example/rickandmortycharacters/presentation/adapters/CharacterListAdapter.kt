package com.example.rickandmortycharacters.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortycharacters.databinding.CharacterItemBinding
import com.example.rickandmortycharacters.domain.models.Character
import com.example.rickandmortycharacters.presentation.adapters.callbacks.CharacterDiffUtilCallback

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharacterListAdapter : ListAdapter<Character, CharacterListAdapter.CharacterViewHolder>(
    CharacterDiffUtilCallback()
) {

    var onClick: ((character: Character) -> Unit)? = null

    inner class CharacterViewHolder(private val binding: CharacterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(character: Character) = with(binding) {
            characterName.text = character.name

            root.setOnClickListener {
                onClick?.invoke(character)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CharacterViewHolder(
        CharacterItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}