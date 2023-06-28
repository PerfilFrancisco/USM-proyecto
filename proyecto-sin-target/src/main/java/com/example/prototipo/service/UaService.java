package com.example.prototipo.service;

import org.springframework.stereotype.Service;

import com.example.prototipo.model.Ua;
import com.example.prototipo.repository.UaRepository;


@Service
public class UaService {

    private UaRepository uaRepository;

      public Ua actualizarUa(Ua ua){
            return uaRepository.save(ua);
      }
      
}
