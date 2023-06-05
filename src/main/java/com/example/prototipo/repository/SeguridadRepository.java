package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Seguridad;

@Repository
public interface SeguridadRepository extends JpaRepository<Seguridad, Long>{
      
}
