package com.example.prototipo.ServiceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.repository.EmpresaRepository;
import com.example.prototipo.service.EmpresaService;

@Service
public class EmpresaServiceImp implements EmpresaService{
      
      private EmpresaRepository empresaRepository;

      public EmpresaServiceImp(EmpresaRepository empresaRepository) {
            this.empresaRepository = empresaRepository;
      }

      @Override
      public List<Empresa> buscarTodos(){            
            return empresaRepository.findAll();
      }



      @Override
      public Empresa crearEmpresa(Empresa empresa) {
            return empresaRepository.save(empresa);
            
      }

      @Override
      public Empresa buscarPorCorreo(String correo) {
            return empresaRepository.findByEmail(correo);
      }

      @Override
      public Empresa buscarPorNombre(String nombre) {
            return empresaRepository.findByNombre(nombre);
      }

      @Override
      public Empresa buscarPorRutEmpresa(String rutempresa) {
            return empresaRepository.findByrutempresa(rutempresa);
      }

      @Override
      public Empresa asignarEvaluacion(Evaluacion evaluacion) {
            // TODO Auto-generated method stub
            return empresaRepository.save(evaluacion.getEmpresa());            
      }

      @Override
      public void eliminarEmpresa(Empresa empresa) {
            empresaRepository.delete(empresa);
            
      }

}
