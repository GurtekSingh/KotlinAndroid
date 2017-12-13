package com.singh.gurtek.kotlinconductor.di

import android.app.Application
import com.singh.gurtek.kotlinconductor.base.KotlinApp
import com.singh.gurtek.kotlinconductor.conductordagger.ConductorInjectionModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule


/**
 * Created by Gurtek singh
 * on 12/3/2017
 * gurtek@protonmail.com
 */
@ApplicationScope
@Component(modules = arrayOf(AndroidInjectionModule::class,
        ConductorInjectionModule::class,
        AppModule::class, ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(kotlinApp: KotlinApp)
}