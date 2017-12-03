package com.singh.gurtek.kotlinconductor.base

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import timber.log.Timber

/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
abstract class BaseController(@LayoutRes val layout: Int) : Controller() {


    val controller by lazy { giveMeClassToSetTag() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        Timber.d("view created")
        return inflater.inflate(layout, container, false)
    }

    override fun onContextAvailable(context: Context) {
        super.onContextAvailable(context)
        Timber.tag(controller.javaClass.simpleName)
    }

    abstract fun giveMeClassToSetTag(): Controller
}