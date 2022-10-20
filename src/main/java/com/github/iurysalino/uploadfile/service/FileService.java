package com.github.iurysalino.uploadfile.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@Service
public interface FileService {
    void fileRead(MultipartFile[] file) throws IOException, ParserConfigurationException, SAXException;
}
