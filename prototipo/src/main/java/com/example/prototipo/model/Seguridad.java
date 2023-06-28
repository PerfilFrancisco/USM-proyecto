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
@Table(name = "seguridad")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
      property = "id_seguridad")
public class Seguridad {
      
      @Column
      private int autenticacion;
      private int autorizacion;
      private int criptografia;
      private int gestion_contrasenas;
      private int integridad;
      private int autenticidad;
      private int gestion_riesgo;
      private int documentacion;

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id_seguridad;
      
      @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")      
      private Evaluacion evaluacion;


      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Seguridad() {
      }

      public Seguridad(int autenticacion, int autorizacion, int criptografia, int gestion_contrasenas, int integridad,
                  int autenticidad, int gestion_riesgo, int documentacion, Long id_seguridad, Evaluacion evaluacion,
                  Evaluador evaluador) {
            this.autenticacion = autenticacion;
            this.autorizacion = autorizacion;
            this.criptografia = criptografia;
            this.gestion_contrasenas = gestion_contrasenas;
            this.integridad = integridad;
            this.autenticidad = autenticidad;
            this.gestion_riesgo = gestion_riesgo;
            this.documentacion = documentacion;
            this.id_seguridad = id_seguridad;
            this.evaluacion = evaluacion;
            this.evaluador = evaluador;
      }

      public int getAutenticacion() {
            return autenticacion;
      }

      public void setAutenticacion(int autenticacion) {
            this.autenticacion = autenticacion;
      }

      public int getAutorizacion() {
            return autorizacion;
      }

      public void setAutorizacion(int autorizacion) {
            this.autorizacion = autorizacion;
      }

      public int getCriptografia() {
            return criptografia;
      }

      public void setCriptografia(int criptografia) {
            this.criptografia = criptografia;
      }

      public int getGestion_contrasenas() {
            return gestion_contrasenas;
      }

      public void setGestion_contrasenas(int gestion_contrasenas) {
            this.gestion_contrasenas = gestion_contrasenas;
      }

      public int getIntegridad() {
            return integridad;
      }

      public void setIntegridad(int integridad) {
            this.integridad = integridad;
      }

      public int getAutenticidad() {
            return autenticidad;
      }

      public void setAutenticidad(int autenticidad) {
            this.autenticidad = autenticidad;
      }

      public int getGestion_riesgo() {
            return gestion_riesgo;
      }

      public void setGestion_riesgo(int gestion_riesgo) {
            this.gestion_riesgo = gestion_riesgo;
      }

      public int getDocumentacion() {
            return documentacion;
      }

      public void setDocumentacion(int documentacion) {
            this.documentacion = documentacion;
      }

      public Long getId_seguridad() {
            return id_seguridad;
      }

      public void setId_seguridad(Long id_seguridad) {
            this.id_seguridad = id_seguridad;
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