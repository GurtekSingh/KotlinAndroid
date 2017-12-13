package com.singh.gurtek.kotlinconductor.ui.gallary

import com.singh.gurtek.kotlinconductor.models.FlickerResponse
import com.singh.gurtek.kotlinconductor.network.ApiService
import io.reactivex.Observable

/**
* * Created by Gurtek Singh on 12/9/2017.
* Sachtech Solution
* gurtek@protonmail.ch
*/
class GallaryDataModel(var apiService: ApiService) {

    fun loadImages(query: String, pageNo: Int, key: String): Observable<FlickerResponse> {

     return apiService.search(query,pageNo,20,key)

    }


}