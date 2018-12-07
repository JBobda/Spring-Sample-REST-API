package dev.janbobda.springsample;

import dev.janbobda.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController.class)
public class SpringSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSampleApplication.class, args);
    }
}
