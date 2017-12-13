package com.singh.gurtek.kotlinconductor.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.singh.gurtek.kotlinconductor.R
import com.singh.gurtek.kotlinconductor.utils.inflate


/**
 * Created by Gurtek singh
 * on on 12/2/2017
 * gurtek@protonmail.com
 */
class GallaryAdapter : RecyclerView.Adapter<GallaryAdapter.ViewHolder>() {


    var list = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.inflater_gallary_view))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

    }

    override fun getItemCount() = list.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}