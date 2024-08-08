package com.anisanurjanah.fahrameducation

import android.app.Application
import com.anisanurjanah.fahrameducationcourse.core.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
//                    repositoryModule,
//                    useCaseModule,
//                    viewModelModule
                )
            )
        }
    }
}