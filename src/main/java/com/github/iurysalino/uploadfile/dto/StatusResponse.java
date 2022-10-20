package com.github.iurysalino.uploadfile.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusResponse {
    Agentes agentes;

    @XmlElement
    public Agentes getAgentes() {
        return agentes;
    }

    public void setAgentes(Agentes agentes) {
        this.agentes = agentes;
    }
}
