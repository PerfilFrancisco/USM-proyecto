package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
      public Usuario findByContrasena(String contrasena);

      public Usuario findByNombre(String nombre);

      public Usuario findByNombreAndContrasena(String nombre, String contrasena);

      
}
