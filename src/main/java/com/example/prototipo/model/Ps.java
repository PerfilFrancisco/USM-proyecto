package com.example.prototipo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_ps;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Ps() {
      }

      public Ps(int ps_1, int ps_2, Long id_ps, Evaluacion evaluacion, Evaluador evaluador) {
            this.ps_1 = ps_1;
            this.ps_2 = ps_2;
            this.id_ps = id_ps;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getPs_1() {
            return ps_1;
      }

      public void setPs_1(int ps_1) {
            this.ps_1 = ps_1;
      }

      public int getPs_2() {
            return ps_2;
      }

      public void setPs_2(int ps_2) {
            this.ps_2 = ps_2;
      }

      public Long getId_ps() {
            return id_ps;
      }

      public void setId_ps(Long id_ps) {
            this.id_ps = id_ps;
      }

      public Evaluador getEvaluador() {
            return evaluador;
      }

      public void setEvaluador(Evaluador evaluador) {
            this.evaluador = evaluador;
      }
      
      public Evaluacion getEvaluacion() {
            return evaluacion;
      }

      public void setEvaluacion(Evaluacion evaluacion) {
            this.evaluacion = evaluacion;
      }
}
