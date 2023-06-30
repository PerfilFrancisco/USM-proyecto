package com.example.prototipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Administrador;
import com.example.prototipo.model.Compatibilidad;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
      
}
