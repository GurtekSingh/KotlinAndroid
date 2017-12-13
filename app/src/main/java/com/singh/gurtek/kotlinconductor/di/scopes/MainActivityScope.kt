package com.singh.gurtek.kotlinconductor.di.scopes

import javax.inject.Scope

/**
 * Created by Gurtek singh
 * on on 12/13/2017
 * gurtek@protonmail.com
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class MainActivityScope