package com.singh.gurtek.kotlinconductor.di

import android.app.Activity

import com.singh.gurtek.kotlinconductor.main.MainActivity
import com.singh.gurtek.kotlinconductor.main.MainActivityComponent

import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>


}