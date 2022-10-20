package com.github.iurysalino.uploadfile.service.impl;

import com.github.iurysalino.uploadfile.dto.Agentes;
import com.github.iurysalino.uploadfile.dto.StatusResponse;
import com.github.iurysalino.uploadfile.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.util.Arrays;

@Service
public class ReadXmlFileServiceImpl implements FileService {
    @Override
    public void fileRead(MultipartFile[] file) throws IOException {

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(StatusResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            for (int i = 0; i < file.length; i++) {
                Agentes agentes = (Agentes) jaxbUnmarshaller.unmarshal(file[i].getInputStream());
                System.out.println("Documento: " + file[i].getOriginalFilename());
                Arrays.stream(agentes.getAgente()).forEach(x -> {
                    System.out.println(x.getCodigo());
                });
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

