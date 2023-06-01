package com.example.prototipo.service;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prototipo.dto.UsuarioRegistroDTO;

import com.example.prototipo.model.Usuario;
import com.example.prototipo.repository.UsuarioRepository;


@Service
public class UsuarioServiceImp implements UsuarioService{
      
      @Autowired
      private UsuarioRepository usuarioRepository;

      @Override
      public Usuario guardar(Usuario usuario) {
            Usuario user = new Usuario(usuario.getNombre(), usuario.getContrasena());
            return usuarioRepository.save(user);
      }
      @Override
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
      @Override
      public Usuario buscarPorId(Long id) {
            return usuarioRepository.findById(id).orElse(null);
      }
      @Override
      public Usuario buscarPorContrasena(String contrasena) {
            return usuarioRepository.findByContrasena(contrasena);
      }
      @Override
      public Usuario buscarPorNombre(String nombre) {
            return usuarioRepository.findByNombre(nombre);
      }
      @Override
      public Usuario buscarPorNombreYContrasena(String nombre, String contrasena) {
            return usuarioRepository.findByNombreAndContrasena(nombre, contrasena);
      }
      @Override
      public Usuario buscarPorNombreYContrasena(Usuario usuario) {
            return usuarioRepository.findByNombreAndContrasena(usuario.getNombre(), usuario.getContrasena());
      }
      
}
