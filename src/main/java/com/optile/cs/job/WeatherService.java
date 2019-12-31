package com.optile.cs.job;

import com.optile.cs.JobSetting;
import com.optile.cs.job.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JobSetting jobSetting;

    public Weather getWeatherData(String city) {
        String url = UriComponentsBuilder
                .fromUriString(jobSetting.getWeather().getUrl())
                .queryParam("q", city)
                .queryParam("APPID", jobSetting.getWeather().getAppId())
                .queryParam("units", "metric")
                .toUriString();

        return restTemplate.getForObject(url, Weather.class);
    }
}
