package com.example.rickandmortycharacters.data.network.models

data class InfoDto(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)