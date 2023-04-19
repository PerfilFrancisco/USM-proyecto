package com.example.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.model.Persona;
import com.example.repository.PersonaRepository;
import com.example.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI{
      
      @Autowired
      private PersonaRepository personaRepository;

      @Override
      public CrudRepository<Persona, Long> getDao() {
            return personaRepository;
      }
}
