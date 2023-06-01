package com.example.prototipo.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "fiabilidad")
public class Fiabilidad {
      
      @Column
      private int eficiencia_desempeno;
      private int tolerancia_fallos;
      private int capacidad_recuperacion;
      private int arquitectura;
      private int otros_aspectos;

      @Id
      @Column
      private Long id_fiabilidad;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
}
