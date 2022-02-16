package com.example.rickandmortycharacters.domain.models

/**
 * @author Evdokimov on 16.02.2022.
 */
data class Character(
    val imageUrl: String,
    val name: String,
    val location: String,
    val type: String,
    val status: String
)