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
@Table(name = "sc")
public class Sc {
      
      @Column
      private int sc_1;
      private int sc_2;
      private int sc_3;
      private int sc_4;
      private int sc_5;
      private int sc_6;
      private int sc_7;

      @Id
      @Column
      private Long id_sc;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
}
