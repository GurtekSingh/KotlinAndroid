package com.singh.gurtek.kotlinconductor.utils

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * * Created by Gurtek Singh on 12/6/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */

public fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}
