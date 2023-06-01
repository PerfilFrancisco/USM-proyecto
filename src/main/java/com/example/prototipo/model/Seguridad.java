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
@Table(name = "seguridad")
public class Seguridad {
      
      @Column
      private int autenticacion;
      private int autorizacion;
      private int criptografia;
      private int gestion_contrasenas;
      private int integridad;
      private int autenticidad;
      private int gestion_riesgo;
      private int documentacion;

      @Id
      @Column
      private Long id_seguridad;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
}
