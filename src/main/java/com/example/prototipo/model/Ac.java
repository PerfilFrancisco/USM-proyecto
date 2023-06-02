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
@Table(name = "ac")
public class Ac {
      
      @Column
      private int ac_1;
      private int ac_2;
      private int ac_3;
      private int ac_4;

      @Id
      @Column
      private Long id_ac;
      
      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "rut_empresa")      
      private Empresa empresa;

      @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
      @JoinColumn(name = "correo")      
      private Evaluador evaluador; 

      public Ac(){}

      public Ac(int ac_1, int ac_2, int ac_3, int ac_4, Empresa empresa) {
            this.ac_1 = ac_1;
            this.ac_2 = ac_2;
            this.ac_3 = ac_3;
            this.ac_4 = ac_4;
            this.empresa = empresa;
      }

      public int getAc_1() {
            return ac_1;
      }

      public void setAc_1(int ac_1) {
            this.ac_1 = ac_1;
      }

      public int getAc_2() {
            return ac_2;
      }

      public void setAc_2(int ac_2) {
            this.ac_2 = ac_2;
      }

      public int getAc_3() {
            return ac_3;
      }

      public void setAc_3(int ac_3) {
            this.ac_3 = ac_3;
      }

      public int getAc_4() {
            return ac_4;
      }

      public void setAc_4(int ac_4) {
            this.ac_4 = ac_4;
      }

      public Empresa getEmpresa() {
            return empresa;
      }

      public void setEmpresa(Empresa empresa) {
            this.empresa = empresa;
      }
  
}
