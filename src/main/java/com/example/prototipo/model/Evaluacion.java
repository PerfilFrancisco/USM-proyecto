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
      @JoinColumn(name = "idevaluacion")
      private List<Evaluador> evaluadores;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Ac> acs;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Pc> pcs;

      @OneToOne( cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Ra> ras;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Rte> rtes;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Sc> scs;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "idevaluacion")
      private List<Ua> uas;


      public Evaluacion() {
      }

      

      public Evaluacion(Long idevaluacion, Empresa empresa, Usabilidad formusa, Seguridad formsegu,
                  Compatibilidad formcompa, Fiabilidad formfia, ProcesoClinico formproce, List<Evaluador> evaluadores,
                  List<Ac> acs, List<Pc> pcs, List<Ra> ras, List<Rte> rtes, List<Sc> scs, List<Ua> uas) {
            this.idevaluacion = idevaluacion;
            this.empresa = empresa;
            this.formusa = formusa;
            this.formsegu = formsegu;
            this.formcompa = formcompa;
            this.formfia = formfia;
            this.formproce = formproce;
            this.evaluadores = evaluadores;
            this.acs = acs;
            this.pcs = pcs;
            this.ras = ras;
            this.rtes = rtes;
            this.scs = scs;
            this.uas = uas;
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


      public List<Ac> getAcs() {
            return acs;
      }


      public void setAcs(List<Ac> acs) {
            this.acs = acs;
      }


      public List<Pc> getPcs() {
            return pcs;
      }


      public void setPcs(List<Pc> pcs) {
            this.pcs = pcs;
      }


      public List<Ra> getRas() {
            return ras;
      }


      public void setRas(List<Ra> ras) {
            this.ras = ras;
      }


      public List<Rte> getRtes() {
            return rtes;
      }


      public void setRtes(List<Rte> rtes) {
            this.rtes = rtes;
      }


      public List<Sc> getScs() {
            return scs;
      }


      public void setScs(List<Sc> scs) {
            this.scs = scs;
      }


      public List<Ua> getUas() {
            return uas;
      }


      public void setUas(List<Ua> uas) {
            this.uas = uas;
      }

      

      
}
