package com.example.prototipo.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rte")
public class Rte {

      @Column
      private int rte_1;
      private int rte_2;
      private int rte_3;
      private int rte_4;
      
      @Id
      @Column
      private Long id_rte;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")
      private Empresa empresa;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Rte() {
      }

      public Rte(int rte_1, int rte_2, int rte_3, int rte_4, Long id_rte, Empresa empresa, Evaluador evaluador) {
            this.rte_1 = rte_1;
            this.rte_2 = rte_2;
            this.rte_3 = rte_3;
            this.rte_4 = rte_4;
            this.id_rte = id_rte;
            this.empresa = empresa;
            this.evaluador = evaluador;
      }

      public int getRte_1() {
            return rte_1;
      }

      public void setRte_1(int rte_1) {
            this.rte_1 = rte_1;
      }

      public int getRte_2() {
            return rte_2;
      }

      public void setRte_2(int rte_2) {
            this.rte_2 = rte_2;
      }

      public int getRte_3() {
            return rte_3;
      }

      public void setRte_3(int rte_3) {
            this.rte_3 = rte_3;
      }

      public int getRte_4() {
            return rte_4;
      }

      public void setRte_4(int rte_4) {
            this.rte_4 = rte_4;
      }

      public Long getId_rte() {
            return id_rte;
      }

      public void setId_rte(Long id_rte) {
            this.id_rte = id_rte;
      }

      public Empresa getEmpresa() {
            return empresa;
      }

      public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
      }

      public Evaluador getEvaluador() {
            return evaluador;
      }

      public void setEvaluador(Evaluador evaluador) {
            this.evaluador = evaluador;
      }
      
}
