package com.example.rickandmortycharacters.presentation.adapters.callbacks

import androidx.recyclerview.widget.DiffUtil
import com.example.rickandmortycharacters.domain.models.Character

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharacterDiffUtilCallback : DiffUtil.ItemCallback<Character>() {

    override fun areItemsTheSame(oldItem: Character, newItem: Character) =
        oldItem.name == newItem.name

    override fun areContentsTheSame(oldItem: Character, newItem: Character) = oldItem == newItem
}