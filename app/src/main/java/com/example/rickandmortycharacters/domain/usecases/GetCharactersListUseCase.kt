package com.example.rickandmortycharacters.domain.usecases

import com.example.rickandmortycharacters.domain.models.Character
import com.example.rickandmortycharacters.domain.repository.CharacterRepository

/**
 * @author Evdokimov on 16.02.2022.
 */
class GetCharactersListUseCase(private val repository: CharacterRepository) {

    suspend operator fun invoke(page: Int): List<Character> = repository.getCharacterList(page)
}