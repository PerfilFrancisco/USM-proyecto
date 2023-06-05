package com.example.prototipo.service;

import org.springframework.stereotype.Service;

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
}
