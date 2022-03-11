package com.sargis.khlopuzyan.unittesting.repositories

import androidx.lifecycle.LiveData
import com.sargis.khlopuzyan.unittesting.data.local.ShoppingItem
import com.sargis.khlopuzyan.unittesting.data.remote.responses.ImageResponse
import com.sargis.khlopuzyan.unittesting.other.Resource

/**
 * Created by Sargis Khlopuzyan on 3/10/2022.
 */
interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}