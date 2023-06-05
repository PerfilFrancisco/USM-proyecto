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

      @Id
      @Column
      private Long id_pc;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Pc() {
      }

      public Pc(int pc_1, Long id_pc, Evaluacion evaluacion, Evaluador evaluador) {
            this.pc_1 = pc_1;
            this.id_pc = id_pc;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getPc_1() {
            return pc_1;
      }

      public void setPc_1(int pc_1) {
            this.pc_1 = pc_1;
      }

      public Long getId_pc() {
            return id_pc;
      }

      public void setId_pc(Long id_pc) {
            this.id_pc = id_pc;
      }

      public Evaluacion getEvaluacion() {
            return evaluacion;
      }

      public void setEvaluacion(Evaluacion evaluacion) {
            this.evaluacion = evaluacion;
      }

      public Evaluador getEvaluador() {
            return evaluador;
      }

      public void setEvaluador(Evaluador evaluador) {
            this.evaluador = evaluador;
      }


}
