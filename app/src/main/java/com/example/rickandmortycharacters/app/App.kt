package com.example.rickandmortycharacters.app

import android.app.Application
import com.example.rickandmortycharacters.data.network.CharactersApiService
import com.example.rickandmortycharacters.data.network.NetworkConst
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Evdokimov on 17.02.2022.
 */
class App : Application() {

    private lateinit var retrofit: Retrofit

    val api: CharactersApiService by lazy { retrofit.create(CharactersApiService::class.java) }

    override fun onCreate() {
        super.onCreate()

        retrofit = Retrofit.Builder()
            .baseUrl(NetworkConst.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}