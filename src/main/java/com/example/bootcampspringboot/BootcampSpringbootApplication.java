package com.example.bootcampspringboot;

import com.example.bootcampspringboot.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootcampSpringbootApplication implements ApplicationRunner {

    // ANNOTATION BASE INJECTION
    @Autowired
    Animal animal; // created an object using beans


    public static void main(String[] args) {
        SpringApplication.run(BootcampSpringbootApplication.class, args);
    }

    @GetMapping("/hello")
        public String hello() {
        return "hello";
        }

    @GetMapping("/animal")
    public Animal animal() {
        return this.animal;
    }

   // anither way of creating bean (using @bean)
    @Bean
    public Animal CreateAnimal(){
        return this.animal;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("licence check Success");

    }
}
