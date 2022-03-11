package com.sargis.khlopuzyan.unittesting.di

import android.content.Context
import androidx.room.Room
import com.sargis.khlopuzyan.unittesting.data.local.ShoppingDao
import com.sargis.khlopuzyan.unittesting.data.local.ShoppingItemDatabase
import com.sargis.khlopuzyan.unittesting.data.remote.PixabayAPI
import com.sargis.khlopuzyan.unittesting.other.Constants.BASE_URL
import com.sargis.khlopuzyan.unittesting.other.Constants.DATABASE_NAME
import com.sargis.khlopuzyan.unittesting.repositories.DefaultShoppingRepository
import com.sargis.khlopuzyan.unittesting.repositories.ShoppingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Sargis Khlopuzyan on 3/10/2022.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideShoppingItemDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, ShoppingItemDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideShoppingDao(
        database: ShoppingItemDatabase
    ) = database.shoppingDao()

    @Singleton
    @Provides
    fun providePixabayApi(): PixabayAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PixabayAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideDefaultShoppingRepository(
        dao: ShoppingDao,
        api: PixabayAPI
    ) = DefaultShoppingRepository(dao, api) as ShoppingRepository

}