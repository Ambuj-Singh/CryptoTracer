package com.devzodiac.cryptotracer

import android.app.Application
import com.devzodiac.cryptotracer.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CryptoTracerApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CryptoTracerApp)
            androidLogger()
            modules(appModule)
        }
    }
}