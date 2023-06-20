package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Pc;
import com.example.prototipo.repository.PcRepository;

@Service
public class PcService { 

    private PcRepository pcRepository;

      public Pc actualizarPc(Pc pc){
            return pcRepository.save(pc);
      }
      
}
