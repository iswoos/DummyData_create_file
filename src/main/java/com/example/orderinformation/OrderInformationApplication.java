package com.example.orderinformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OrderInformationApplication {

    public static void main(String[] args) {
       SpringApplication.run(OrderInformationApplication.class, args);
    }

}
