package com.sargis.khlopuzyan.unittesting.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Sargis Khlopuzyan on 3/9/2022.
 */
@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name: String,
    var amount: Int,
    var price: Float,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)
