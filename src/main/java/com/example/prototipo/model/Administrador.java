package com.example.prototipo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

      @Column(length = 45)
      private String nombre;      
      private String apellido;      
      private String correo;      
      private String rol;      
      private String contrasena;    

      @Id 
      @Column()
      private Long id_usuario;

      @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Empresa> empresa;

      public Administrador(){}

      public Administrador(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      }      

      public Administrador(String nombre, String apellido, String correo, String rol, String contrasena,
                  Long id_usuario, List<Empresa> empresa) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.rol = rol;
            this.contrasena = contrasena;
            this.id_usuario = id_usuario;
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

}
