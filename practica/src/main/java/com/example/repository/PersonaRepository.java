package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
      
}
