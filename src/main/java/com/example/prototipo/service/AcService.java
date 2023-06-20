package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Ac;
import com.example.prototipo.repository.AcRepository;

@Service
public class AcService {
      
      private AcRepository acRepository;

      public Ac actualizarAc(Ac ac){
            return acRepository.save(ac);
      }
}
