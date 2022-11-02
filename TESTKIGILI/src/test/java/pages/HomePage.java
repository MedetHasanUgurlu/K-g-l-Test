package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {




    By searchLocator = By.id("search-opened-input");
    By submitLocator = By.cssSelector("button[class='header__search-button']");


    public HomePage(WebDriver driver) {
        super(driver);

    }



    public boolean checkUrl() {
        return driver.getCurrentUrl()!=null;
    }


    public void search(String text) {
        driver.manage().deleteAllCookies();
        type(searchLocator,text);
        driver.findElement(By.id("search-opened-input")).sendKeys(Keys.ENTER);

        //click(submitLocator);


    }


}
