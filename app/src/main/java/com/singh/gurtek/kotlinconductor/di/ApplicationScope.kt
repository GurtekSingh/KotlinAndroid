package com.singh.gurtek.kotlinconductor.di

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by Gurtek singh
 * on 12/3/2017
 * gurtek@protonmail.com
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class ApplicationScope
