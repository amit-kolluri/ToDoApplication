package com.todoapplication.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication(scanBasePackages = "com.todoapplication")
@EnableGlobalMethodSecurityMethodSecurity(prePostEnabled = true, securedEnabled = true)
@EnableJpaRepositories("com.todoapplication.repository")
@EntityScan("com.todoapplication.model")
public class ApplicationStart {

    public static void main(String[] args) {
        System.out.println("Hello World1111");
        SpringApplication.run(ApplicationStart.class, args);
        System.out.println("Hello World");

    }
}
