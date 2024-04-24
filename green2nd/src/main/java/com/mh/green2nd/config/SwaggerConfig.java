package com.mh.green2nd.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
                info = @Info(title = "그린컴2차 프로젝트?",
                description = "자세한 설명 필요?",
                 version = "v1.0.0")
                )

@Configuration
public class SwaggerConfig {



}
