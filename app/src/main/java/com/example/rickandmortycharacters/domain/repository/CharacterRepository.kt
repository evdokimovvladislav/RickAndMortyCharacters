package com.example.rickandmortycharacters.domain.repository

import androidx.lifecycle.LiveData
import com.example.rickandmortycharacters.domain.models.Character

/**
 * @author Evdokimov on 16.02.2022.
 */
interface CharacterRepository {

    fun getCharacterList(): LiveData<Character>
}