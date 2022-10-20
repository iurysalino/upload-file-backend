package com.github.iurysalino.uploadfile.controller;

import com.github.iurysalino.uploadfile.service.impl.ReadXmlFileServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/upload-file")
public class FileController {

    private final ReadXmlFileServiceImpl fileService;

    public FileController(ReadXmlFileServiceImpl fileService) {
        this.fileService = fileService;
    }

    @PostMapping
    public void uploadFile(@RequestParam MultipartFile[] file) throws IOException {
        fileService.fileRead(file);
    }
}
