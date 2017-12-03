package com.singh.gurtek.kotlinconductor.main

import android.os.Bundle
import com.singh.gurtek.kotlinconductor.R
import com.singh.gurtek.kotlinconductor.base.BaseActivity
import com.singh.gurtek.kotlinconductor.navigator.AppController
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var appNavigator: AppController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        val router = appNavigator.attachContainer(this, container, savedInstanceState)
        appNavigator.setRoot(router, GallaryController())
    }
}
