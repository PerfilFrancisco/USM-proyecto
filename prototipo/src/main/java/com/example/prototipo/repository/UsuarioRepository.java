package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Administrador;

@Repository
public interface UsuarioRepository extends JpaRepository<Administrador, Long>{
      public Administrador findByContrasena(String contrasena);

      public Administrador findByNombre(String nombre);

      public Administrador findByNombreAndContrasena(String nombre, String contrasena);

      
}
