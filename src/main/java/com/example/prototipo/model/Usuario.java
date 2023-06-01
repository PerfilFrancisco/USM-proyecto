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
@Table(name = "usuario")
public class Usuario {

      @Column(length = 45)
      private String nombre;      
      private String apellido;      
      private String correo;      
      private String rol;      
      private String contrasena;    

      @Id 
      @Column()
      private Long id_usuario;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;

      public Usuario(){}

      public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      }

      public Usuario(String nombre, String apellido, String correo, String rol, String contrasena, Empresa empresa) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.rol = rol;
            this.contrasena = contrasena;
            this.empresa = empresa;
      }

      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getApellido() {
            return apellido;
      }

      public void setApellido(String apellido) {
            this.apellido = apellido;
      }

      public String getCorreo() {
            return correo;
      }

      public void setCorreo(String correo) {
            this.correo = correo;
      }

      public String getRol() {
            return rol;
      }

      public void setRol(String rol) {
            this.rol = rol;
      }

      public String getContrasena() {
            return contrasena;
      }

      public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
      }

      public Empresa getEmpresa() {
            return empresa;
      }

      public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
      }
}
