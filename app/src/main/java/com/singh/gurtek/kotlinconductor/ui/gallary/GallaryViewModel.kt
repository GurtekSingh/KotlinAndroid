package com.singh.gurtek.kotlinconductor.ui.gallary

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import com.singh.gurtek.kotlinconductor.base.BaseViewModel
import com.singh.gurtek.kotlinconductor.constants.AppConstants

/**
* * Created by Gurtek Singh on 12/9/2017.
* Sachtech Solution
* gurtek@protonmail.ch
*/
class GallaryViewModel(val useCase: GalleryUseCase) : BaseViewModel() {




    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun loadImages() {
        loadImages("husky",0, AppConstants.KEY)
    }

    private fun loadImages(query: String,pageNo: Int, key: String) {

        useCase.startloadingImages(query,pageNo,key)

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun unsubscribeEvents() {

    }


}