package com.singh.gurtek.kotlinconductor.base

import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * * Created by Gurtek Singh on 12/13/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */

open class BaseUseCase {


    fun <T> applyNToCSchudler(): ObservableTransformer<T, T> {

        return ObservableTransformer{ upstream ->
            upstream.subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.computation())
        }

    }

    fun <T> applyNToMSchudler(): ObservableTransformer<T, T> {

        return ObservableTransformer{ upstream ->
            upstream.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
        }

    }


    fun <T> applyCToMSchudler(): ObservableTransformer<T, T> {

        return ObservableTransformer { upstream ->
            upstream.subscribeOn(Schedulers.computation())
                    .observeOn(AndroidSchedulers.mainThread())
        }


    }


}
