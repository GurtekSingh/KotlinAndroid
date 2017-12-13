package com.singh.gurtek.kotlinconductor.models

/**
 * Created by Gurtek singh
 * on on 12/13/17
 * gurtek@protonmail.com
 */

import com.fasterxml.jackson.annotation.JsonProperty


data class Photos(
        @JsonProperty("perpage")
        private val perpage: Int? = null,
        @JsonProperty("total")
        private val total: String? = null,
        @JsonProperty("pages")
        private val pages: String? = null,
        @JsonProperty("photo")
        private val photo: List<PhotoItem>? = null,
        @JsonProperty("page")
        private val page: Int? = null
)