package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.ProcesoClinico;
import com.example.prototipo.repository.ProcesoClinicoRepository;

@Service
public class ProcesoClinicoService {
      
      private ProcesoClinicoRepository procesoClinicoRepository;

      public ProcesoClinicoService(ProcesoClinicoRepository procesoClinicoRepository) {
            this.procesoClinicoRepository = procesoClinicoRepository;
      }

      public ProcesoClinico crearProcesoClinico(ProcesoClinico procesoClinico) {
            return procesoClinicoRepository.save(procesoClinico);
      }

      public void eliminarProcesoClinico(Long idProcesoClinico) {
            procesoClinicoRepository.deleteById(idProcesoClinico);
      }

      public ProcesoClinico actualizarProcesoClinico(ProcesoClinico procesoClinico) {
            return procesoClinicoRepository.save(procesoClinico);
      }

}
