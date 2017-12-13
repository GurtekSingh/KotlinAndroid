package com.singh.gurtek.kotlinconductor.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import com.singh.gurtek.kotlinconductor.R
import com.singh.gurtek.kotlinconductor.base.BaseController
import com.singh.gurtek.kotlinconductor.ui.gallary.GallaryViewModel
import kotlinx.android.synthetic.main.cont_gallary_view.view.*
import javax.inject.Inject

/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */
class GallaryController : BaseController<GallaryViewModel>(R.layout.cont_gallary_view) {

    private lateinit var recycleView: RecyclerView

    @Inject
    lateinit var gallaryModel: GallaryViewModel

    override fun onAttach(view: View) {
        super.onAttach(view)
        recycleView = view.recyler_view


    }

    override fun onContextAvailable(context: Context) {
        super.onContextAvailable(context)


    }

    override fun getViewModel() = gallaryModel


}


