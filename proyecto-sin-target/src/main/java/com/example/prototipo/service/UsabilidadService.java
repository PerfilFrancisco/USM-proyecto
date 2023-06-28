package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Usabilidad;
import com.example.prototipo.repository.UsabilidadRepository;

@Service
public class UsabilidadService {
      
      private UsabilidadRepository usabilidadRepository;

      public UsabilidadService(UsabilidadRepository usabilidadRepository) {
            this.usabilidadRepository = usabilidadRepository;
      }

      public Usabilidad crearUsabilidad(Usabilidad usabilidad) {
            return usabilidadRepository.save(usabilidad);
      }

      public void eliminarUsabilidad(Long idUsabilidad) {
            usabilidadRepository.deleteById(idUsabilidad);
      }
      
      public Usabilidad actualizarUsabilidad(Usabilidad usabilidad) {
            return usabilidadRepository.save(usabilidad);
      }
}
