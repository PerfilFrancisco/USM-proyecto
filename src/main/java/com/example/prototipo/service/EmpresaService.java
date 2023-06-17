package com.example.prototipo.service;

import java.util.List;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;


public interface EmpresaService {
      
      List<Empresa> buscarTodos();

      Empresa crearEmpresa(Empresa empresa);   
      
      Empresa asignarEvaluacion(Evaluacion evaluacion);

      Empresa buscarPorCorreo(String correo);

      Empresa buscarPorNombre(String nombre_empresa);

      Empresa buscarPorRutEmpresa(String rutempresa);
 
      // i want to delete a empresa
      void eliminarEmpresa(Empresa empresa);
}
