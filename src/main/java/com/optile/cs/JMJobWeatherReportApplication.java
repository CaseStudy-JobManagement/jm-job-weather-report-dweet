package com.optile.cs;

import com.optile.cs.client.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JMJobWeatherReportApplication implements CommandLineRunner {

	@Autowired
	Job job;

	public static void main(String[] args) {
		SpringApplication.run(JMJobWeatherReportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		job.execute(args[0], args);
	}
}
