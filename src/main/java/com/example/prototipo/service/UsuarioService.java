package com.example.prototipo.service;

import java.util.List;

import com.example.prototipo.dto.UsuarioRegistroDTO;
import com.example.prototipo.model.Usuario;

public interface UsuarioService {
      public Usuario guardar(Usuario usuario);

      public List<Usuario> buscarTodos();

      public Usuario buscarPorId(Long id);

      public Usuario buscarPorContrasena(String contrasena);

      public Usuario buscarPorNombre(String nombre);

      public Usuario buscarPorNombreYContrasena(String nombre, String contrasena);

      public Usuario buscarPorNombreYContrasena(Usuario usuario);
}
