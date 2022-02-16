package com.example.rickandmortycharacters.domain.usecases

import androidx.lifecycle.LiveData
import com.example.rickandmortycharacters.domain.models.Character
import com.example.rickandmortycharacters.domain.repository.CharacterRepository

/**
 * @author Evdokimov on 16.02.2022.
 */
class GetCharactersListUseCase(private val repository: CharacterRepository) {

    operator fun invoke(): LiveData<Character> = repository.getCharacterList()
}