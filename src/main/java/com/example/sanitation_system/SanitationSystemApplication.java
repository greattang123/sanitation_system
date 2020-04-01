package com.example.sanitation_system;

import com.example.sanitation_system.repository.implement.CustomizedRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomizedRepositoryImpl.class)
public class SanitationSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SanitationSystemApplication.class, args);
        System.out.println("good night!");
    }
}
