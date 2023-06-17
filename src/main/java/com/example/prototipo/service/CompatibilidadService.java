package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Compatibilidad;
import com.example.prototipo.repository.CompatibilidadRepository;

@Service
public class CompatibilidadService {
      
      private CompatibilidadRepository compatibilidadRepository;

      public CompatibilidadService(CompatibilidadRepository compatibilidadRepository) {
            this.compatibilidadRepository = compatibilidadRepository;
      }

      public Compatibilidad crearCompatibilidad(Compatibilidad compatibilidad) {
            return compatibilidadRepository.save(compatibilidad);
      }

      public void eliminarCompatibilidad(Long idCompatibilidad) {
            compatibilidadRepository.deleteById(idCompatibilidad);
      }

      public Compatibilidad actualizarCompatibilidad(Compatibilidad compatibilidad) {
            return compatibilidadRepository.save(compatibilidad);
      }
}
