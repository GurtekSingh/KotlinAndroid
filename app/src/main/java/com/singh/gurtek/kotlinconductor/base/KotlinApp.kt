package com.singh.gurtek.kotlinconductor.base

import android.app.Activity
import android.app.Application
import com.singh.gurtek.kotlinconductor.BuildConfig
import com.singh.gurtek.kotlinconductor.di.AppComponent
import com.singh.gurtek.kotlinconductor.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import timber.log.Timber.DebugTree
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject


/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
class KotlinApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>


    companion object {
        lateinit var appcomponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
        initTimber()
    }

    private fun initDagger() {
        appcomponent = DaggerAppComponent.builder()
                .application(this)
                .build()

        appcomponent.inject(this)
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }


    override fun activityInjector() = activityDispatchingAndroidInjector

}