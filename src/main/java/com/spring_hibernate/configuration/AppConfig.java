package com.spring_hibernate.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring_hibernate.*"})
public class AppConfig {
}
