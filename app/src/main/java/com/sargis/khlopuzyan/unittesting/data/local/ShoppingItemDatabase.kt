package com.sargis.khlopuzyan.unittesting.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Sargis Khlopuzyan on 3/9/2022.
 */
@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingItemDatabase : RoomDatabase() {
    abstract fun shoppingDao(): ShoppingDao
}