package com.singh.gurtek.kotlinconductor.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bluelinelabs.conductor.Controller
import com.singh.gurtek.kotlinconductor.R
import com.singh.gurtek.kotlinconductor.base.BaseController
import kotlinx.android.synthetic.main.cont_gallary_view.view.*
import timber.log.Timber
import kotlin.concurrent.timer

/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
class GallaryController : BaseController(R.layout.cont_gallary_view) {

    lateinit var recycleView: RecyclerView


    override fun onAttach(view: View) {
        super.onAttach(view)
        recycleView = view.recyler_view

        Timber.d("onAttach View Called")

    }

    override fun onContextAvailable(context: Context) {
        super.onContextAvailable(context)

        Timber.d("controller context available")

    }


    override fun giveMeClassToSetTag(): Controller = this


}

