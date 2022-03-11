package com.sargis.khlopuzyan.unittesting.data.remote

import com.sargis.khlopuzyan.unittesting.BuildConfig
import com.sargis.khlopuzyan.unittesting.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Sargis Khlopuzyan on 3/10/2022.
 */
interface PixabayAPI {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ): Response<ImageResponse>

}