package com.optile.cs.job;

import com.optile.cs.client.Job;
import com.optile.cs.dweet.DweetService;
import com.optile.cs.error.JobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherReportJob extends Job {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private DweetService dweetService;

    @Override
    protected void process(String jobId, String... args) throws JobException {
            dweetService
                    .send(weatherService.getWeatherData(args[1]));
    }
}
