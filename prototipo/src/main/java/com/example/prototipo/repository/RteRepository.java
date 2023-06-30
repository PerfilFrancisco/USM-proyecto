package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Rte;

@Repository
public interface RteRepository extends JpaRepository<Rte, Long>{
      
}
