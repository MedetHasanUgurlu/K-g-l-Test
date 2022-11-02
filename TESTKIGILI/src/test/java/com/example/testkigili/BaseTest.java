package com.example.testkigili;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {

    WebDriver driver ;

    @BeforeAll
    public void setUp(){
        System.out.println("Test Inıtıalized.");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.kigili.com/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        System.out.println("Test terminated.");
        driver.quit();
    }

}