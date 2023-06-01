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
@Table(name = "pc")
public class Pc {
      
      @Column
      private int pc_1;

      // @JoinColumn(name = "rut_empresa")
      // @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      // @Column(length = 45)
      // private String Empresa_rut; 
      @Id
      @Column
      private Long id_pc;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
}
