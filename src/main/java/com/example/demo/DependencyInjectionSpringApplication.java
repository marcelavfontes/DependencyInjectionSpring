package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import otherpackage.OtherClass;

@SpringBootApplication(scanBasePackageClasses = {OtherClass.class, DependencyInjectionSpringApplication.class})
public class DependencyInjectionSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(DependencyInjectionSpringApplication.class, args);
    }
}
