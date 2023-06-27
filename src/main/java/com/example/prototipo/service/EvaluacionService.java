package com.example.prototipo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.example.prototipo.repository.EvaluacionRepository;

@Service
public class EvaluacionService {

      private EvaluacionRepository evaluacionRepository;

      public EvaluacionService(EvaluacionRepository evaluacionRepository) {
            this.evaluacionRepository = evaluacionRepository;
      }

      public Evaluacion crearEvaluacion(Evaluacion evaluacion) {
            return evaluacionRepository.save(evaluacion);
      }

      public Evaluacion eliminarEvaluacion(Long id) {
            Evaluacion evaluacion = evaluacionRepository.findById(id).orElse(null);
            evaluacionRepository.deleteById(id);
            return evaluacion;
      }

      // buscar por id
      public Evaluacion buscarEvaluacion(Long id) {
            return evaluacionRepository.findById(id).orElse(null);
      }

      // buscar todos
      public List<Evaluacion> getEvaluaciones() {
            return evaluacionRepository.findAll();
      }
 
      // buscar por correo
      public Evaluacion getEvaluacionPorEmail(String email) {
            return evaluacionRepository.findByEmpresaEmail(email);
      }

      // actualizar una evaluacion
      public Evaluacion saveEvaluacion(Evaluacion evaluacion) {
            return evaluacionRepository.save(evaluacion);
      }
}
