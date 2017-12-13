package com.singh.gurtek.kotlinconductor.ui.gallary

import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.After
import org.junit.Before


/**
 * * Created by Gurtek Singh on 12/13/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
class GalleryUseCaseTest {


    @Before
    fun setUp() {

        RxAndroidPlugins.onMainThreadScheduler(Schedulers.trampoline())
        RxJavaPlugins.onIoScheduler(Schedulers.trampoline())
        RxJavaPlugins.onComputationScheduler(Schedulers.trampoline())
    }

    @After
    fun clear(){
        RxJavaPlugins.reset()
        RxAndroidPlugins.reset()
    }



}