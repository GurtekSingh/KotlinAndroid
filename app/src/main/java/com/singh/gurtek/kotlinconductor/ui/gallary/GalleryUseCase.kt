package com.singh.gurtek.kotlinconductor.ui.gallary

import com.singh.gurtek.kotlinconductor.base.BaseUseCase
import com.singh.gurtek.kotlinconductor.models.FlickerResponse
import io.reactivex.Observable

/**
 * * Created by Gurtek Singh on 12/13/2017.
 * Sachtech Solution
 * gurtek@protonmail.ch
 */
class GalleryUseCase(var remotedataModel: GallaryRemoteDataModel) : BaseUseCase() {


    fun startloadingImages(query: String, pageNo: Int, key: String): Observable<FlickerResponse>? {
        return remotedataModel.loadImages(query, pageNo, key)
                .compose(applyNToCSchudler())
                .cache()


    }
}