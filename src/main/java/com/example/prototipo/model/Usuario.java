package com.example.prototipo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

      @Column(length = 50)
      private String nombre;
      @Column(length = 50)
      private String contrasena;
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;




      public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      } 

      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getContrasena() {
            return contrasena;
      }

      public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
      }
      
}
