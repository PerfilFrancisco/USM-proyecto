package com.example.prototipo.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
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
            //   .authorizeHttpRequests((authorize) -> authorize
            //       .requestMatchers("/admin/**").hasRole("ADMIN")
            //       .requestMatchers("/api/**").anonymous()
            //       .requestMatchers("/login*").permitAll()           
            //       .anyRequest().permitAll()                                   
            //       .and()
            //   );      
              .authorizeHttpRequests((authorize)-> authorize
                  .requestMatchers("/admin/**").hasRole("ADMIN")
                  .requestMatchers("/api/**").permitAll()
                  .anyRequest().permitAll()
                  .and()
              );

              http.cors();
              return http.build();
      }
      // @Autowired
      // public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      //   auth
      //     .inMemoryAuthentication()
      //       .withUser("user").password("password").roles("USER");
      // }

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
}
