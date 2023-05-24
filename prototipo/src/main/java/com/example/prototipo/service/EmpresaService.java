package com.example.prototipo.service;

import java.util.List;

import com.example.prototipo.model.Empresa;


public interface EmpresaService {
      
      List<Empresa> buscarTodos();

      Empresa crearEmpresa(Empresa empresa);

      Empresa buscarPorId(Long id);

      Empresa buscarPorCorreo(String correo);
}
