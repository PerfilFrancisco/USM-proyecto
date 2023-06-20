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
@Table(name = "ua")
public class Ua {
      
      @Column
      private int ua_1;
      private int ua_2;
      private int ua_3;
      private int ua_4;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_ua;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;     

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Ua() {
      }

      public Ua(int ua_1, int ua_2, int ua_3, int ua_4, Long id_ua, Evaluacion evaluacion, Evaluador evaluador) {
            this.ua_1 = ua_1;
            this.ua_2 = ua_2;
            this.ua_3 = ua_3;
            this.ua_4 = ua_4;
            this.id_ua = id_ua;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getUa_1() {
            return ua_1;
      }

      public void setUa_1(int ua_1) {
            this.ua_1 = ua_1;
      }

      public int getUa_2() {
            return ua_2;
      }

      public void setUa_2(int ua_2) {
            this.ua_2 = ua_2;
      }

      public int getUa_3() {
            return ua_3;
      }

      public void setUa_3(int ua_3) {
            this.ua_3 = ua_3;
      }

      public int getUa_4() {
            return ua_4;
      }

      public void setUa_4(int ua_4) {
            this.ua_4 = ua_4;
      }

      public Long getId_ua() {
            return id_ua;
      }

      public void setId_ua(Long id_ua) {
            this.id_ua = id_ua;
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
