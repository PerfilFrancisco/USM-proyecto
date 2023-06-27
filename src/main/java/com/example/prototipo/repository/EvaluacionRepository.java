package com.example.prototipo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prototipo.model.Empresa;
import com.example.prototipo.model.Evaluacion;
import com.google.common.base.Optional;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long>{

      Evaluacion findByEmpresaEmail(String email);

      List<Evaluacion> findAll();

      Evaluacion findByEmpresaNombre(String empresa);

      Evaluacion save(Evaluacion evaluacion);

}
