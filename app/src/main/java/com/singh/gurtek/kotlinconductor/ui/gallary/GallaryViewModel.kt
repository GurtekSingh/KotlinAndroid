package com.singh.gurtek.kotlinconductor.ui.gallary

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import com.singh.gurtek.kotlinconductor.base.BaseViewModel

/**
 * Created by sachtech on 12/9/2017.
 */
class GallaryViewModel : BaseViewModel() {


    fun loadImages(){

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun unsubscribeEvents(){

    }



}