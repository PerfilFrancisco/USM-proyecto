package com.example.prototipo.model;

public class Usuario {
      
      private String nombre;
      private String apellido;
      private String correo;
      private String rol;
      private String contrasena;

      public Usuario(){}

      // constructor usuario con solo nombre y contraseña
      public Usuario(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      }

      // constructor usuario completo
      public Usuario(String nombre, String apellido, String correo, String rol, String contrasena) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.rol = rol;
            this.contrasena = contrasena;            
      }
}
