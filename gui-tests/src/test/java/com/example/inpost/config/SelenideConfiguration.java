package com.example.inpost.config;

import com.codeborne.selenide.Configuration;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;


@org.springframework.context.annotation.Configuration
public class SelenideConfiguration {

    @Value("${selenide.remote:}")
    private String remoteUrl;

    @Value("${selenide.browser}")
    private String browser;

    @Value("${selenide.baseUrl}")
    private String baseUrl;

    @PostConstruct
    public void init() {
        if (!remoteUrl.isEmpty()) {
            Configuration.remote = remoteUrl;
        }
        Configuration.browser = browser;
        Configuration.baseUrl = baseUrl;
        Configuration.browserSize = "1920x1080";
    }
}
