package com.singh.gurtek.kotlinconductor.base

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry
import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.archlifecycle.LifecycleController
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
abstract class BaseController(@LayoutRes val layout: Int) : LifecycleController()  {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(layout, container, false)
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        

    }

}