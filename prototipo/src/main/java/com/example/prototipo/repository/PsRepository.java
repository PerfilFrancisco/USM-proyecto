package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Ps;

@Repository
public interface PsRepository extends JpaRepository<Ps, Long>{
      
}

