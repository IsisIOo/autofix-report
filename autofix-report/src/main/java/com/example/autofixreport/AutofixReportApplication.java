package com.example.autofixreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AutofixReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutofixReportApplication.class, args);
    }

}
