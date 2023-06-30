package com.example.prototipo.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity 
public class CorsConfig {


      @Bean
      public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
          http.csrf()
              .disable()              
     
              .authorizeHttpRequests(authorize-> authorize
                  .requestMatchers("/admin/**").hasRole("ADMIN")
                  .requestMatchers("/api/**").permitAll()
                  .anyRequest().permitAll()                  
              );

              http.cors();
              return http.build();
      }


      @Value("${allowed.origin}")
      private String allowedOrigin;
      @Bean
      public WebMvcConfigurer getCorsConfiguration(){
            return new WebMvcConfigurer() {
                  @Override
                  public void addCorsMappings(CorsRegistry registry){
                        registry.addMapping("/**")
                              .allowedOrigins(allowedOrigin)
                              .allowedMethods("GET", "POST", "PUT", "DELETE")
                             .allowedHeaders("*");
                             
                  }
            };
      }

      @Bean 
      public PasswordEncoder passwordEncoder() { 
          return new BCryptPasswordEncoder(); 
      } 
}
