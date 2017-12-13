package com.singh.gurtek.kotlinconductor.conductordagger

import com.bluelinelabs.conductor.Controller
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.Multibinds

/**
 * Created by cbahl on 12.03.17.
 */
@Module
abstract class ConductorInjectionModule private constructor() {

    @Multibinds
    internal abstract fun controllerInjectorFactories(): Map<Class<out Controller>, AndroidInjector.Factory<out Controller>>
}