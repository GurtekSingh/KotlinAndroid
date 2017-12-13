package com.singh.gurtek.kotlinconductor.models

/**
 * Created by Gurtek singh
 * on on 12/13/17
 * gurtek@protonmail.com
 */

import com.fasterxml.jackson.annotation.JsonProperty


data class PhotoItem(
        @JsonProperty("owner")
        private val owner: String? = null,
        @JsonProperty("server")
        private val server: String? = null,
        @JsonProperty("ispublic")
        private val ispublic: Int? = null,
        @JsonProperty("isfriend")
        private val isfriend: Int? = null,
        @JsonProperty("farm")
        private val farm: Int? = null,
        @JsonProperty("id")
        private val id: String? = null,
        @JsonProperty("secret")
        private val secret: String? = null,
        @JsonProperty("title")
        private val title: String? = null,
        @JsonProperty("isfamily")
        private val isfamily: Int? = null
)