package com.example;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.prototipo.service.UsuarioService;

@Profile("test")
@Configuration
public class ProductServiceTestConfiguration  {

   @Bean
   @Primary
   public UsuarioService productService() {      
      return Mockito.mock(UsuarioService.class);
   }
}
