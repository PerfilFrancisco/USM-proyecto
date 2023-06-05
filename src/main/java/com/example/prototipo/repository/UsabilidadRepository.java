package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Usabilidad;

@Repository
public interface UsabilidadRepository extends JpaRepository<Usabilidad, Long>{
      
}
