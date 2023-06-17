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
@Table(name = "compatibilidad")
public class Compatibilidad {
      
      @Column
      private int interoperabilidad;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_compatibilidad;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;


      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador;      

      public Compatibilidad() {
      }

      public Compatibilidad(int interoperabilidad, Long id_compatibilidad, Evaluacion evaluacion, Evaluador evaluador) {
            this.interoperabilidad = interoperabilidad;
            this.id_compatibilidad = id_compatibilidad;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getInteroperabilidad() {
            return interoperabilidad;
      }

      public void setInteroperabilidad(int interoperabilidad) {
            this.interoperabilidad = interoperabilidad;
      }

      public Long getId_compatibilidad() {
            return id_compatibilidad;
      }

      public void setId_compatibilidad(Long id_compatibilidad) {
            this.id_compatibilidad = id_compatibilidad;
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
