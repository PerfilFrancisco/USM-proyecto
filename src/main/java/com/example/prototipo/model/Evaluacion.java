package com.example.prototipo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {

      @Id
      @Column(name = "idevaluacion")
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long idevaluacion;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "rutempresa")
      private Empresa empresa;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "id_usabilidad")
      private Usabilidad formusa;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "id_seguridad")
      private Seguridad formsegu;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "id_compatibilidad")
      private Compatibilidad formcompa;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "id_fiabilidad")
      private Fiabilidad formfia;

      @OneToOne(mappedBy = "evaluacion",cascade = CascadeType.ALL)
      @JoinColumn(name = "id_proceso_clinico")
      private ProcesoClinico formproce;

      // @OneToMany(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Evaluador> evaluadores;

      // @OneToOne(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Ac> acs;

      // @OneToOne(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Pc> pcs;

      // @OneToOne( cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Ra> ras;

      // @OneToOne(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Rte> rtes;

      // @OneToOne(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Sc> scs;

      // @OneToOne(cascade = CascadeType.ALL)
      // @JoinColumn(name = "idevaluacion")
      // private List<Ua> uas;


      public Evaluacion() {
      }

      public Evaluacion(Long idevaluacion, Empresa empresa, Usabilidad formusa, Seguridad formsegu,
                  Compatibilidad formcompa, Fiabilidad formfia, ProcesoClinico formproce) {
            this.idevaluacion = idevaluacion;
            this.empresa = empresa;
            this.formusa = formusa;
            this.formsegu = formsegu;
            this.formcompa = formcompa;
            this.formfia = formfia;
            this.formproce = formproce;
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


      
}
