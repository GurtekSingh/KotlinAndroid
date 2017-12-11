package com.singh.gurtek.kotlinconductor.base

import android.arch.lifecycle.LifecycleObserver
import io.reactivex.disposables.CompositeDisposable

/**
 * * Created by Gurtek Singh on 12/11/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
open class BaseViewModel : LifecycleObserver {

    val disponsableContainer = CompositeDisposable()


}