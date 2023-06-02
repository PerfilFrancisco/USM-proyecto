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
@Table(name = "fiabilidad")
public class Fiabilidad {
      
      @Column
      private int eficiencia_desempeno;
      private int tolerancia_fallos;
      private int capacidad_recuperacion;
      private int arquitectura;
      private int otros_aspectos;

      @Id
      @Column
      private Long id_fiabilidad;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")      
      private Empresa empresa;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador;

      public Fiabilidad() {
      }

      public Fiabilidad(int eficiencia_desempeno, int tolerancia_fallos, int capacidad_recuperacion, int arquitectura,
                  int otros_aspectos, Long id_fiabilidad, Empresa empresa, Evaluador evaluador) {
            this.eficiencia_desempeno = eficiencia_desempeno;
            this.tolerancia_fallos = tolerancia_fallos;
            this.capacidad_recuperacion = capacidad_recuperacion;
            this.arquitectura = arquitectura;
            this.otros_aspectos = otros_aspectos;
            this.id_fiabilidad = id_fiabilidad;
            this.empresa = empresa;
            this.evaluador = evaluador;
      }

      public int getEficiencia_desempeno() {
            return eficiencia_desempeno;
      }

      public void setEficiencia_desempeno(int eficiencia_desempeno) {
            this.eficiencia_desempeno = eficiencia_desempeno;
      }

      public int getTolerancia_fallos() {
            return tolerancia_fallos;
      }

      public void setTolerancia_fallos(int tolerancia_fallos) {
            this.tolerancia_fallos = tolerancia_fallos;
      }

      public int getCapacidad_recuperacion() {
            return capacidad_recuperacion;
      }

      public void setCapacidad_recuperacion(int capacidad_recuperacion) {
            this.capacidad_recuperacion = capacidad_recuperacion;
      }

      public int getArquitectura() {
            return arquitectura;
      }

      public void setArquitectura(int arquitectura) {
            this.arquitectura = arquitectura;
      }

      public int getOtros_aspectos() {
            return otros_aspectos;
      }

      public void setOtros_aspectos(int otros_aspectos) {
            this.otros_aspectos = otros_aspectos;
      }

      public Long getId_fiabilidad() {
            return id_fiabilidad;
      }

      public void setId_fiabilidad(Long id_fiabilidad) {
            this.id_fiabilidad = id_fiabilidad;
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
