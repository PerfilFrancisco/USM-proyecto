package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Ra;

@Repository
public interface RaRepository extends JpaRepository<Ra, Long>{
      
}
