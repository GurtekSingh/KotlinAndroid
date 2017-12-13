package com.singh.gurtek.kotlinconductor.models;

/**
 * Created by JacksonGenerator on 12/13/17.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Photos {
    @JsonProperty("perpage")
    private Integer perpage;
    @JsonProperty("total")
    private String total;
    @JsonProperty("pages")
    private String pages;
    @JsonProperty("photo")
    private List<PhotoItem> photo;
    @JsonProperty("page")
    private Integer page;
}