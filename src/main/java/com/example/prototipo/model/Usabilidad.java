package com.example.prototipo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usabilidad")
public class Usabilidad {
      
      @Column
      private int pruebas_usuario;
      private int errores_usuario;
      private int capacidad_aprendizaje;
      private int accesibilidad;

      @Id
      @Column
      private Long id_usabilidad;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
      
      public Usabilidad() {
      }
}
