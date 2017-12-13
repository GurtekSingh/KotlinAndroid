package com.singh.gurtek.kotlinconductor.network

import com.singh.gurtek.kotlinconductor.constants.AppConstants
import com.singh.gurtek.kotlinconductor.models.FlickerResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * * Created by Gurtek Singh on 12/13/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
interface ApiService {

    @GET("/services/rest?method=flickr.photos.search&format=json&nojsoncallback=1")
    fun search(@Query("text") text: String,
                     @Query("page") page: Int?,
                     @Query("per_page") perpage: Int?,
                     @Query("api_key") key: String): Observable<FlickerResponse>

}