package com.example.inpost.config;


import com.example.inpost.GuiInPostApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = GuiInPostApplication.class)
public class CucumberSpringConfiguration {
}