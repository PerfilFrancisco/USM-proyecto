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
@Table(name = "compatibilidad")
public class Compatibilidad {
      
      @Column
      private int interoperabilidad;

      @Id
      @Column
      private Long id_compatibilidad;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")      
      private Empresa empresa;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador;      

      public Compatibilidad() {
      }

      public Compatibilidad(int interoperabilidad, Long id_compatibilidad, Empresa empresa, Evaluador evaluador) {
            this.interoperabilidad = interoperabilidad;
            this.id_compatibilidad = id_compatibilidad;
            this.empresa = empresa;
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
