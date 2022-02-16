package com.example.rickandmortycharacters.data.network.models

data class BaseResponseDto(
    val info: InfoDto,
    val list: List<CharacterDto>
)