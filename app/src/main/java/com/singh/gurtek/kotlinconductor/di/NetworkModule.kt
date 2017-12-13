package com.singh.gurtek.kotlinconductor.di

import com.singh.gurtek.kotlinconductor.network.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * * Created by Gurtek Singh on 12/11/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
@Module(includes = arrayOf(AppModule::class))
class NetworkModule {


    @Provides
    @ApplicationScope
    fun provideHttpLogger(): HttpLoggingInterceptor {

        return HttpLoggingInterceptor(
                HttpLoggingInterceptor.Logger { message -> Timber.tag("Okhttp").d(message) })

    }

    @Provides
    @ApplicationScope
    fun provideOkhttp(logger: HttpLoggingInterceptor): OkHttpClient {

        return OkHttpClient.Builder()
                .addInterceptor(logger)
                .readTimeout(100, TimeUnit.SECONDS)
                .writeTimeout(100, TimeUnit.SECONDS)
                .addInterceptor(logger)
                .build()

    }

    @Provides
    @ApplicationScope
    fun provideRxAdapter(): RxJava2CallAdapterFactory? {
        return RxJava2CallAdapterFactory.create()
    }

    @Provides
    @ApplicationScope
    fun provideConverter(): JacksonConverterFactory? {
        return JacksonConverterFactory.create()

    }

    @Provides
    @ApplicationScope
    fun provideRetrofit(okHttpClient: OkHttpClient, rxjavaAdapter: RxJava2CallAdapterFactory,
                        converterFactory: JacksonConverterFactory, baseurl: String): Retrofit? {

        return Retrofit.Builder()
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(rxjavaAdapter)
                .baseUrl(baseurl)
                .client(okHttpClient).build()

    }

    @Provides
    @ApplicationScope
    fun provideBaseUrl() = "https://api.flickr.com/"

    @Provides
    @ApplicationScope
    fun provideApi(retrofit: Retrofit): ApiService? {
       return retrofit.create(ApiService::class.java)
    }


}