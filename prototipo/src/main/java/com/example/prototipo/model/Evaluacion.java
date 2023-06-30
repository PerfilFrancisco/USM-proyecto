package com.example.prototipo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluacion")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
      property = "idevaluacion")
public class Evaluacion {

      @Id
      @Column(name = "idevaluacion")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long idevaluacion;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "rutempresa")      
      private Empresa empresa;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_usabilidad")
      private Usabilidad formusa;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_seguridad")
      private Seguridad formsegu;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_compatibilidad")
      private Compatibilidad formcompa;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_fiabilidad")
      private Fiabilidad formfia;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_proceso_clinico")
      private ProcesoClinico formproce;

      @OneToMany(cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")
      private List<Evaluador> evaluadores;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_ac")
      private Ac ac;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_pc")
      private Pc pc;

      @OneToOne( cascade = CascadeType.ALL)
      @JoinColumn(name = "id_ra")
      private Ra ra;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_rte")
      private Rte rte;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_sc")
      private Sc sc;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_ua")
      private Ua ua;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "id_ps")
      private Ps ps;

      public Evaluacion() {
      }

      

      public Evaluacion(Long idevaluacion, Empresa empresa, Usabilidad formusa, Seguridad formsegu,
                  Compatibilidad formcompa, Fiabilidad formfia, ProcesoClinico formproce, List<Evaluador> evaluadores,
                  Ac ac, Pc pc, Ra ra, Rte rte, Sc sc, Ua ua, Ps ps) {
            this.idevaluacion = idevaluacion;
            this.empresa = empresa;
            this.formusa = formusa;
            this.formsegu = formsegu;
            this.formcompa = formcompa;
            this.formfia = formfia;
            this.formproce = formproce;
            this.evaluadores = evaluadores;
            this.ac = ac;
            this.pc = pc;
            this.ra = ra;
            this.rte = rte;
            this.sc = sc;
            this.ua = ua;
            this.ps = ps;
      }

      @Override
      public String toString() {
      return "Evaluacion { " +
            "idevaluacion=" + idevaluacion + 
            ", empresa=" + empresa + 
            ", formusa=" + formusa + 
            ", formsegu=" + formsegu + 
            ", formcompa=" + formcompa +
            ", formfia=" + formfia +
            ", formproce=" + formproce +
            ", evaluadores=" + evaluadores +
            ", ac=" + ac +
            ", pc=" + pc +
            ", ra=" + ra +
            ", rte=" + rte +
            ", sc=" + sc +
            ", ua=" + ua +
            ", ps=" + ps +
            " }";
      }



      public Long getIdevaluacion() {
            return idevaluacion;
      }



      public void setIdevaluacion(Long idevaluacion) {
            this.idevaluacion = idevaluacion;
      }



      public Empresa getEmpresa() {
            return empresa;
      }



      public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
      }



      public Usabilidad getFormusa() {
            return formusa;
      }



      public void setFormusa(Usabilidad formusa) {
            this.formusa = formusa;
      }



      public Seguridad getFormsegu() {
            return formsegu;
      }



      public void setFormsegu(Seguridad formsegu) {
            this.formsegu = formsegu;
      }



      public Compatibilidad getFormcompa() {
            return formcompa;
      }



      public void setFormcompa(Compatibilidad formcompa) {
            this.formcompa = formcompa;
      }



      public Fiabilidad getFormfia() {
            return formfia;
      }



      public void setFormfia(Fiabilidad formfia) {
            this.formfia = formfia;
      }



      public ProcesoClinico getFormproce() {
            return formproce;
      }



      public void setFormproce(ProcesoClinico formproce) {
            this.formproce = formproce;
      }



      public List<Evaluador> getEvaluadores() {
            return evaluadores;
      }



      public void setEvaluadores(List<Evaluador> evaluadores) {
            this.evaluadores = evaluadores;
      }



      public Ac getAc() {
            return ac;
      }



      public void setAc(Ac ac) {
            this.ac = ac;
      }



      public Pc getPc() {
            return pc;
      }



      public void setPc(Pc pc) {
            this.pc = pc;
      }



      public Ra getRa() {
            return ra;
      }



      public void setRa(Ra ra) {
            this.ra = ra;
      }



      public Rte getRte() {
            return rte;
      }



      public void setRte(Rte rte) {
            this.rte = rte;
      }



      public Sc getSc() {
            return sc;
      }



      public void setSc(Sc sc) {
            this.sc = sc;
      }



      public Ua getUa() {
            return ua;
      }



      public void setUa(Ua ua) {
            this.ua = ua;
      }



      public Ps getPs() {
            return ps;
      }



      public void setPs(Ps ps) {
            this.ps = ps;
      }

      
}
