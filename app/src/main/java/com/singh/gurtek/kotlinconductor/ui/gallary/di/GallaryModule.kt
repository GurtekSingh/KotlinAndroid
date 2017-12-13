package com.singh.gurtek.kotlinconductor.ui.gallary.di


import com.bluelinelabs.conductor.Controller
import com.singh.gurtek.kotlinconductor.conductordagger.ControllerKey
import com.singh.gurtek.kotlinconductor.main.GallaryController

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [(GalleryControllerComponent::class)])
abstract class GallaryModule {

    @Binds
    @IntoMap
    @ControllerKey(GallaryController::class)
    internal abstract fun bindYourControllerInjectorFactory(builder: GalleryControllerComponent.Builder):
            AndroidInjector.Factory<out Controller>
}