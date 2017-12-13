package com.singh.gurtek.kotlinconductor.conductordagger

import com.bluelinelabs.conductor.Controller
import dagger.internal.Preconditions
import timber.log.Timber

/**
 * Created by Gurtek singh
 * on on 12.03.17
 * gurtek@protonmail.com
 */
object ConductorInjection {

    fun inject(controller: Controller) {
        Preconditions.checkNotNull(controller, "controller")
        val hasDispatchingControllerInjector = findHasControllerInjector(controller)
        Timber.tag("Conductor dagger").d("An injector for %s was found in %s", controller.javaClass.canonicalName,
                hasDispatchingControllerInjector.javaClass.canonicalName)
        val controllerInjector = hasDispatchingControllerInjector.controllerInjector()
        Preconditions.checkNotNull(controllerInjector, "%s.controllerInjector() returned null",
                hasDispatchingControllerInjector.javaClass.canonicalName)
        controllerInjector.inject(controller)
    }

    private fun findHasControllerInjector(controller: Controller): HasControllerInjector {
        val parentController: Controller? = controller

        do {
            if (parentController!!.parentController == null) {
                val activity = controller.activity
                if (activity is HasControllerInjector) {
                    return activity
                }

                if (activity!!.application is HasControllerInjector) {
                    return activity.application as HasControllerInjector
                }

                throw IllegalArgumentException(
                        String.format("No injector was found for %s", controller.javaClass.canonicalName))
            }
        } while (parentController !is HasControllerInjector)

        return parentController
    }
}