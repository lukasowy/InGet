package com.example.inpost.config;


import com.example.inpost.ApiInPostApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = ApiInPostApplication.class)
public class CucumberSpringConfiguration {
}