package com.example.prototipo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.repository.EmpresaRepository;

@Service
public class EmpresaServiceImp implements EmpresaService{
      
      private EmpresaRepository empresaRepository;

      public EmpresaServiceImp(EmpresaRepository empresaRepository) {
            this.empresaRepository = empresaRepository;
      }

      

      @Override
      public List<Empresa> buscarTodos(){
            //List<Empresa> empresas = empresaRepository.findAll();
            return empresaRepository.findAll();
      }



      @Override
      public Empresa crearEmpresa(Empresa empresa) {
            return empresaRepository.save(empresa);
            
      }
      
      @Override
      public Empresa buscarPorId(Long id) {
            return empresaRepository.findById(id).orElse(null);
      }

      @Override
      public Empresa buscarPorCorreo(String correo) {
            return empresaRepository.findByEmail(correo);
      }


}
