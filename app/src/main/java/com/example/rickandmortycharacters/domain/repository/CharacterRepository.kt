package com.example.rickandmortycharacters.domain.repository

import com.example.rickandmortycharacters.domain.models.Character

/**
 * @author Evdokimov on 16.02.2022.
 */
interface CharacterRepository {

    suspend fun getCharacterList(page: Int): List<Character>
}