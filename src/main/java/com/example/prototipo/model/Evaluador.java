package com.example.prototipo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluador")
public class Evaluador {
      
      @Column(length = 45)
      private String nombre;      
      private String apellido;                  
      private String rol;      
      private String contrasena;    

      @Id 
      @Column(length = 45)
      private String correo;


      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Ac> acs;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Compatibilidad> compatibilidades;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Fiabilidad> fiabilidades;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Pc> pcs;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<ProcesoClinico> procesosClinicos;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Ra> ras;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Rte> rtes;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Sc> scs;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Seguridad> seguridades;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Ua> uas;

      @OneToMany(mappedBy = "evaluador", cascade = CascadeType.ALL)
      private List<Usabilidad> usabilidades;      

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "rutEmpresa")
      private Empresa empresa;

      public Evaluador(){}

      public Evaluador(String nombre, String contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
      }

      public Evaluador(String nombre, String apellido, String correo, String rol, String contrasena) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.rol = rol;
            this.contrasena = contrasena;            
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
