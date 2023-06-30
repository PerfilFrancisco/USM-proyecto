package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Ps;
import com.example.prototipo.repository.PsRepository;


@Service
public class PsService {

    private PsRepository psRepository;

      public Ps actualizarPs(Ps ps){
            return psRepository.save(ps);
      }
      
}
