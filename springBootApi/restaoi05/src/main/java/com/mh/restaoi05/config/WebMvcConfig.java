package com.mh.restaoi05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebMvcConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 스프링 부트 3버전부터는 람다문법을 써야지만 에러가 안남 어쩔 수 없음
    // jwt 토큰 인증 달겠다
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable(); 이건 스프링 2버전용
//        post방식 put방식 delt방식 사요알 때 csrf 토큰 사용하지 않겠다는 말임 밑에꺼가
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable());
//        http.csrf(qwe -> qwe.disable()); 이렇게 해도됨 변수명이라

        http
                .authorizeRequests(
//                        req ->
//                                req.requestMatchers("/member","test").permitAll().
//                                        anyRequest().authenticated()
                        req -> req.anyRequest().permitAll()

                );
                //스프링시큐리티에 필터를 다는 방법
//        http.addFilter(filter);
        //인터셉터
        return http.build();
    }
}
