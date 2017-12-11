package com.singh.gurtek.kotlinconductor.di

import dagger.Module
import dagger.Provides

/**
 * * Created by Gurtek Singh on 12/11/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
@Module(includes = arrayOf(AppModule::class))
class NetworkModule {

    @Provides
    fun provideOkhttp() {

    }

}