package com.example.prototipo.model;
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
@Table(name = "ac")
public class Ac {
      
      @Column
      private int ac_1;
      private int ac_2;
      private int ac_3;
      private int ac_4;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_ac;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Ac(){}

      public Ac(int ac_1, int ac_2, int ac_3, int ac_4, Long id_ac, Evaluacion evaluacion, Evaluador evaluador) {
            this.ac_1 = ac_1;
            this.ac_2 = ac_2;
            this.ac_3 = ac_3;
            this.ac_4 = ac_4;
            this.id_ac = id_ac;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getAc_1() {
            return ac_1;
      }

      public void setAc_1(int ac_1) {
            this.ac_1 = ac_1;
      }

      public int getAc_2() {
            return ac_2;
      }

      public void setAc_2(int ac_2) {
            this.ac_2 = ac_2;
      }

      public int getAc_3() {
            return ac_3;
      }

      public void setAc_3(int ac_3) {
            this.ac_3 = ac_3;
      }

      public int getAc_4() {
            return ac_4;
      }

      public void setAc_4(int ac_4) {
            this.ac_4 = ac_4;
      }

      public Long getId_ac() {
            return id_ac;
      }

      public void setId_ac(Long id_ac) {
            this.id_ac = id_ac;
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
