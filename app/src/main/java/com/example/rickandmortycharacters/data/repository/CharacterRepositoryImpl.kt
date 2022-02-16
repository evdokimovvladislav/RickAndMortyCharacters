package com.example.rickandmortycharacters.data.repository

import com.example.rickandmortycharacters.data.mappers.CharacterMapper
import com.example.rickandmortycharacters.data.network.CharactersApiService
import com.example.rickandmortycharacters.domain.models.Character
import com.example.rickandmortycharacters.domain.repository.CharacterRepository

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharacterRepositoryImpl(
    private val service: CharactersApiService,
    private val mapper: CharacterMapper
) : CharacterRepository {

    override suspend fun getCharacterList(page: Int): List<Character> =
        mapper.mapResponseDtoToEntityList(service.getCharacters(page))
}