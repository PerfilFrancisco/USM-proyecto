package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prototipo.model.Pc;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long>{
      
}
