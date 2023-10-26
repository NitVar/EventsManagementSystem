package com.events.eventmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(scanBasePackages={"com.events.eventmanagementsystem.service"}, exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication(scanBasePackages={"com.events.eventmanagementsystem"})
public class EventmanagementsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventmanagementsystemApplication.class, args);
	}

}
