package com.example.inpost.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ApiConfig {

    @Value("${api.base-uri}")
    private String baseUri;

    @Value("${api.per-page}")
    private int perPage;

    @Value("${file.save.directory}")
    private String fileSaveDirectory;
}
