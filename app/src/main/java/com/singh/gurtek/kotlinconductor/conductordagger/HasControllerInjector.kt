package com.singh.gurtek.kotlinconductor.conductordagger

import com.bluelinelabs.conductor.Controller
import dagger.android.DispatchingAndroidInjector

/**
 * Created by Gurtek singh
 * on on 12.03.17
 * gurtek@protonmail.com
 */
interface HasControllerInjector {
    fun controllerInjector(): DispatchingAndroidInjector<Controller>
}