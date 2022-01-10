package com.skydoves.pokedexar.database

import com.google.android.filament.Box
import retrofit2.Call
import retrofit2.http.*

interface GachaService{

    @POST("/pokemon/gacha/")
    fun requestBoxList(
        @Header("Authorization") token: String,
    ) : Call<BoxData>
}