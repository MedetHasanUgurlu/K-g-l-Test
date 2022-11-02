package com.example.testkigili;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductPage;

public class TestMestKest extends BaseTest{
    HomePage homePage;
    ProductPage productPage;

    @Test
    @Order(1)
    public void checkURL() throws InterruptedException {


        Assertions.assertTrue(driver.getCurrentUrl()!=null,"Url dont found");
    }
    @Test
    @Order(2)
    public void searchCeket() {
        homePage = new HomePage(driver);
        driver.manage().deleteAllCookies();
        homePage.search("Ceket");
        //Assertions.assertTrue(productPage.isSearchedCeket(),"Ceket is not valid");

    }
    @Test
    @Order(3)
    public void checkSecondPage() {
        productPage = new ProductPage(driver);
        driver.manage().deleteAllCookies();
        productPage.go2Page();

    }
    @Test
    @Order(4)
    public void checkFirstReducedCeketRandomParam() {
        driver.manage().deleteAllCookies();
        productPage = new ProductPage(driver);
        productPage.checkFirstReducedCeketRandomParam();
        Assertions.assertTrue(productPage.isReducedDisplay(),"not found");
    }
    @Test
    @Order(5)
    public void checkReducedOldPrice(){
        driver.manage().deleteAllCookies();
        productPage = new ProductPage(driver);
        productPage.selectRandomSize();

    }
    public void checkSumbitandLogo(){

    }
}
