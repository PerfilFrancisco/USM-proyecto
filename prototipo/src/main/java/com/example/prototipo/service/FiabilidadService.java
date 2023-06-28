package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Fiabilidad;
import com.example.prototipo.repository.FiabilidadRepository;

@Service
public class FiabilidadService {
      
      private FiabilidadRepository fiabilidadRepository;

      public FiabilidadService(FiabilidadRepository fiabilidadRepository) {
            this.fiabilidadRepository = fiabilidadRepository;
      }

      public Fiabilidad crearFiabilidad(Fiabilidad fiabilidad) {
            return fiabilidadRepository.save(fiabilidad);
      }

      public void eliminarFiabilidad(Long idFiabilidad) {
            fiabilidadRepository.deleteById(idFiabilidad);
      }
      
      public Fiabilidad actualizarFiabilidad(Fiabilidad fiabilidad) {
            return fiabilidadRepository.save(fiabilidad);
      }
      
}
