package com.singh.gurtek.kotlinconductor.di

import com.singh.gurtek.kotlinconductor.main.MainActivityComponent
import com.singh.gurtek.kotlinconductor.navigator.AppController
import dagger.Module
import dagger.Provides

/**
 * Created by Gurtek singh
 * on 12/3/2017
 * gurtek@protonmail.com
 */
@Module(subcomponents = arrayOf(MainActivityComponent::class))
class AppModule {

    @ApplicationScope
    @Provides
    fun givemeAppController() = AppController()


}