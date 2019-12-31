package com.optile.cs.dweet;

import com.optile.cs.JobSetting;
import com.optile.cs.job.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DweetService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JobSetting jobSetting;

    public void send(Weather weather)  {
        restTemplate.postForLocation(jobSetting.getDweetThing(), weather);
    }
}
