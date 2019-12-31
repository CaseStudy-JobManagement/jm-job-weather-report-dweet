package com.optile.cs.job.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    @JsonProperty("name")
    private String name;

    @JsonProperty("main")
    private Environment environment;
}
