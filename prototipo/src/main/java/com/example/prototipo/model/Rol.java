package com.example.prototipo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

      @Column
      private String nombre;

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      public String getNombre() {
            return nombre;
      }
      public void setNombre(String nombre) {
            this.nombre = nombre;
      }
      public Long getId() {
            return id;
      }
      public void setId(Long id) {
            this.id = id;
      }
      public Rol() {
      }
      public Rol(String nombre, Long id) {
            this.nombre = nombre;
            this.id = id;
      }
      public Rol(String nombre) {
            this.nombre = nombre;
      }
      
}
