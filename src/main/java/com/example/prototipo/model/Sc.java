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

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Sc() {
      }

      public Sc(int sc_1, int sc_2, int sc_3, int sc_4, int sc_5, int sc_6, int sc_7, Long id_sc, Empresa empresa,
                  Evaluador evaluador) {
            this.sc_1 = sc_1;
            this.sc_2 = sc_2;
            this.sc_3 = sc_3;
            this.sc_4 = sc_4;
            this.sc_5 = sc_5;
            this.sc_6 = sc_6;
            this.sc_7 = sc_7;
            this.id_sc = id_sc;
            this.empresa = empresa;
            this.evaluador = evaluador;
      }

      public int getSc_1() {
            return sc_1;
      }

      public void setSc_1(int sc_1) {
            this.sc_1 = sc_1;
      }

      public int getSc_2() {
            return sc_2;
      }

      public void setSc_2(int sc_2) {
            this.sc_2 = sc_2;
      }

      public int getSc_3() {
            return sc_3;
      }

      public void setSc_3(int sc_3) {
            this.sc_3 = sc_3;
      }

      public int getSc_4() {
            return sc_4;
      }

      public void setSc_4(int sc_4) {
            this.sc_4 = sc_4;
      }

      public int getSc_5() {
            return sc_5;
      }

      public void setSc_5(int sc_5) {
            this.sc_5 = sc_5;
      }

      public int getSc_6() {
            return sc_6;
      }

      public void setSc_6(int sc_6) {
            this.sc_6 = sc_6;
      }

      public int getSc_7() {
            return sc_7;
      }

      public void setSc_7(int sc_7) {
            this.sc_7 = sc_7;
      }

      public Long getId_sc() {
            return id_sc;
      }

      public void setId_sc(Long id_sc) {
            this.id_sc = id_sc;
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
