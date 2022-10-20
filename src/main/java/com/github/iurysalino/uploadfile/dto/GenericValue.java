package com.github.iurysalino.uploadfile.dto;

import javax.xml.bind.annotation.XmlElement;

public class GenericValue {
    protected double[] valor;

    @XmlElement
    public double[] getValor() {
        return valor;
    }

    public void setValor(double[] valor) {
        this.valor = valor;
    }
}
