package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Seguridad;
import com.example.prototipo.repository.SeguridadRepository;

@Service
public class SeguridadService {
      
      private SeguridadRepository seguridadRepository;

      public SeguridadService(SeguridadRepository seguridadRepository) {
            this.seguridadRepository = seguridadRepository;
      }

      public void crearSeguridad(Seguridad seguridad) {
            seguridadRepository.save(seguridad);
      }

      public void eliminarSeguridad(Long idSeguridad) {
            seguridadRepository.deleteById(idSeguridad);
      }

      public void actualizarSeguridad(Seguridad seguridad) {
            seguridadRepository.save(seguridad);
      }

}
