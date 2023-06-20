package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Sc;

@Repository
public interface ScRepository extends JpaRepository<Sc, Long>{
      
}
