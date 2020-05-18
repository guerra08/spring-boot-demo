package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner cmdlineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("The beans from Spring: ");

            String [] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for(String bean : beans){
                System.out.println(bean);
            }
        };
    }

}
