package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Rte;
import com.example.prototipo.repository.RteRepository;


@Service
public class RteService {

    private RteRepository rteRepository;

      public Rte actualizarRte(Rte rte){
            return rteRepository.save(rte);
      }
      
}

