package com.example.config;
import java.io.IOException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;

@ComponentScan
@Configuration
@EnableWebMvc
@EnableWebSecurity
public class WebConfig implements WebMvcConfigurer, Filter {
 
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*") // Cambia la URL según la ubicación de tu frontend
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*")
            .exposedHeaders("Access-Control-Allow-Origin")
            .allowCredentials(true)
            .maxAge(3600);
    }
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("pasando por configureEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        System.out.println(http.cors());
        http.authorizeHttpRequests()
            .requestMatchers("/login/").permitAll() // permitir el acceso sin autenticación a rutas en /api
            .anyRequest().authenticated() // todas las demás rutas requieren autenticación
            .and().csrf().disable()
            .cors();
    }
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:3000"); // o la URL de su aplicación de React
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        chain.doFilter(req, res);
        
    }
}
