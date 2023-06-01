package com.example.prototipo.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{
       


      @Column(length = 45)      
      private String nombre_empresa;
      private String etapa_sello;
      private String email;
      private String nombre_contraparte;
      private String fecha_ingreso;
      private String rut_dni;
      private String razon_social;
      private String tipo_sello;

      @Temporal(TemporalType.DATE)
      private Date fecha_nda;
      private Date fAcceso_herramienta;
      private Date fCreacion_formulario;
      private Date fEnvio_formulario;
      private Date fecha_demostracion;
      private Date fEntrega_inf_evaluadores;
      private Date fEntrega_informe;
      private Date fEntrega_evidencia_final;
      private Date fIntegracion_fonasa;
      private Date fecha_otorgamiento;
      
      @Id
      @Column(length = 45)
      private String rut_empresa;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Usuario> usuarios;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Ac> acs;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Compatibilidad> compatibilidades;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Fiabilidad> fiabilidades;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Pc> pcs;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<ProcesoClinico> procesosClinicos;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Ra> ras;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Rte> rtes;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Sc> scs;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Seguridad> seguridades;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Ua> uas;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private List<Usabilidad> usabilidades;      


      public Empresa() {}      

      public Empresa(String nombre_empresa, String etapa_sello, String email, String nombre_contraparte,
                  String fecha_ingreso, String rut_dni, String razon_social, String tipo_sello, Date fecha_nda,
                  Date fAcceso_herramienta, Date fCreacion_formulario, Date fEnvio_formulario, Date fecha_demostracion,
                  Date fEntrega_inf_evaluadores, Date fEntrega_informe, Date fEntrega_evidencia_final,
                  Date fIntegracion_fonasa, Date fecha_otorgamiento, String rut_empresa) {
            this.nombre_empresa = nombre_empresa;
            this.etapa_sello = etapa_sello;
            this.email = email;
            this.nombre_contraparte = nombre_contraparte;
            this.fecha_ingreso = fecha_ingreso;
            this.rut_dni = rut_dni;
            this.razon_social = razon_social;
            this.tipo_sello = tipo_sello;
            this.fecha_nda = fecha_nda;
            this.fAcceso_herramienta = fAcceso_herramienta;
            this.fCreacion_formulario = fCreacion_formulario;
            this.fEnvio_formulario = fEnvio_formulario;
            this.fecha_demostracion = fecha_demostracion;
            this.fEntrega_inf_evaluadores = fEntrega_inf_evaluadores;
            this.fEntrega_informe = fEntrega_informe;
            this.fEntrega_evidencia_final = fEntrega_evidencia_final;
            this.fIntegracion_fonasa = fIntegracion_fonasa;
            this.fecha_otorgamiento = fecha_otorgamiento;
            
      }

      public String getNombre_empresa() {
            return nombre_empresa;
      }

      public void setNombre_empresa(String nombre_empresa) {
            this.nombre_empresa = nombre_empresa;
      }

      public String getEtapa_sello() {
            return etapa_sello;
      }

      public void setEtapa_sello(String etapa_sello) {
            this.etapa_sello = etapa_sello;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getNombre_contraparte() {
            return nombre_contraparte;
      }

      public void setNombre_contraparte(String nombre_contraparte) {
            this.nombre_contraparte = nombre_contraparte;
      }

      public String getFecha_ingreso() {
            return fecha_ingreso;
      }

      public void setFecha_ingreso(String fecha_ingreso) {
            this.fecha_ingreso = fecha_ingreso;
      }

      public String getRut_dni() {
            return rut_dni;
      }

      public void setRut_dni(String rut_dni) {
            this.rut_dni = rut_dni;
      }

      public String getRazon_social() {
            return razon_social;
      }

      public void setRazon_social(String razon_social) {
            this.razon_social = razon_social;
      }

      public String getTipo_sello() {
            return tipo_sello;
      }

      public void setTipo_sello(String tipo_sello) {
            this.tipo_sello = tipo_sello;
      }

      public Date getFecha_nda() {
            return fecha_nda;
      }

      public void setFecha_nda(Date fecha_nda) {
            this.fecha_nda = fecha_nda;
      }

      public Date getfAcceso_herramienta() {
            return fAcceso_herramienta;
      }

      public void setfAcceso_herramienta(Date fAcceso_herramienta) {
            this.fAcceso_herramienta = fAcceso_herramienta;
      }

      public Date getfCreacion_formulario() {
            return fCreacion_formulario;
      }

      public void setfCreacion_formulario(Date fCreacion_formulario) {
            this.fCreacion_formulario = fCreacion_formulario;
      }

      public Date getfEnvio_formulario() {
            return fEnvio_formulario;
      }

      public void setfEnvio_formulario(Date fEnvio_formulario) {
            this.fEnvio_formulario = fEnvio_formulario;
      }

      public Date getFecha_demostracion() {
            return fecha_demostracion;
      }

      public void setFecha_demostracion(Date fecha_demostracion) {
            this.fecha_demostracion = fecha_demostracion;
      }

      public Date getfEntrega_inf_evaluadores() {
            return fEntrega_inf_evaluadores;
      }

      public void setfEntrega_inf_evaluadores(Date fEntrega_inf_evaluadores) {
            this.fEntrega_inf_evaluadores = fEntrega_inf_evaluadores;
      }

      public Date getfEntrega_informe() {
            return fEntrega_informe;
      }

      public void setfEntrega_informe(Date fEntrega_informe) {
            this.fEntrega_informe = fEntrega_informe;
      }

      public Date getfEntrega_evidencia_final() {
            return fEntrega_evidencia_final;
      }

      public void setfEntrega_evidencia_final(Date fEntrega_evidencia_final) {
            this.fEntrega_evidencia_final = fEntrega_evidencia_final;
      }

      public Date getfIntegracion_fonasa() {
            return fIntegracion_fonasa;
      }

      public void setfIntegracion_fonasa(Date fIntegracion_fonasa) {
            this.fIntegracion_fonasa = fIntegracion_fonasa;
      }

      public Date getFecha_otorgamiento() {
            return fecha_otorgamiento;
      }

      public void setFecha_otorgamiento(Date fecha_otorgamiento) {
            this.fecha_otorgamiento = fecha_otorgamiento;
      }

}
