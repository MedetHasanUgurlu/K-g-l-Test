package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage{
    By isSearchedCeketLocator = By.className("sg-col-inner");
    By isreducedDisplayLocator = By.cssSelector("p[class='product-image-badge-text']");
    List<WebElement> list = driver.findElements(By.cssSelector("a[class='pagination-item  ' ]"));
    List<WebElement> listforReducedProduct = driver.findElements(By.cssSelector("p[class='product-image-badge-text']"));

    List<WebElement> listOfSize = driver.findElements(By.cssSelector("a[class='variant-sizes__item js-variant-size js-variant']"));


    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public boolean isSearchedCeket() {
        return isDisplayed(isSearchedCeketLocator);

    }

    public void go2Page(){


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

       list.get(0).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        js.executeScript("window.scrollBy(0,6000)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    public void checkFirstReducedCeketRandomParam() {
        listforReducedProduct.get(0).click();
    }

    public boolean isReducedDisplay() {
        return isDisplayed(isreducedDisplayLocator);
    }

    public void selectRandomSize() {
        /*double x = listOfSize.size()-1;
        int random = (int) ((int) Math.random()*x);*/

        listOfSize.get(2).click();

    }
}
