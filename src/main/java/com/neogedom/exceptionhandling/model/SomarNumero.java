package com.neogedom.exceptionhandling.model;

public class SomarNumero {

    private Integer soma;
    private Integer numero1;
    private Integer numero2;
   

    public SomarNumero(Integer numero1, Integer numero2) {
        this.soma = numero1+numero2;
    }

    public Integer getSoma() {
        return soma;
    }
}


  /*   private Integer numero1;
    private Integer numero2;
    private Integer soma;
    

    public SomarNumero() {
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    public Integer soma() {
        return soma;
    }

    public void setSoma(Integer soma) {
        this.soma = numero1+numero2;
    }
} */