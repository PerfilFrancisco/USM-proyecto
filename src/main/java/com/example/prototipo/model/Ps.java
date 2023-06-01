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
@Table(name = "ps")
public class Ps {
      
      @Column
      private int ps_1;
      private int ps_2;

      @Id
      @Column
      private Long id_ps;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;

      public Ps() {
      }
}
