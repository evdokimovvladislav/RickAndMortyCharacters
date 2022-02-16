package com.example.rickandmortycharacters.data.network

import com.example.rickandmortycharacters.data.network.models.BaseResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Evdokimov on 16.02.2022.
 */
interface CharactersApiService {

    @GET("character/")
    suspend fun getCharacters(
        @Query("page") page: Int,
    ): BaseResponseDto
}