package mock

import com.singh.gurtek.kotlinconductor.models.FlickerResponse

/**
 * Created by Gurtek singh
 * on on 12/13/2017
 * gurtek@protonmail.com
 */
object MockDataSource {

    fun getMockPhotos(): FlickerResponse {

        return FlickerResponse()
    }
}