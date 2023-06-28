package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Fiabilidad;

@Repository
public interface FiabilidadRepository extends JpaRepository<Fiabilidad, Long>{
      
}
