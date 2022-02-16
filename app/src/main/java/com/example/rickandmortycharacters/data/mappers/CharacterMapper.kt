package com.example.rickandmortycharacters.data.mappers

import com.example.rickandmortycharacters.data.network.models.BaseResponseDto
import com.example.rickandmortycharacters.data.network.models.CharacterDto
import com.example.rickandmortycharacters.domain.models.Character

/**
 * @author Evdokimov on 16.02.2022.
 */
class CharacterMapper {

    fun mapResponseDtoToEntityList(dto: BaseResponseDto): List<Character> = dto.list.map {
        mapCharacterDtoToEntity(it)
    }

    private fun mapCharacterDtoToEntity(characterDto: CharacterDto) = Character(
        imageUrl = characterDto.image,
        name = characterDto.name,
        location = characterDto.location.name,
        type = characterDto.type,
        status = characterDto.status
    )
}