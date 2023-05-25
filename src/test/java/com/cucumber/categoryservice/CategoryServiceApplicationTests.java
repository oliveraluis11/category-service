package com.cucumber.categoryservice;

import com.cucumber.categoryservice.configuration.CucumberConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
@CucumberContextConfiguration
@SpringBootTest(classes = CucumberConfiguration.class)
class CategoryServiceApplicationTests {
}
