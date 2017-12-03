package com.singh.gurtek.kotlinconductor.navigator

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction


/**
 * Created by Gurtek singh
 * on 12/2/2017
 * gurtek@protonmail.com
 */

class AppController {

    fun attachContainer(activity: Activity, container: ViewGroup, savedInstanceState: Bundle?): Router {
        return Conductor.attachRouter(activity, container, savedInstanceState)
    }

    fun setRoot(router: Router, controller: Controller) {
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(controller))
        }
    }


}