package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Ac;

@Repository
public interface AcRepository extends JpaRepository<Ac, Long>{
      
      // Ac findByNombre(String nombre);
      
      // Ac findByNombreAndContrasena(String nombre, String contrasena);
      
      // Ac findByContrasena(String contrasena);
}
