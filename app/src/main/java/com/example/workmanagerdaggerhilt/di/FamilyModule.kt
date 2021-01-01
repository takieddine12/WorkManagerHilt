package com.example.workmanagerdaggerhilt.di

import android.content.Context
import androidx.room.Room
import com.example.workmanagerdaggerhilt.room.FamilyDao
import com.example.workmanagerdaggerhilt.room.FamilyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object FamilyModule {


    @Singleton
    @Provides
    fun provideDb(@ApplicationContext context: Context) = Room
        .databaseBuilder(context.applicationContext,FamilyDatabase::class.java,"family.db")
        .fallbackToDestructiveMigration()
        .build()
}