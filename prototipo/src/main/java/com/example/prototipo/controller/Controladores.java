package com.example.prototipo.controller;

import java.util.List;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.prototipo.dto.UsuarioRegistroDTO;
import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Usuario;
import com.example.prototipo.service.EmpresaService;
import com.example.prototipo.service.UsuarioService;


@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(maxAge = 3600)
public class Controladores {

      
      //######################
      // zona de busqueda y creacion de empresas
      //######################
      @Autowired
      private EmpresaService empresaService;

      @GetMapping("/")
      public String index() {
            return "index";
      }

      @GetMapping("/buscar")
      public ResponseEntity<List<Empresa>> findAll(){
            List<Empresa> empresas = empresaService.buscarTodos();
            return ResponseEntity.ok(empresas);
      }

      @GetMapping("/buscar/{id}")
      public ResponseEntity<Empresa> findById(@PathVariable Long id){
            Empresa empresa = empresaService.buscarPorId(id);
            return ResponseEntity.ok(empresa);
      }


      @PostMapping("/crear")
      Empresa crearEmpresa(@RequestBody Empresa empresa) {
            //i want to see if the empresa is not in the database
            Empresa empresaEncontrada = empresaService.buscarPorCorreo(empresa.getCorreo());
            if(empresaEncontrada == null){
                  return empresaService.crearEmpresa(empresa);
            }
            else{
                  return null;
            }
      }

      //######################
      // zona de usuario
      //######################
      @Autowired
      private UsuarioService usuarioService;
      
      //i want to create a user
      @PostMapping("/crearUsuario")
      Usuario crearUsuario(@RequestBody UsuarioRegistroDTO usuarioRegistroDTO) {
            return usuarioService.guardar(usuarioRegistroDTO);
      }
      //i want to see if the user is in the database
      @GetMapping("/buscarUsuario")
      public ResponseEntity<List<Usuario>> findAllUsers(){
            List<Usuario> usuarios = usuarioService.buscarTodos();
            return ResponseEntity.ok(usuarios);
      }

      //i want to start a sesion
      @PostMapping("/login")
      public ResponseEntity<Usuario> iniciarSesion(@RequestBody UsuarioRegistroDTO usuarioRegistroDTO){
            Usuario usuario = usuarioService.buscarPorNombreYContrasena(usuarioRegistroDTO);
            return ResponseEntity.ok(usuario);
      }

}

