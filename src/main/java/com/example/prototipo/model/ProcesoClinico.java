package com.example.prototipo.model;
import org.checkerframework.checker.units.qual.g;

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
@Table(name = "proceso_clinico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
      property = "id_proceso_clinico")
public class ProcesoClinico {
      
      @Column
      private int eficiencia_eficacia;
      private int seguridad_asistencial;
      private int centro_paciente;
      private int registro_clinico;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_proceso_clinico;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;
      

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador;

      public ProcesoClinico() {}

      public ProcesoClinico(int eficiencia_eficacia, int seguridad_asistencial, int centro_paciente,
                  int registro_clinico, Long id_proceso_clinico, Evaluacion evaluacion, Evaluador evaluador) {
            this.eficiencia_eficacia = eficiencia_eficacia;
            this.seguridad_asistencial = seguridad_asistencial;
            this.centro_paciente = centro_paciente;
            this.registro_clinico = registro_clinico;
            this.id_proceso_clinico = id_proceso_clinico;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getEficiencia_eficacia() {
            return eficiencia_eficacia;
      }

      public void setEficiencia_eficacia(int eficiencia_eficacia) {
            this.eficiencia_eficacia = eficiencia_eficacia;
      }

      public int getSeguridad_asistencial() {
            return seguridad_asistencial;
      }

      public void setSeguridad_asistencial(int seguridad_asistencial) {
            this.seguridad_asistencial = seguridad_asistencial;
      }

      public int getCentro_paciente() {
            return centro_paciente;
      }

      public void setCentro_paciente(int centro_paciente) {
            this.centro_paciente = centro_paciente;
      }

      public int getRegistro_clinico() {
            return registro_clinico;
      }

      public void setRegistro_clinico(int registro_clinico) {
            this.registro_clinico = registro_clinico;
      }

      public Long getId_proceso_clinico() {
            return id_proceso_clinico;
      }

      public void setId_proceso_clinico(Long id_proceso_clinico) {
            this.id_proceso_clinico = id_proceso_clinico;
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
