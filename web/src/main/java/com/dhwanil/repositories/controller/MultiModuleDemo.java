package com.dhwanil.repositories.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.dhwanil.repositories")
@EnableJpaRepositories(basePackages = {"com.dhwanil.repositories"})
@EntityScan("com.dhwanil.domain")
public class MultiModuleDemo {
  public static void main(String[] args) {
    SpringApplication.run(MultiModuleDemo.class);
  }
}
