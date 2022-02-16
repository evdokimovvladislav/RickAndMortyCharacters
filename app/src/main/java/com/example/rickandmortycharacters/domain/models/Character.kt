package com.example.rickandmortycharacters.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Evdokimov on 16.02.2022.
 */
@Parcelize
data class Character(
    val imageUrl: String,
    val name: String,
    val location: String,
    val type: String,
    val status: String
) : Parcelable