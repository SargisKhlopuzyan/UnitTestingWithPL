package com.sargis.khlopuzyan.unittesting.data.remote.responses

/**
 * Created by Sargis Khlopuzyan on 3/10/2022.
 */
data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)