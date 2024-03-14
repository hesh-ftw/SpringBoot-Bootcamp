package com.example.bootcampspringboot.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component  // creating a bean using @component annotation
public class Animal {
    String name="cat";
}
