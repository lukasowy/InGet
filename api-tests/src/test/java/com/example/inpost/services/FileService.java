package com.example.inpost.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.List;

@Service
public class FileService {

    public File saveDataToFile(List<?> data, String fileName, String directory) throws IOException {
        String formatFileName = formatFileName(fileName);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Path directoryPath = Paths.get(directory);
        Files.createDirectories(directoryPath);

        File file = new File(directoryPath.resolve(formatFileName).toString());
        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(data, writer);
        }
        return file;
    }

    private String formatFileName(String fileName) {
        String normalized = Normalizer.normalize(fileName, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("[^\\p{ASCII}]", "");
        normalized = normalized.replaceAll("\\s+", "_");

        return normalized;
    }
}
