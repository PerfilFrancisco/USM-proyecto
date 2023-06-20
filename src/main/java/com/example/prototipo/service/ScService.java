package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Sc;
import com.example.prototipo.repository.ScRepository;


@Service
public class ScService {

    private ScRepository scRepository;

      public Sc actualizarSc(Sc sc){
            return scRepository.save(sc);
      }
      
}
