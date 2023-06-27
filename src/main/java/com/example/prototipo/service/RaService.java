package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Ra;
import com.example.prototipo.repository.RaRepository;


@Service
public class RaService {

    private RaRepository raRepository;

      public Ra actualizarRa(Ra ra){
            return raRepository.save(ra);
      }
      
}
