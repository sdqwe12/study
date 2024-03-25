package com.example.ex03;

import com.example.ex03.component.BB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//configuration
//componentscan 다들어간거임 다 포함된거 밑에스프링부트어플리케이션이
@SpringBootApplication
public class Ex03Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Ex03Application.class, args);
        String str[] = context.getBeanDefinitionNames();
        for (String tmep : str) {
            System.out.println(tmep);

        }
    }
    @Bean
    public BB bb(){
        return new BB();
    }

}
