package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Evaluador;

@Repository
public interface EvaluadorRepository extends JpaRepository<Evaluador, Long>{
      
}
