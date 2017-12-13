package com.singh.gurtek.kotlinconductor.models;

/**
 * Created by JacksonGenerator on 12/13/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class FlickerResponse {
    @JsonProperty("stat")
    private String stat;
    @JsonProperty("photos")
    private Photos photos;
}