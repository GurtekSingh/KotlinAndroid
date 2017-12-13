package com.singh.gurtek.kotlinconductor.models;

/**
 * Created by JacksonGenerator on 12/13/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class PhotoItem {
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("server")
    private String server;
    @JsonProperty("ispublic")
    private Integer ispublic;
    @JsonProperty("isfriend")
    private Integer isfriend;
    @JsonProperty("farm")
    private Integer farm;
    @JsonProperty("id")
    private String id;
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("title")
    private String title;
    @JsonProperty("isfamily")
    private Integer isfamily;
}