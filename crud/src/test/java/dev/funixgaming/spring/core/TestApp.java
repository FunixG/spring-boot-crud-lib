package dev.funixgaming.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication(scanBasePackages = "dev.funixgaming")
@EnableFeignClients(basePackages = "dev.funixgaming")
@EnableSpringDataWebSupport
public class TestApp {

    public static void main(String[] args) {
        SpringApplication.run(TestApp.class);
    }


}
