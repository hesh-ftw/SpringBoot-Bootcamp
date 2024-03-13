package com.example.bootcampspringboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootcampSpringbootApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootcampSpringbootApplication.class, args);
    }

    @GetMapping("/hello")
        public String hello() {
        return "helloworld";
        }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("licence check Success");

    }
}
