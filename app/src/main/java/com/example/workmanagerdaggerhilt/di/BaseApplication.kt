package com.example.workmanagerdaggerhilt.di

import android.app.Application
import android.content.ContentProvider
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication : Application(),Configuration.Provider {

    @Inject
    lateinit var hiltWorkerFactory: HiltWorkerFactory
    override fun onCreate() {
        super.onCreate()
    }

    override fun getWorkManagerConfiguration(): Configuration = Configuration.Builder()
        .setWorkerFactory(hiltWorkerFactory)
        .build()

}