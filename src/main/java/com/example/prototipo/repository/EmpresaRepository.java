package com.example.prototipo.repository;


 
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prototipo.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{ 
      
      List<Empresa> findAll();

      Empresa findByCorreo(String correo);

      Empresa findById(long id);

}
