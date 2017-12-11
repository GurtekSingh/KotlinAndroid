package com.singh.gurtek.kotlinconductor.base

import android.arch.lifecycle.LifecycleObserver
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.archlifecycle.LifecycleController
import com.singh.gurtek.kotlinconductor.utils.inflate


/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
abstract class BaseController<out T : LifecycleObserver>(@LayoutRes val layout: Int) : LifecycleController()  {

  private  var lifeCycleObserver : LifecycleObserver? = null
      get() = getViewModel()

     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return container.inflate(layout,inflater = inflater)
    }

    override fun onAttach(view: View) {
        super.onAttach(view)
        lifecycle?.addObserver(getViewModel())
    }

    abstract fun getViewModel() : T

}