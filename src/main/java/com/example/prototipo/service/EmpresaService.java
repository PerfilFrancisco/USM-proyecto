package com.example.prototipo.service;

import java.util.List;

import com.example.prototipo.model.Empresa;


public interface EmpresaService {
      
      List<Empresa> buscarTodos();

      Empresa crearEmpresa(Empresa empresa);      

      Empresa buscarPorCorreo(String correo);

      Empresa buscarPorNombre(String nombre_empresa);

      Empresa buscarPorRutEmpresa(String rutempresa);
}
