package com.singh.gurtek.kotlinconductor.ui.gallary

import com.singh.gurtek.kotlinconductor.network.ApiService
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule
import org.junit.Rule



/**
 * * Created by Gurtek Singh on 12/13/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
class GalleryUseCaseTest {

    @Rule
    var mockitoRule = MockitoJUnit.rule()

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

    @Test
    fun isAllSet(){

        val a=10
        val b=10

        assert(a ==b)
    }

    @Test
    fun startloadingImages() {
        //given
        val api = mock(ApiService::class.java)
        val dataModel = GallaryDataModel(api)

        //when
       /* `when`(dataModel.loadImages("cat",9,"key"))
                .then()*/


        //than

    }

}