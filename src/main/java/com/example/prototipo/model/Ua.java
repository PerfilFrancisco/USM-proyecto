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
@Table(name = "ua")
public class Ua {
      
      @Column
      private int ua_1;
      private int ua_2;
      private int ua_3;
      private int ua_4;

      @Id
      @Column
      private Long id_ua;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;      
}
