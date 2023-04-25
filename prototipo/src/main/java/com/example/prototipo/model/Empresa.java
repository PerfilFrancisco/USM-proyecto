package com.example.prototipo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(length = 50)      
      private String correo;
      private String primer_nombre;
      private String segundo_nombre;
      private int telefono;
      private String rut_empresa;

      public Empresa() {
      }
      

      public Empresa( String correo, String primer_nombre, String segundo_nombre, int telefono,
                  String rut_empresa) {            
            this.correo = correo;
            this.primer_nombre = primer_nombre;
            this.segundo_nombre = segundo_nombre;
            this.telefono = telefono;
            this.rut_empresa = rut_empresa;
      }


      public Long getId() {
            return id;
      }

      public String getCorreo() {
            return correo;
      }

      public void setCorreo(String correo) {
            this.correo = correo;
      }

      public String getPrimer_nombre() {
            return primer_nombre;
      }

      public void setPrimer_nombre(String primer_nombre) {
            this.primer_nombre = primer_nombre;
      }

      public String getSegundo_nombre() {
            return segundo_nombre;
      }

      public void setSegundo_nombre(String segundo_nombre) {
            this.segundo_nombre = segundo_nombre;
      }

      public int getTelefono() {
            return telefono;
      }

      public void setTelefono(int telefono) {
            this.telefono = telefono;
      }

      public String getRut_empresa() {
            return rut_empresa;
      }

      public void setRut_empresa(String rut_empresa) {
            this.rut_empresa = rut_empresa;
      }

      public void setId(Long id) {
            this.id = id;
      }
      
}
