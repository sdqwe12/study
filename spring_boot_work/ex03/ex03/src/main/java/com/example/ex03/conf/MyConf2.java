package com.example.ex03.conf;

import com.example.ex03.component.AA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf2 {
    @Bean
    public AA aa() {
        return new AA();
    }

}
