package com.example.inpost.services;

import io.qameta.allure.Allure;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.stereotype.Service;

@Service
public class AllureAttachmentService {

    public void attachFileToAllureReport(File file) {
        try {
            Allure.addAttachment(file.getName(), "application/json", Files.newInputStream(file.toPath()), ".json");
        } catch (IOException e) {
            throw new RuntimeException("Failed to attach file to Allure report: " + file, e);
        }
    }
}
