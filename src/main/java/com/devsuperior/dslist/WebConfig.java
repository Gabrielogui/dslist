package com.devsuperior.dslist;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*") // Aplica CORS a todas as rotas
                .allowedOrigins("http://localhost:3000") // Permite o frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite esses métodos
                .allowedHeaders(""); // Permite todos os cabeçalhos
    }
}