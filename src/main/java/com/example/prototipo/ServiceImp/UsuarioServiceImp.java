package com.example.prototipo.ServiceImp;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prototipo.model.Administrador;
import com.example.prototipo.repository.UsuarioRepository;
import com.example.prototipo.service.UsuarioService;


@Service
public class UsuarioServiceImp implements UsuarioService{
      
      @Autowired
      private UsuarioRepository usuarioRepository;

      @Override
      public Administrador guardar(Administrador usuario) {
            Administrador user = new Administrador(usuario.getNombre(), usuario.getContrasena());
            return usuarioRepository.save(user);
      }
      @Override
	public List<Administrador> buscarTodos() {
		return usuarioRepository.findAll();
	}
      @Override
      public Administrador buscarPorId(Long id) {
            return usuarioRepository.findById(id).orElse(null);
      }
      @Override
      public Administrador buscarPorContrasena(String contrasena) {
            return usuarioRepository.findByContrasena(contrasena);
      }
      @Override
      public Administrador buscarPorNombre(String nombre) {
            return usuarioRepository.findByNombre(nombre);
      }
      @Override
      public Administrador buscarPorNombreYContrasena(String nombre, String contrasena) {
            return usuarioRepository.findByNombreAndContrasena(nombre, contrasena);
      }
      @Override
      public Administrador buscarPorNombreYContrasena(Administrador usuario) {
            return usuarioRepository.findByNombreAndContrasena(usuario.getNombre(), usuario.getContrasena());
      }
      
}
