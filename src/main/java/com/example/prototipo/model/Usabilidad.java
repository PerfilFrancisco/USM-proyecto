package com.example.prototipo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@Table(name = "usabilidad")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
      property = "id_usabilidad")
public class Usabilidad {
      
      @Column
      private int pruebas_usuario;
      private int errores_usuario;
      private int capacidad_aprendizaje;
      private int accesibilidad;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_usabilidad;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Usabilidad() {
      }

      public Usabilidad(int pruebas_usuario, int errores_usuario, int capacidad_aprendizaje, int accesibilidad,
                  Long id_usabilidad, Evaluacion evaluacion, Evaluador evaluador) {
            this.pruebas_usuario = pruebas_usuario;
            this.errores_usuario = errores_usuario;
            this.capacidad_aprendizaje = capacidad_aprendizaje;
            this.accesibilidad = accesibilidad;
            this.id_usabilidad = id_usabilidad;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getPruebas_usuario() {
            return pruebas_usuario;
      }

      public void setPruebas_usuario(int pruebas_usuario) {
            this.pruebas_usuario = pruebas_usuario;
      }

      public int getErrores_usuario() {
            return errores_usuario;
      }

      public void setErrores_usuario(int errores_usuario) {
            this.errores_usuario = errores_usuario;
      }

      public int getCapacidad_aprendizaje() {
            return capacidad_aprendizaje;
      }

      public void setCapacidad_aprendizaje(int capacidad_aprendizaje) {
            this.capacidad_aprendizaje = capacidad_aprendizaje;
      }

      public int getAccesibilidad() {
            return accesibilidad;
      }

      public void setAccesibilidad(int accesibilidad) {
            this.accesibilidad = accesibilidad;
      }

      public Long getId_usabilidad() {
            return id_usabilidad;
      }

      public void setId_usabilidad(Long id_usabilidad) {
            this.id_usabilidad = id_usabilidad;
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
