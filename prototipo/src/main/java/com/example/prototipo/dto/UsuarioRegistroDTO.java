package com.example.prototipo.dto;

public class UsuarioRegistroDTO {
      
      private String nombre;
      private String contrasena;

      public UsuarioRegistroDTO(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      }      

      public UsuarioRegistroDTO() {
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
