package com.singh.gurtek.kotlinconductor.models

/**
 * Created by JacksonGenerator on 12/13/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty


data class FlickerResponse(
        @JsonProperty("stat") val stat: String,
        @JsonProperty("photos") val photos: Photos?

)