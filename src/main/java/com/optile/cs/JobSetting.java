package com.optile.cs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
@Getter
@Setter
public class JobSetting {
    private Weather weather;
    private String dweetThing;

    @Getter
    @Setter
    public static class Weather {
        private String url;
        private String appId;
    }

}
