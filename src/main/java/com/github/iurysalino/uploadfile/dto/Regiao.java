package com.github.iurysalino.uploadfile.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Regiao {
    private Geracao geracao;
    private Compra compra;
    private PrecoMedio precoMedio;

    @XmlElement
    public Geracao getGeracao() {
        return geracao;
    }

    public void setGeracao(Geracao geracao) {
        this.geracao = geracao;
    }

    @XmlElement
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @XmlElement
    public PrecoMedio getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(PrecoMedio precoMedio) {
        this.precoMedio = precoMedio;
    }
}
