package com.singh.gurtek.kotlinconductor.ui.gallary.di

import com.singh.gurtek.kotlinconductor.di.scopes.MainActivityScope
import com.singh.gurtek.kotlinconductor.main.GallaryController
import dagger.Subcomponent
import dagger.android.AndroidInjector


/**
 * Created by Gurtek singh
 * on on 12/13/2017
 * gurtek@protonmail.com
 */
@MainActivityScope
@Subcomponent
interface GalleryControllerComponent : AndroidInjector<GallaryController> {
    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<GallaryController>()
}