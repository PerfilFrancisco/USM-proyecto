package com.example.prototipo.service;

import java.util.List;

import com.example.prototipo.dto.UsuarioRegistroDTO;
import com.example.prototipo.model.Administrador;

public interface UsuarioService {
      public Administrador guardar(Administrador usuario);

      public List<Administrador> buscarTodos();

      public Administrador buscarPorId(Long id);

      public Administrador buscarPorContrasena(String contrasena);

      public Administrador buscarPorNombre(String nombre);

      public Administrador buscarPorNombreYContrasena(String nombre, String contrasena);

      public Administrador buscarPorNombreYContrasena(Administrador usuario);
}
