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
@Table(name = "ra")
public class Ra {
      
      @Column
      private int ra_1;
      private int ra_2;
      private int ra_3;

      @Id
      @Column
      private Long id_ra;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Ra() {
      }

      public Ra(int ra_1, int ra_2, int ra_3, Long id_ra, Empresa empresa, Evaluador evaluador) {
            this.ra_1 = ra_1;
            this.ra_2 = ra_2;
            this.ra_3 = ra_3;
            this.id_ra = id_ra;
            this.empresa = empresa;
            this.evaluador = evaluador;
      }

      public int getRa_1() {
            return ra_1;
      }

      public void setRa_1(int ra_1) {
            this.ra_1 = ra_1;
      }

      public int getRa_2() {
            return ra_2;
      }

      public void setRa_2(int ra_2) {
            this.ra_2 = ra_2;
      }

      public int getRa_3() {
            return ra_3;
      }

      public void setRa_3(int ra_3) {
            this.ra_3 = ra_3;
      }

      public Long getId_ra() {
            return id_ra;
      }

      public void setId_ra(Long id_ra) {
            this.id_ra = id_ra;
      }

      public Empresa getEmpresa() {
            return empresa;
      }

      public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
      }

      public Evaluador getEvaluador() {
            return evaluador;
      }

      public void setEvaluador(Evaluador evaluador) {
            this.evaluador = evaluador;
      }
      
      
}
