package com.github.iurysalino.uploadfile.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Agentes {
    private Agente[] agente;

    @XmlElement
    public Agente[] getAgente() {
        return agente;
    }

    public void setAgente(Agente[] agente) {
        this.agente = agente;
    }
}
