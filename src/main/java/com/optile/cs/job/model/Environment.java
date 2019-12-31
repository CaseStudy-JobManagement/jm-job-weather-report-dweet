package com.optile.cs.job.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Environment {
    @JsonProperty("temp")
    private Double temperature;

    @JsonProperty("pressure")
    private Double pressure;

    @JsonProperty("humidity")
    private Integer humidity;
}
