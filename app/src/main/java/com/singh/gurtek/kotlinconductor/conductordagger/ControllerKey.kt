package com.singh.gurtek.kotlinconductor.conductordagger

import com.bluelinelabs.conductor.Controller
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * Created by cbahl on 12.03.17.
 */
@MapKey
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class ControllerKey(val value: KClass<out Controller>)