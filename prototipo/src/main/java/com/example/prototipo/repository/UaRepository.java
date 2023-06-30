package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Ua;

@Repository
public interface UaRepository extends JpaRepository<Ua, Long> {
      
}
